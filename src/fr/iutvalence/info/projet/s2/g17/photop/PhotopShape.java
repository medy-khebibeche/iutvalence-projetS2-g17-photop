package fr.iutvalence.info.projet.s2.g17.photop;
import java.awt.Color;

/**
 * 
 * @author Bastien, Mathie
 *
 */
public class PhotopShape extends PhotopObject
{
	/**
	 * the color of the shape
	 */
	private Color color;
	
	/**
	 * The type of shape
	 */
	private TypeShape type;
	
	/**
	 * The constructor of the shape
	 * @param x
	 * @param y
	 * @param point
	 */
	public PhotopShape(int x, int y, Pointer point)
	{
		super(new Position(x, y), point.getSize());

		this.color = point.getColor();
		this.type = point.getType();
	}
	
	/**
	 * get the color of the shape
	 * @return color
	 */
	public Color getColor() 
	{
		return color;
	}
	
	/**
	 * set a new color to the shape
	 * @param color
	 */
	public void setColor(Color color) 
	{
		this.color = color;
	}
	
	/**
	 * Get the type of the shape
	 * @return type
	 */
	public TypeShape getType() 
	{
		return this.type;
	}
	
	/**
	 * Set a new type to the shape
	 * @param type
	 */
	public void setType(TypeShape type) 
	{
		this.type = type;
	}
	
	/**
	 * get the abscissa position of the object
	 * @return getObjectPosition().getPosX()
	 */
	public int getPosX()
	{
		return this.getObjectPosition().getPosX();
	}
	
	/**
	 * get the ordinate position of the object
	 * @return getObjectPosition().getPosY()
	 */
	public int getPosY()
	{
		return this.getObjectPosition().getPosY();
	}
	/**
	 * Get the size of the object
	 * @return getObjectDimension()
	 */
	public int getSize()
	{
		return this.getObjectDimension();
	}
}



