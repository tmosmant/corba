package fr.upem.robot;

/**
 * Generated from IDL exception "NotStarted".
 *
 * @author JacORB IDL compiler V 3.3
 * @version generated at 21 mars 2014 15:35:08
 */

public final class NotStarted
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public NotStarted()
	{
		super(fr.upem.robot.NotStartedHelper.id());
	}

	public java.lang.String message = "";
	public NotStarted(java.lang.String _reason,java.lang.String message)
	{
		super(_reason);
		this.message = message;
	}
	public NotStarted(java.lang.String message)
	{
		super(fr.upem.robot.NotStartedHelper.id());
		this.message = message;
	}
}
