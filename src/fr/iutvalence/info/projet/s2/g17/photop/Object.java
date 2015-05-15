package fr.iutvalence.info.projet.s2.g17.photop;

/**
 * Represents an Object ( text, decoration etc...)
 * @author Jean-Baptiste
 *
 */
public class Object
{
	/**
	 *  the coordinate of the object
	 */
	private Position positionOfTheObject;
	/**
	 * the dimension of the object
	 */
	private Dimension dimensionOfTheObject;
	
	/**
	 * the constructor of an object
	 * @param positionOfTheObject
	 * @param dimensionOfTheObject
	 */
	public Object(Position positionOfTheObject, Dimension dimensionOfTheObject)
	{
		this.positionOfTheObject = positionOfTheObject;
		this.dimensionOfTheObject = dimensionOfTheObject;
	}
}
