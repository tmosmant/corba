package fr.upem.robot;

/**
 * Generated from IDL exception "AlreadyStarted".
 * 
 * @author JacORB IDL compiler V 3.3
 * @version generated at 4 mars 2014 15:37:52
 */

public abstract class AlreadyStartedHelper {
	private volatile static org.omg.CORBA.TypeCode _type;

	public static org.omg.CORBA.TypeCode type() {
		if (_type == null) {
			synchronized (AlreadyStartedHelper.class) {
				if (_type == null) {
					_type = org.omg.CORBA.ORB
							.init()
							.create_exception_tc(fr.upem.robot.AlreadyStartedHelper.id(), "AlreadyStarted",
                                                 new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember(
                                                         "message", org.omg.CORBA.ORB.init().create_string_tc(0),
                                                         null)});
				}
			}
		}
		return _type;
	}

	public static void insert(final org.omg.CORBA.Any any,
			final fr.upem.robot.AlreadyStarted s) {
		any.type(type());
		write(any.create_output_stream(), s);
	}

	public static fr.upem.robot.AlreadyStarted extract(
			final org.omg.CORBA.Any any) {
		org.omg.CORBA.portable.InputStream in = any.create_input_stream();
		try {
			return read(in);
		} finally {
			try {
				in.close();
			} catch (java.io.IOException e) {
				throw new RuntimeException("Unexpected exception "
						+ e.toString());
			}
		}
	}

	public static String id() {
		return "IDL:fr/upem/robot/AlreadyStarted:1.0";
	}

	public static fr.upem.robot.AlreadyStarted read(
			final org.omg.CORBA.portable.InputStream in) {
		String id = in.read_string();
		if (!id.equals(id()))
			throw new org.omg.CORBA.MARSHAL("wrong id: " + id);
		java.lang.String x0;
		x0 = in.read_string();
		final fr.upem.robot.AlreadyStarted result = new fr.upem.robot.AlreadyStarted(
				id, x0);
		return result;
	}

	public static void write(final org.omg.CORBA.portable.OutputStream out,
			final fr.upem.robot.AlreadyStarted s) {
		out.write_string(id());
		java.lang.String tmpResult1 = s.message;
		out.write_string(tmpResult1);
	}
}
