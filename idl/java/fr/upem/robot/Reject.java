package fr.upem.robot;

/**
 * Generated from IDL exception "Reject".
 *
 * @author JacORB IDL compiler V 3.3
 * @version generated at 21 mars 2014 15:35:08
 */

public final class Reject
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public Reject()
	{
		super(fr.upem.robot.RejectHelper.id());
	}

	public java.lang.String message = "";
	public Reject(java.lang.String _reason,java.lang.String message)
	{
		super(_reason);
		this.message = message;
	}
	public Reject(java.lang.String message)
	{
		super(fr.upem.robot.RejectHelper.id());
		this.message = message;
	}
}
