package fr.upem.robot;

/**
 * Generated from IDL exception "AlreadyStarted".
 *
 * @author JacORB IDL compiler V 3.3
 * @version generated at 21 mars 2014 15:35:08
 */

public final class AlreadyStartedHolder
	implements org.omg.CORBA.portable.Streamable
{
	public fr.upem.robot.AlreadyStarted value;

	public AlreadyStartedHolder ()
	{
	}
	public AlreadyStartedHolder(final fr.upem.robot.AlreadyStarted initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return fr.upem.robot.AlreadyStartedHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = fr.upem.robot.AlreadyStartedHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		fr.upem.robot.AlreadyStartedHelper.write(_out, value);
	}
}
