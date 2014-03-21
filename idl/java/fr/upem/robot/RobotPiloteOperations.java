package fr.upem.robot;


/**
 * Generated from IDL interface "RobotPilote".
 *
 * @author JacORB IDL compiler V 3.3
 * @version generated at 21 mars 2014 15:35:08
 */

public interface RobotPiloteOperations
{
	/* constants */
	/* operations  */
	fr.upem.robot.Position robotPosition();
	void start() throws fr.upem.robot.AlreadyStarted;
	void move(fr.upem.robot.Position pos) throws fr.upem.robot.InvalidPosition;
	void stop(fr.upem.robot.PositionHolder pos) throws fr.upem.robot.NotStarted;
}
