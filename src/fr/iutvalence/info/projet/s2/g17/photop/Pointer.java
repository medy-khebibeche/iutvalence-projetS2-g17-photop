package fr.iutvalence.info.projet.s2.g17.photop;
import java.awt.Color;

/**
 * Represents the the pointer used to draw a PhotopShape on a DrawPanel
 * A pointer has a color, a type and a size
 * @author Mathie
 */
public class Pointer
{
	/**
	 * the pointer's color
	 */
	private Color color;
	
	/**
	 * the pointer's type
	 */
	private TypeShape type;
	
	/**
	 * The pointer's size
	 */
	private int size;
	
	/**
	 * Initializes the default pointer
	 * The default pointer is black, is a circle and measures 100px
	 */
	public Pointer()
	{
		this.color = Color.black;
		this.type = TypeShape.CIRCLE;
		this.size = 100;
	}
	
	/**
	 * Initializes the pointer with a given color, type and size
	 * @param col the given color
	 * @param shap the given type
	 * @param siz the given size
	 */
	public Pointer(Color col, TypeShape shap, int siz)
	{
		this.color = col;
		this.type = shap;
		this.size = siz;
	}
	
	/**
	 * Sets the pointer's color with a given color
	 * @param color color
	 */
	public void setColor(Color color)
	{
		this.color = color;
	}
	
	/**
	 * Sets the pointer's type with a given TypeShape
	 * @param shape shape
	 */
	public void setShape(TypeShape shape)
	{
		this.type = shape;
	}
	
	/**
	 * Sets the pointer's size with a given size
	 * @param size size
	 */
	public void setSize(int size)
	{
		this.size = size;
	}
	
	/**
	 * Returns the pointer's color
	 * @return color the pointer's color
	 */
	public Color getColor()
	{
		return color;
	}
	
	/**
	 * Returns the pointer's type
	 * @return type the pointer's type
	 */
	public TypeShape getType()
	{
		return type;
	}
	
	/**
	 * Returns the pointer's size
	 * @return size the pointer's size
	 */
	public int getSize()
	{
		return size;
	}
	
}
