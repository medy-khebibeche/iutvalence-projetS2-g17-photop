package fr.iutvalence.info.projet.s2.g17.photop;

/**
 * Represents a position of an object
 * @author Jean-Baptiste
 */
public class Position
{
	/**
	 * the object's position on the X axe  
	 */
	private int posX;

	/**
	 * the object's position on the Y axe  
	 */
	private int posY;

	/**
	 * Creates a new position with a given posX and posY
	 * @param posX the object's position on the X axe  
	 * @param posY the object's position on the Y axe  
	 */
	public Position(int posX, int posY)
	{
		this.posX =  posX;
		this.posY = posY;
	}

	/**
	 * Returns the object's position on the X axe  
	 * @return posX the object's position on the X axe  
	 */
	public int getPosX()
	{
		return posX;
	}

	/**
	 * Sets the object's position on the X axe with a given coordinate 
	 * @param posX the given X coordinate
	 */
	public void setPosX(int posX)
	{
		this.posX = posX;
	}

	/**
	 * Returns the object's position on the Y axe  
	 * @return posY the object's position on the Y axe  
	 */
	public int getPosY()
	{
		return posY;
	}

	/**
	 * Sets the object's position on the Y axe with a given coordinate 
	 * @param posY the given Y coordinate
	 */
	public void setPosY(int posY)
	{
		this.posY = posY;
	}	

}



