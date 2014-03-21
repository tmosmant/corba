package fr.upem.robot.client;

import fr.upem.robot.*;
import org.omg.CORBA.Any;
import org.omg.CORBA.ORB;
import org.omg.CORBA.TypeCode;

public class Client {

    public static void main(String[] args) throws Exception {
        ORB orb = ORB.init(args, null);

        String IORRobotPilote = args[0];
        String IORRobotControl = args[1];

        org.omg.CORBA.Object refRobotPilote = orb.string_to_object(IORRobotPilote);
        org.omg.CORBA.Object refRobotControle = orb.string_to_object(IORRobotControl);

        RobotPilote robotPilote = RobotPiloteHelper.narrow(refRobotPilote);
        RobotControl robotControl = RobotControlHelper.narrow(refRobotControle);

        Any anySensor = orb.create_any();
        SensorA sensorA = new SensorA("sensor A1");
        SensorAHelper.insert(anySensor, sensorA);
        robotControl.setSensor("sensor A1", anySensor);

        anySensor = robotControl.getSensor("sensor A1");
        TypeCode tc = anySensor.type();
        if (tc.equal(SensorAHelper.type())) {
            SensorA tmp = SensorAHelper.extract(anySensor);
            System.out.println("Name : " + tmp.name);
        } else if (tc.equal(SensorBHelper.type())) {
            SensorB tmp = SensorBHelper.extract(anySensor);
            System.out.println("Name : " + tmp.name);
        } else if (tc.equal(SensorCHelper.type())) {
            SensorC tmp = SensorCHelper.extract(anySensor);
            System.out.println("Name : " + tmp.name);
        }

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
