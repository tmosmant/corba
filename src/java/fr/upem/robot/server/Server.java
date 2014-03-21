package fr.upem.robot.server;

import fr.upem.robot.RobotControlPOATie;
import fr.upem.robot.servant.RobotControlImpl;
import org.omg.CORBA.ORB;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

import fr.upem.robot.RobotPilotePOATie;
import fr.upem.robot.servant.RobotPiloteImpl;

public class Server {

	public static void main(String[] args) throws Exception {
		ORB orb = ORB.init(args, null);
		POA rootPOA = POAHelper.narrow(orb
				.resolve_initial_references("RootPOA"));

		RobotPiloteImpl robotPilote = new RobotPiloteImpl();
        RobotControlImpl robotControl = new RobotControlImpl();

		RobotPilotePOATie robotPilotePOATie = new RobotPilotePOATie(robotPilote);
        RobotControlPOATie robotControlPOATie = new RobotControlPOATie(robotControl);

        byte[] servantIdRobotPilote = rootPOA
                .activate_object(robotPilotePOATie);
        byte[] servantIdRobotControl = rootPOA
                .activate_object(robotControlPOATie);

		org.omg.CORBA.Object refRobotPilote = rootPOA.id_to_reference(servantIdRobotPilote);
		org.omg.CORBA.Object refRobotControl = rootPOA.id_to_reference(servantIdRobotControl);

		String iorRobotPilote = orb.object_to_string(refRobotPilote);
		String iorRobotControl = orb.object_to_string(refRobotControl);

		System.out.println("RobotPilote : " + iorRobotPilote);
		System.out.println("RobotControl : " + iorRobotControl);

		rootPOA.the_POAManager().activate();
		orb.run();
	}

}
