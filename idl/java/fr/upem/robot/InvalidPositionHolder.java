package fr.upem.robot;

/**
 * Generated from IDL exception "InvalidPosition".
 *
 * @author JacORB IDL compiler V 3.3
 * @version generated at 21 mars 2014 15:35:08
 */

public final class InvalidPositionHolder
	implements org.omg.CORBA.portable.Streamable
{
	public fr.upem.robot.InvalidPosition value;

	public InvalidPositionHolder ()
	{
	}
	public InvalidPositionHolder(final fr.upem.robot.InvalidPosition initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return fr.upem.robot.InvalidPositionHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = fr.upem.robot.InvalidPositionHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		fr.upem.robot.InvalidPositionHelper.write(_out, value);
	}
}
