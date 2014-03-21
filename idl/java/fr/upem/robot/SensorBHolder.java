package fr.upem.robot;

/**
 * Generated from IDL struct "SensorB".
 *
 * @author JacORB IDL compiler V 3.3
 * @version generated at 21 mars 2014 15:35:08
 */

public final class SensorBHolder
	implements org.omg.CORBA.portable.Streamable
{
	public fr.upem.robot.SensorB value;

	public SensorBHolder ()
	{
	}
	public SensorBHolder(final fr.upem.robot.SensorB initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return fr.upem.robot.SensorBHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = fr.upem.robot.SensorBHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		fr.upem.robot.SensorBHelper.write(_out, value);
	}
}
