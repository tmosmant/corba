package fr.upem.robot.client;

import fr.upem.robot.*;
import org.omg.CORBA.ORB;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

public class Client {

	public static void main(String[] args) throws Exception {
		ORB orb = ORB.init(args, null);

		NamingContextExt namingContext = NamingContextExtHelper.narrow(orb.resolve_initial_references("NameService"));

        NameComponent[] nameComponentsRobotPilote = namingContext
                .to_name("RobotContext/RobotPilote");

        RobotPilote robotPilote = RobotPiloteHelper.narrow(namingContext.resolve(nameComponentsRobotPilote));
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
