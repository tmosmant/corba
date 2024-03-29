package fr.upem.robot;

/**
 * Generated from IDL alias "SensorSet".
 *
 * @author JacORB IDL compiler V 3.3
 * @version generated at 21 mars 2014 15:35:08
 */

public abstract class SensorSetHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;

	public static void insert (org.omg.CORBA.Any any, org.omg.CORBA.Any[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.CORBA.Any[] extract (final org.omg.CORBA.Any any)
	{
		if ( any.type().kind() == org.omg.CORBA.TCKind.tk_null)
		{
			throw new org.omg.CORBA.BAD_OPERATION ("Can't extract from Any with null type.");
		}
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(SensorSetHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_alias_tc(fr.upem.robot.SensorSetHelper.id(), "SensorSet",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(11))));
				}
			}
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:fr/upem/robot/SensorSet:1.0";
	}
	public static org.omg.CORBA.Any[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.CORBA.Any[] _result;
		int _l_result0 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result0 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result0);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new org.omg.CORBA.Any[_l_result0];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=_in.read_any();
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.CORBA.Any[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			_out.write_any(_s[i]);
		}

	}
}
