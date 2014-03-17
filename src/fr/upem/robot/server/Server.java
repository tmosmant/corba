package fr.upem.robot.server;

import fr.upem.robot.RobotPilotePOATie;
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
		ORB orb = ORB.init(args, null);
		POA rootPOA = POAHelper.narrow(orb
				.resolve_initial_references("RootPOA"));

		RobotPiloteImpl robotPilote = new RobotPiloteImpl();
		RobotPilotePOATie robotPilotePOATie = new RobotPilotePOATie(robotPilote);

		byte[] servantIdRobotPilote = rootPOA
				.activate_object(robotPilotePOATie);

		NamingContextExt context = NamingContextExtHelper.narrow(orb
				.resolve_initial_references("NameService"));
		try {
			context.bind_new_context(context.to_name("RobotContext"));
		} catch (AlreadyBound e) {
			context.rebind_context(context.to_name("RobotContext"), context);
		}

		NameComponent[] nameRobotPilote = context
				.to_name("RobotContext/RobotPilote");
		try {
			context.bind(nameRobotPilote,
					rootPOA.id_to_reference(servantIdRobotPilote));
		} catch (AlreadyBound e) {
			context.rebind(nameRobotPilote,
					rootPOA.id_to_reference(servantIdRobotPilote));
		}

		rootPOA.the_POAManager().activate();
		orb.run();
	}

}
