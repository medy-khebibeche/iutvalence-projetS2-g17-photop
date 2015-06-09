package fr.iutvalence.info.projet.s2.g17.photop;
import java.awt.Color;

/**
 * A photopShape has a color, a type (square, circle...), a position and a dimension
 * @author Bastien, Mathie
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
	 * @param x the coordinate on the X axe
	 * @param y the coordinate on the Y axe
	 * @param point point
	 */
	public PhotopShape(int x, int y, Pointer point)
	{
		super(new Position(x, y), point.getSize());
		
		this.color = point.getColor();
		this.type = point.getType();
	}
	
	/**
	 * gets the color of the shape
	 * @return color
	 */
	public Color getColor() 
	{
		return color;
	}
	
	/**
	 * sets a new color to the shape
	 * @param color color
	 */
	public void setColor(Color color) 
	{
		this.color = color;
	}
	
	/**
	 * Gets the type of the shape
	 * @return type type
	 */
	public TypeShape getType() 
	{
		return this.type;
	}
	
	/**
	 * Sets a new type to the shape
	 * @param type type
	 */
	public void setType(TypeShape type) 
	{
		this.type = type;
	}
	
	/**
	 * gets the abscissa position of the object
	 * @return getObjectPosition().getPosX()
	 */
	public int getPosX()
	{
		return this.getObjectPosition().getPosX();
	}
	
	/**
	 * gets the ordinate position of the object
	 * @return getObjectPosition().getPosY()
	 */
	public int getPosY()
	{
		return this.getObjectPosition().getPosY();
	}
	/**
	 * Gets the size of the object
	 * @return getObjectDimension()
	 */
	public int getSize()
	{
		return this.getObjectDimension();
	}
}
