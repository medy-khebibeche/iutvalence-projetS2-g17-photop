package fr.iutvalence.info.projet.s2.g17.photop;

/**
 * Represents an Object, an Object can be an image or a decoration
 * an Object has got a specific position and a specific dimension
 * @author Jean-Baptiste, Mathie
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
	private int objectDimension;
	
	/**
	 * the constructor of an object
	 * @param objectPosition the coordinate of the object
	 * @param objectDimension the dimension of the object
	 */
	protected PhotopObject(Position objectPosition, int objectDimension)
	{
		this.objectPosition = objectPosition;
		this.objectDimension = objectDimension;
	}
	
	/**
	 * gets the object's position
	 * @return objectPosition the object's position
	 */
	public Position getObjectPosition()
	{
		return objectPosition;
	}
	
	/**
	 * Sets a new position to the object
	 * @param objectPosition objectPosition
	 */
	public void setObjectPosition(Position objectPosition)
	{
		this.objectPosition = objectPosition;
	}
	
	/**
	 * gets the dimension of the object
	 * @return objectDimension objectDimension
	 */
	public int getObjectDimension()
	{
		return objectDimension;
	}
	
	/**
	 * sets the new dimension to the object
	 * @param objectDimension objectDimension
	 */
	public void setObjectDimension(int objectDimension)
	{
		this.objectDimension = objectDimension;
	}
}
