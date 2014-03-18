package fr.upem.robot;

/**
 * Generated from IDL interface "RobotControl".
 * 
 * @author JacORB IDL compiler V 3.3
 * @version generated at 4 mars 2014 15:37:52
 */

public interface RobotControlOperations {
	/* constants */
	/* operations */
	fr.upem.robot.Position maxPosition();

	void maxPosition(fr.upem.robot.Position arg);

	org.omg.CORBA.Any getSensor(java.lang.String sensor);

	boolean setSensor(java.lang.String sensor, org.omg.CORBA.Any newSensor);

	org.omg.CORBA.Any[] getSensors();
}
