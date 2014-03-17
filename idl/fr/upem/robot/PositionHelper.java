package fr.upem.robot;

/**
 * Generated from IDL struct "Position".
 * 
 * @author JacORB IDL compiler V 3.3
 * @version generated at 4 mars 2014 15:37:52
 */

public abstract class PositionHelper {
	private volatile static org.omg.CORBA.TypeCode _type;

	public static org.omg.CORBA.TypeCode type() {
		if (_type == null) {
			synchronized (PositionHelper.class) {
				if (_type == null) {
					_type = org.omg.CORBA.ORB
							.init()
							.create_struct_tc(fr.upem.robot.PositionHelper.id(), "Position",
                                              new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("posX",
                                                                                                              org.omg.CORBA.ORB
                                                                                                                      .init()
                                                                                                                      .get_primitive_tc(
                                                                                                                              org.omg.CORBA.TCKind
                                                                                                                                      .from_int(
                                                                                                                                              3)),
                                                                                                              null), new org.omg.CORBA.StructMember(
                                                      "posY", org.omg.CORBA.ORB.init().get_primitive_tc(
                                                      org.omg.CORBA.TCKind.from_int(3)), null)});
				}
			}
		}
		return _type;
	}

	public static void insert(final org.omg.CORBA.Any any,
			final fr.upem.robot.Position s) {
		any.type(type());
		write(any.create_output_stream(), s);
	}

	public static fr.upem.robot.Position extract(final org.omg.CORBA.Any any) {
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
		return "IDL:fr/upem/robot/Position:1.0";
	}

	public static fr.upem.robot.Position read(
			final org.omg.CORBA.portable.InputStream in) {
		fr.upem.robot.Position result = new fr.upem.robot.Position();
		result.posX = in.read_long();
		result.posY = in.read_long();
		return result;
	}

	public static void write(final org.omg.CORBA.portable.OutputStream out,
			final fr.upem.robot.Position s) {
		out.write_long(s.posX);
		out.write_long(s.posY);
	}
}
