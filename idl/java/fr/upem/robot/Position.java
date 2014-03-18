package fr.upem.robot;

/**
 * Generated from IDL struct "Position".
 * 
 * @author JacORB IDL compiler V 3.3
 * @version generated at 4 mars 2014 15:37:52
 */

public final class Position implements org.omg.CORBA.portable.IDLEntity {
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;

	public Position() {
	}

	public int posX;
	public int posY;

	public Position(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}
}
