package fr.upem.robot;

/**
 * Generated from IDL alias "SensorSet".
 * 
 * @author JacORB IDL compiler V 3.3
 * @version generated at 4 mars 2014 15:37:52
 */

public final class SensorSetHolder implements org.omg.CORBA.portable.Streamable {
	public org.omg.CORBA.Any[] value;

	public SensorSetHolder() {
	}

	public SensorSetHolder(final org.omg.CORBA.Any[] initial) {
		value = initial;
	}

	public org.omg.CORBA.TypeCode _type() {
		return SensorSetHelper.type();
	}

	public void _read(final org.omg.CORBA.portable.InputStream in) {
		value = SensorSetHelper.read(in);
	}

	public void _write(final org.omg.CORBA.portable.OutputStream out) {
		SensorSetHelper.write(out, value);
	}
}
