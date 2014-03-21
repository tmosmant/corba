package fr.upem.robot;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "RobotPilote".
 *
 * @author JacORB IDL compiler V 3.3
 * @version generated at 21 mars 2014 15:35:08
 */

public class RobotPilotePOATie
	extends RobotPilotePOA
{
	private RobotPiloteOperations _delegate;

	private POA _poa;
	public RobotPilotePOATie(RobotPiloteOperations delegate)
	{
		_delegate = delegate;
	}
	public RobotPilotePOATie(RobotPiloteOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public fr.upem.robot.RobotPilote _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		fr.upem.robot.RobotPilote __r = fr.upem.robot.RobotPiloteHelper.narrow(__o);
		return __r;
	}
	public fr.upem.robot.RobotPilote _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		fr.upem.robot.RobotPilote __r = fr.upem.robot.RobotPiloteHelper.narrow(__o);
		return __r;
	}
	public RobotPiloteOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(RobotPiloteOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		return super._default_POA();
	}
	public void move(fr.upem.robot.Position pos) throws fr.upem.robot.InvalidPosition
	{
_delegate.move(pos);
	}

	public void start() throws fr.upem.robot.AlreadyStarted
	{
_delegate.start();
	}

	public void stop(fr.upem.robot.PositionHolder pos) throws fr.upem.robot.NotStarted
	{
_delegate.stop(pos);
	}

	public fr.upem.robot.Position robotPosition()
	{
		return _delegate.robotPosition();
	}

}
