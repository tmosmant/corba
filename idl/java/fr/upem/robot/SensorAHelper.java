package fr.upem.robot;


/**
 * Generated from IDL struct "SensorA".
 *
 * @author JacORB IDL compiler V 3.3
 * @version generated at 21 mars 2014 15:35:08
 */

public abstract class SensorAHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(SensorAHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(fr.upem.robot.SensorAHelper.id(),"SensorA",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final fr.upem.robot.SensorA s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static fr.upem.robot.SensorA extract (final org.omg.CORBA.Any any)
	{
		org.omg.CORBA.portable.InputStream in = any.create_input_stream();
		try
		{
			return read (in);
		}
		finally
		{
			try
			{
				in.close();
			}
			catch (java.io.IOException e)
			{
			throw new RuntimeException("Unexpected exception " + e.toString() );
			}
		}
	}

	public static String id()
	{
		return "IDL:fr/upem/robot/SensorA:1.0";
	}
	public static fr.upem.robot.SensorA read (final org.omg.CORBA.portable.InputStream in)
	{
		fr.upem.robot.SensorA result = new fr.upem.robot.SensorA();
		result.name=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final fr.upem.robot.SensorA s)
	{
		java.lang.String tmpResult0 = s.name;
out.write_string( tmpResult0 );
	}
}
