package fr.upem.robot;

/**
 * Generated from IDL interface "RobotControl".
 * 
 * @author JacORB IDL compiler V 3.3
 * @version generated at 4 mars 2014 15:37:52
 */

public final class RobotControlHolder implements
		org.omg.CORBA.portable.Streamable {
	public RobotControl value;

	public RobotControlHolder() {
	}

	public RobotControlHolder(final RobotControl initial) {
		value = initial;
	}

	public org.omg.CORBA.TypeCode _type() {
		return RobotControlHelper.type();
	}

	public void _read(final org.omg.CORBA.portable.InputStream in) {
		value = RobotControlHelper.read(in);
	}

	public void _write(final org.omg.CORBA.portable.OutputStream _out) {
		RobotControlHelper.write(_out, value);
	}
}
