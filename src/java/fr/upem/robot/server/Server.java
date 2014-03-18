package fr.upem.robot.server;

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
		RobotPilotePOATie robotPilotePOATie = new RobotPilotePOATie(robotPilote);

		byte[] servantIdRobotPilote = rootPOA
				.activate_object(robotPilotePOATie);

		org.omg.CORBA.Object ref = rootPOA.id_to_reference(servantIdRobotPilote);
		String ior = orb.object_to_string(ref);
		System.out.println(ior);

		rootPOA.the_POAManager().activate();
		orb.run();
	}

}
