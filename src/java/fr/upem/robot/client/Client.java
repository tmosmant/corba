package fr.upem.robot.client;

import fr.upem.robot.*;
import org.omg.CORBA.Any;
import org.omg.CORBA.ORB;
import org.omg.CORBA.TypeCode;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

public class Client {

    public static void main(String[] args) throws Exception {
//        Properties properties = new Properties();
//        properties
//                .put("org.omg.PortableInterceptor.ORBInitializerClass.fr.upem.robot.client.interceptor.InterceptorClientInit",
//                     "fr.upem.robot.client.interceptor.InterceptorClientInit");

        ORB orb = ORB.init(args, null);

        NamingContextExt namingContext = NamingContextExtHelper.narrow(orb.resolve_initial_references("NameService"));

        NameComponent[] nameRobotPilote = namingContext.to_name("RobotContext/RobotPilote");
        NameComponent[] nameRobotControl = namingContext.to_name("RobotContext/RobotControl");

        RobotPilote robotPilote = RobotPiloteHelper.narrow(namingContext.resolve(nameRobotPilote));
        RobotControl robotControl = RobotControlHelper.narrow(namingContext.resolve(nameRobotControl));

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
