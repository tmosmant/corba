package fr.upem.robot;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "RobotControl".
 *
 * @author JacORB IDL compiler V 3.3
 * @version generated at 21 mars 2014 15:35:08
 */

public class RobotControlPOATie
	extends RobotControlPOA
{
	private RobotControlOperations _delegate;

	private POA _poa;
	public RobotControlPOATie(RobotControlOperations delegate)
	{
		_delegate = delegate;
	}
	public RobotControlPOATie(RobotControlOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public fr.upem.robot.RobotControl _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		fr.upem.robot.RobotControl __r = fr.upem.robot.RobotControlHelper.narrow(__o);
		return __r;
	}
	public fr.upem.robot.RobotControl _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		fr.upem.robot.RobotControl __r = fr.upem.robot.RobotControlHelper.narrow(__o);
		return __r;
	}
	public RobotControlOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(RobotControlOperations delegate)
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
	public void maxPosition(fr.upem.robot.Position a)
	{
		_delegate.maxPosition(a);
	}

	public org.omg.CORBA.Any[] getSensors()
	{
		return _delegate.getSensors();
	}

	public org.omg.CORBA.Any getSensor(java.lang.String sensor) throws fr.upem.robot.Reject
	{
		return _delegate.getSensor(sensor);
	}

	public fr.upem.robot.Position maxPosition()
	{
		return _delegate.maxPosition();
	}

	public boolean setSensor(java.lang.String sensor, org.omg.CORBA.Any newSensor) throws fr.upem.robot.Reject
	{
		return _delegate.setSensor(sensor,newSensor);
	}

}
