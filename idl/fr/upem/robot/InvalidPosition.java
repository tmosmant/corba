package fr.upem.robot;

/**
 * Generated from IDL exception "InvalidPosition".
 * 
 * @author JacORB IDL compiler V 3.3
 * @version generated at 4 mars 2014 15:37:52
 */

public final class InvalidPosition extends org.omg.CORBA.UserException {
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;

	public InvalidPosition() {
		super(fr.upem.robot.InvalidPositionHelper.id());
	}

	public java.lang.String message = "";

	public InvalidPosition(java.lang.String _reason, java.lang.String message) {
		super(_reason);
		this.message = message;
	}

	public InvalidPosition(java.lang.String message) {
		super(fr.upem.robot.InvalidPositionHelper.id());
		this.message = message;
	}
}
