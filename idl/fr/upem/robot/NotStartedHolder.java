package fr.upem.robot;

/**
 * Generated from IDL exception "NotStarted".
 * 
 * @author JacORB IDL compiler V 3.3
 * @version generated at 4 mars 2014 15:37:52
 */

public final class NotStartedHolder implements
		org.omg.CORBA.portable.Streamable {
	public fr.upem.robot.NotStarted value;

	public NotStartedHolder() {
	}

	public NotStartedHolder(final fr.upem.robot.NotStarted initial) {
		value = initial;
	}

	public org.omg.CORBA.TypeCode _type() {
		return fr.upem.robot.NotStartedHelper.type();
	}

	public void _read(final org.omg.CORBA.portable.InputStream _in) {
		value = fr.upem.robot.NotStartedHelper.read(_in);
	}

	public void _write(final org.omg.CORBA.portable.OutputStream _out) {
		fr.upem.robot.NotStartedHelper.write(_out, value);
	}
}
