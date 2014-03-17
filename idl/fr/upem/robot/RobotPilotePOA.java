package fr.upem.robot;

/**
 * Generated from IDL interface "RobotPilote".
 * 
 * @author JacORB IDL compiler V 3.3
 * @version generated at 4 mars 2014 15:37:52
 */

public abstract class RobotPilotePOA extends org.omg.PortableServer.Servant
		implements org.omg.CORBA.portable.InvokeHandler,
		fr.upem.robot.RobotPiloteOperations {
	static private final java.util.HashMap<String, Integer> m_opsHash = new java.util.HashMap<String, Integer>();
	static {
		m_opsHash.put("move", Integer.valueOf(0));
		m_opsHash.put("start", Integer.valueOf(1));
		m_opsHash.put("stop", Integer.valueOf(2));
		m_opsHash.put("_get_robotPosition", Integer.valueOf(3));
	}
	private String[] ids = { "IDL:fr/upem/robot/RobotPilote:1.0" };

	public fr.upem.robot.RobotPilote _this() {
		org.omg.CORBA.Object __o = _this_object();
		fr.upem.robot.RobotPilote __r = fr.upem.robot.RobotPiloteHelper
				.narrow(__o);
		return __r;
	}

	public fr.upem.robot.RobotPilote _this(org.omg.CORBA.ORB orb) {
		org.omg.CORBA.Object __o = _this_object(orb);
		fr.upem.robot.RobotPilote __r = fr.upem.robot.RobotPiloteHelper
				.narrow(__o);
		return __r;
	}

	public org.omg.CORBA.portable.OutputStream _invoke(String method,
			org.omg.CORBA.portable.InputStream _input,
			org.omg.CORBA.portable.ResponseHandler handler)
			throws org.omg.CORBA.SystemException {
		org.omg.CORBA.portable.OutputStream _out = null;
		// do something
		// quick lookup of operation
		java.lang.Integer opsIndex = (java.lang.Integer) m_opsHash.get(method);
		if (null == opsIndex)
			throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
		switch (opsIndex.intValue()) {
		case 0: // move
		{
			try {
				fr.upem.robot.Position _arg0 = fr.upem.robot.PositionHelper
						.read(_input);
				_out = handler.createReply();
				move(_arg0);
			} catch (fr.upem.robot.InvalidPosition _ex0) {
				_out = handler.createExceptionReply();
				fr.upem.robot.InvalidPositionHelper.write(_out, _ex0);
			}
			break;
		}
		case 1: // start
		{
			try {
				_out = handler.createReply();
				start();
			} catch (fr.upem.robot.AlreadyStarted _ex0) {
				_out = handler.createExceptionReply();
				fr.upem.robot.AlreadyStartedHelper.write(_out, _ex0);
			}
			break;
		}
		case 2: // stop
		{
			try {
				fr.upem.robot.PositionHolder _arg0 = new fr.upem.robot.PositionHolder();
				_out = handler.createReply();
				stop(_arg0);
				fr.upem.robot.PositionHelper.write(_out, _arg0.value);
			} catch (fr.upem.robot.NotStarted _ex0) {
				_out = handler.createExceptionReply();
				fr.upem.robot.NotStartedHelper.write(_out, _ex0);
			}
			break;
		}
		case 3: // _get_robotPosition
		{
			_out = handler.createReply();
			fr.upem.robot.PositionHelper.write(_out, robotPosition());
			break;
		}
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa,
			byte[] obj_id) {
		return ids;
	}
}
