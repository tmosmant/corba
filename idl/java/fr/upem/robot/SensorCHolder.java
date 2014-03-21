package fr.upem.robot;

/**
 * Generated from IDL struct "SensorC".
 *
 * @author JacORB IDL compiler V 3.3
 * @version generated at 21 mars 2014 15:35:08
 */

public final class SensorCHolder
	implements org.omg.CORBA.portable.Streamable
{
	public fr.upem.robot.SensorC value;

	public SensorCHolder ()
	{
	}
	public SensorCHolder(final fr.upem.robot.SensorC initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return fr.upem.robot.SensorCHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = fr.upem.robot.SensorCHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		fr.upem.robot.SensorCHelper.write(_out, value);
	}
}
