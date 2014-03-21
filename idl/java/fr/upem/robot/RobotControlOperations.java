package fr.upem.robot;


/**
 * Generated from IDL interface "RobotControl".
 *
 * @author JacORB IDL compiler V 3.3
 * @version generated at 21 mars 2014 15:35:08
 */

public interface RobotControlOperations
{
	/* constants */
	/* operations  */
	fr.upem.robot.Position maxPosition();
	void maxPosition(fr.upem.robot.Position arg);
	org.omg.CORBA.Any getSensor(java.lang.String sensor) throws fr.upem.robot.Reject;
	boolean setSensor(java.lang.String sensor, org.omg.CORBA.Any newSensor) throws fr.upem.robot.Reject;
	org.omg.CORBA.Any[] getSensors();
}
