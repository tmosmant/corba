package fr.upem.robot;

/**
 * Generated from IDL struct "SensorA".
 *
 * @author JacORB IDL compiler V 3.3
 * @version generated at 21 mars 2014 15:35:08
 */

public final class SensorAHolder
	implements org.omg.CORBA.portable.Streamable
{
	public fr.upem.robot.SensorA value;

	public SensorAHolder ()
	{
	}
	public SensorAHolder(final fr.upem.robot.SensorA initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return fr.upem.robot.SensorAHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = fr.upem.robot.SensorAHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		fr.upem.robot.SensorAHelper.write(_out, value);
	}
}
