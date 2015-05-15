package fr.iutvalence.info.projet.s2.g17.photop;

/**
 * Represents the dimension of an Object :
 * an Object has got a height and a width
 * @author Jean-Baptiste
 */
public class Dimension
{
	/**
	 * the height of the object
	 */
	private int height; 
	
	/**
	 * the width of the object
	 */
	private int width; 
	
	/**
	 * Creates a new dimension
	 * @param height
	 * @param width
	 */
	public Dimension(int height, int width)
	{
		this.height = height;
		this.width = width;
	}
	
	/**
	 * Sets the height with a given height
	 * @param newHeight the height to set
	 */
	public void setHeight(int newHeight)
	{
		this.height = newHeight;
	}
	
	/**
	 * Sets the width with a given width
	 * @param newwidth the width to set
	 */
	public void setWidth(int newWidth)
	{
		this.width = newWidth;
	}
	
	/**
	 * Increments the dimension with a given ratio
	 * @param ratio 
	 */
	public void changeSize(int ratio)
	{
		this.height += this.height * ratio;
		this.width += this.width * ratio;
	}
}
