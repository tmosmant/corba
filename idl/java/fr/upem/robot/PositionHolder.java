package fr.upem.robot;

/**
 * Generated from IDL struct "Position".
 *
 * @author JacORB IDL compiler V 3.3
 * @version generated at 21 mars 2014 15:35:08
 */

public final class PositionHolder
	implements org.omg.CORBA.portable.Streamable
{
	public fr.upem.robot.Position value;

	public PositionHolder ()
	{
	}
	public PositionHolder(final fr.upem.robot.Position initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return fr.upem.robot.PositionHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = fr.upem.robot.PositionHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		fr.upem.robot.PositionHelper.write(_out, value);
	}
}
