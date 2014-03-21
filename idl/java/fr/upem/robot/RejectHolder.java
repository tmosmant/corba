package fr.upem.robot;

/**
 * Generated from IDL exception "Reject".
 *
 * @author JacORB IDL compiler V 3.3
 * @version generated at 21 mars 2014 15:35:08
 */

public final class RejectHolder
	implements org.omg.CORBA.portable.Streamable
{
	public fr.upem.robot.Reject value;

	public RejectHolder ()
	{
	}
	public RejectHolder(final fr.upem.robot.Reject initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return fr.upem.robot.RejectHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = fr.upem.robot.RejectHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		fr.upem.robot.RejectHelper.write(_out, value);
	}
}
