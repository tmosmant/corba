package fr.upem.robot;

/**
 * Generated from IDL exception "AlreadyStarted".
 *
 * @author JacORB IDL compiler V 3.3
 * @version generated at 21 mars 2014 15:35:08
 */

public final class AlreadyStarted
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public AlreadyStarted()
	{
		super(fr.upem.robot.AlreadyStartedHelper.id());
	}

	public java.lang.String message = "";
	public AlreadyStarted(java.lang.String _reason,java.lang.String message)
	{
		super(_reason);
		this.message = message;
	}
	public AlreadyStarted(java.lang.String message)
	{
		super(fr.upem.robot.AlreadyStartedHelper.id());
		this.message = message;
	}
}
