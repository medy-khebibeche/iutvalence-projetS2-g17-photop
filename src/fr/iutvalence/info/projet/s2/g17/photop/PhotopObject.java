package fr.iutvalence.info.projet.s2.g17.photop;

/**
 * Represents an Object, an Object can be an image or a decoration
 * an Object has got a specific position and a specific dimension
 * @author Jean-Baptiste
 */
public abstract class PhotopObject
{
	/**
	 * the coordinate of the object
	 */
	private Position objectPosition;
	
	/**
	 * the dimension of the object
	 */
	private Dimension objectDimension;
	
	/**
	 * the constructor of an object
	 * @param objectPosition the coordinate of the object
	 * @param objectDimension the dimension of the object
	 */
	protected PhotopObject(Position objectPosition, Dimension objectDimension)
	{
		this.objectPosition = objectPosition;
		this.objectDimension = objectDimension;
	}
}
