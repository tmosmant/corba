package fr.upem.robot;

/**
 * Generated from IDL interface "RobotPilote".
 * 
 * @author JacORB IDL compiler V 3.3
 * @version generated at 4 mars 2014 15:37:52
 */

public abstract class RobotPiloteHelper {
	private volatile static org.omg.CORBA.TypeCode _type;

	public static org.omg.CORBA.TypeCode type() {
		if (_type == null) {
			synchronized (RobotPiloteHelper.class) {
				if (_type == null) {
					_type = org.omg.CORBA.ORB.init().create_interface_tc(
							"IDL:fr/upem/robot/RobotPilote:1.0", "RobotPilote");
				}
			}
		}
		return _type;
	}

	public static void insert(final org.omg.CORBA.Any any,
			final fr.upem.robot.RobotPilote s) {
		any.insert_Object(s);
	}

	public static fr.upem.robot.RobotPilote extract(final org.omg.CORBA.Any any) {
		return narrow(any.extract_Object());
	}

	public static String id() {
		return "IDL:fr/upem/robot/RobotPilote:1.0";
	}

	public static RobotPilote read(final org.omg.CORBA.portable.InputStream in) {
		return narrow(in.read_Object(fr.upem.robot._RobotPiloteStub.class));
	}

	public static void write(final org.omg.CORBA.portable.OutputStream _out,
			final fr.upem.robot.RobotPilote s) {
		_out.write_Object(s);
	}

	public static fr.upem.robot.RobotPilote narrow(
			final org.omg.CORBA.Object obj) {
		if (obj == null) {
			return null;
		} else if (obj instanceof fr.upem.robot.RobotPilote) {
			return (fr.upem.robot.RobotPilote) obj;
		} else if (obj._is_a("IDL:fr/upem/robot/RobotPilote:1.0")) {
			fr.upem.robot._RobotPiloteStub stub;
			stub = new fr.upem.robot._RobotPiloteStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl) obj)
					._get_delegate());
			return stub;
		} else {
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}

	public static fr.upem.robot.RobotPilote unchecked_narrow(
			final org.omg.CORBA.Object obj) {
		if (obj == null) {
			return null;
		} else if (obj instanceof fr.upem.robot.RobotPilote) {
			return (fr.upem.robot.RobotPilote) obj;
		} else {
			fr.upem.robot._RobotPiloteStub stub;
			stub = new fr.upem.robot._RobotPiloteStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl) obj)
					._get_delegate());
			return stub;
		}
	}
}
