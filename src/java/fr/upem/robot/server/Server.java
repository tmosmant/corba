package fr.upem.robot.server;

import fr.upem.robot.RobotControlPOATie;
import fr.upem.robot.RobotPilotePOATie;
import fr.upem.robot.servant.RobotControlImpl;
import fr.upem.robot.servant.RobotPiloteImpl;
import org.omg.CORBA.ORB;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.CosNaming.NamingContextPackage.AlreadyBound;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

public class Server {

    public static void main(String[] args) throws Exception {
//        Properties properties = new Properties();
//        properties
//                .put("org.omg.PortableInterceptor.ORBInitializerClass.fr.upem.robot.server.interceptor.InterceptorServerInit",
//                     "fr.upem.robot.server.interceptor.InterceptorServerInit");

        ORB orb = ORB.init(args, null);
        POA rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));

        RobotPiloteImpl robotPilote = new RobotPiloteImpl();
        RobotControlImpl robotControl = new RobotControlImpl();

        RobotPilotePOATie robotPilotePOATie = new RobotPilotePOATie(robotPilote);
        RobotControlPOATie robotControlPOATie = new RobotControlPOATie(robotControl);

        byte[] servantIdRobotPilote = rootPOA.activate_object(robotPilotePOATie);
        byte[] servntIdRobotControl = rootPOA.activate_object(robotControlPOATie);

        NamingContextExt context = NamingContextExtHelper.narrow(orb.resolve_initial_references("NameService"));
        try {
            context.bind_new_context(context.to_name("RobotContext"));
        } catch (AlreadyBound e) {
            context.rebind_context(context.to_name("RobotContext"), context);
        }

        NameComponent[] nameRobotPilote = context.to_name("RobotContext/RobotPilote");
        try {
            context.bind(nameRobotPilote, rootPOA.id_to_reference(servantIdRobotPilote));
        } catch (AlreadyBound e) {
            context.rebind(nameRobotPilote, rootPOA.id_to_reference(servantIdRobotPilote));
        }
        NameComponent[] nameRobotControl = context.to_name("RobotContext/RobotControl");
        try {
            context.bind(nameRobotControl, rootPOA.id_to_reference(servntIdRobotControl));
        } catch (AlreadyBound e) {
            context.rebind(nameRobotControl, rootPOA.id_to_reference(servntIdRobotControl));
        }

        rootPOA.the_POAManager().activate();
        orb.run();
    }

}