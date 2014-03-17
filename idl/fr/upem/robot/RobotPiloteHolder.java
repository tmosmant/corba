package fr.upem.robot;

/**
 * Generated from IDL interface "RobotPilote".
 * 
 * @author JacORB IDL compiler V 3.3
 * @version generated at 4 mars 2014 15:37:52
 */

public final class RobotPiloteHolder implements
		org.omg.CORBA.portable.Streamable {
	public RobotPilote value;

	public RobotPiloteHolder() {
	}

	public RobotPiloteHolder(final RobotPilote initial) {
		value = initial;
	}

	public org.omg.CORBA.TypeCode _type() {
		return RobotPiloteHelper.type();
	}

	public void _read(final org.omg.CORBA.portable.InputStream in) {
		value = RobotPiloteHelper.read(in);
	}

	public void _write(final org.omg.CORBA.portable.OutputStream _out) {
		RobotPiloteHelper.write(_out, value);
	}
}
