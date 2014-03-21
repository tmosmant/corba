package fr.upem.robot;


/**
 * Generated from IDL interface "RobotControl".
 *
 * @author JacORB IDL compiler V 3.3
 * @version generated at 21 mars 2014 15:35:08
 */

public abstract class RobotControlPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, fr.upem.robot.RobotControlOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "_set_maxPosition", Integer.valueOf(0));
		m_opsHash.put ( "getSensors", Integer.valueOf(1));
		m_opsHash.put ( "getSensor", Integer.valueOf(2));
		m_opsHash.put ( "_get_maxPosition", Integer.valueOf(3));
		m_opsHash.put ( "setSensor", Integer.valueOf(4));
	}
	private String[] ids = {"IDL:fr/upem/robot/RobotControl:1.0"};
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
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		org.omg.CORBA.portable.OutputStream _out = null;
		// do something
		// quick lookup of operation
		java.lang.Integer opsIndex = (java.lang.Integer)m_opsHash.get ( method );
		if ( null == opsIndex )
			throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
		switch ( opsIndex.intValue() )
		{
			case 0: // _set_maxPosition
			{
			_out = handler.createReply();
			maxPosition(fr.upem.robot.PositionHelper.read(_input));
				break;
			}
			case 1: // getSensors
			{
				_out = handler.createReply();
				fr.upem.robot.SensorSetHelper.write(_out,getSensors());
				break;
			}
			case 2: // getSensor
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				_out = handler.createReply();
				_out.write_any(getSensor(_arg0));
			}
			catch(fr.upem.robot.Reject _ex0)
			{
				_out = handler.createExceptionReply();
				fr.upem.robot.RejectHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // _get_maxPosition
			{
			_out = handler.createReply();
			fr.upem.robot.PositionHelper.write(_out,maxPosition());
				break;
			}
			case 4: // setSensor
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				org.omg.CORBA.Any _arg1=_input.read_any();
				_out = handler.createReply();
				_out.write_boolean(setSensor(_arg0,_arg1));
			}
			catch(fr.upem.robot.Reject _ex0)
			{
				_out = handler.createExceptionReply();
				fr.upem.robot.RejectHelper.write(_out, _ex0);
			}
				break;
			}
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
