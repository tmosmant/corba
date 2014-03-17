package fr.upem.robot.client;

import org.omg.CORBA.ORB;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

import fr.upem.robot.AlreadyStarted;
import fr.upem.robot.InvalidPosition;
import fr.upem.robot.Position;
import fr.upem.robot.RobotPilote;
import fr.upem.robot.RobotPiloteHelper;

public class Client {

	public static void main(String[] args) throws Exception {
		ORB orb = ORB.init(args, null);

		NamingContextExt namingContext = NamingContextExtHelper.narrow(orb
				.resolve_initial_references("NameService"));

		NameComponent[] nameComponentsRobotPilote = namingContext
				.to_name("RobotContext/RobotPilote");

		RobotPilote robotPilote = RobotPiloteHelper.narrow(namingContext
				.resolve(nameComponentsRobotPilote));
		try {
			robotPilote.move(new Position(0, -1));
		} catch (InvalidPosition e) {
			System.out.println(e.message);
		}

		try {
			robotPilote.start();
		} catch (AlreadyStarted e) {
			System.out.println(e.message);
		}
	}

}
