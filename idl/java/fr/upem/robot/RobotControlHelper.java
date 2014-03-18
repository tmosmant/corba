package fr.upem.robot;

/**
 * Generated from IDL interface "RobotControl".
 * 
 * @author JacORB IDL compiler V 3.3
 * @version generated at 4 mars 2014 15:37:52
 */

public abstract class RobotControlHelper {
	private volatile static org.omg.CORBA.TypeCode _type;

	public static org.omg.CORBA.TypeCode type() {
		if (_type == null) {
			synchronized (RobotControlHelper.class) {
				if (_type == null) {
					_type = org.omg.CORBA.ORB.init().create_interface_tc(
							"IDL:fr/upem/robot/RobotControl:1.0",
							"RobotControl");
				}
			}
		}
		return _type;
	}

	public static void insert(final org.omg.CORBA.Any any,
			final fr.upem.robot.RobotControl s) {
		any.insert_Object(s);
	}

	public static fr.upem.robot.RobotControl extract(final org.omg.CORBA.Any any) {
		return narrow(any.extract_Object());
	}

	public static String id() {
		return "IDL:fr/upem/robot/RobotControl:1.0";
	}

	public static RobotControl read(final org.omg.CORBA.portable.InputStream in) {
		return narrow(in.read_Object(fr.upem.robot._RobotControlStub.class));
	}

	public static void write(final org.omg.CORBA.portable.OutputStream _out,
			final fr.upem.robot.RobotControl s) {
		_out.write_Object(s);
	}

	public static fr.upem.robot.RobotControl narrow(
			final org.omg.CORBA.Object obj) {
		if (obj == null) {
			return null;
		} else if (obj instanceof fr.upem.robot.RobotControl) {
			return (fr.upem.robot.RobotControl) obj;
		} else if (obj._is_a("IDL:fr/upem/robot/RobotControl:1.0")) {
			fr.upem.robot._RobotControlStub stub;
			stub = new fr.upem.robot._RobotControlStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl) obj)
					._get_delegate());
			return stub;
		} else {
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}

	public static fr.upem.robot.RobotControl unchecked_narrow(
			final org.omg.CORBA.Object obj) {
		if (obj == null) {
			return null;
		} else if (obj instanceof fr.upem.robot.RobotControl) {
			return (fr.upem.robot.RobotControl) obj;
		} else {
			fr.upem.robot._RobotControlStub stub;
			stub = new fr.upem.robot._RobotControlStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl) obj)
					._get_delegate());
			return stub;
		}
	}
}
