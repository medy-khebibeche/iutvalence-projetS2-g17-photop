package fr.iutvalence.info.projet.s2.g17.photop;

/**
 * @author Jean-Baptiste
 *
 */
public class Dimension
{
	/**
	 * the height of the object
	 */
	// TODO clarification
	private int height; // est-ce pareil que Ydimension ?
	
	/**
	 * the width of the object
	 */
	// TODO clarification
	private int width; // est-ce pareil que Xdimension ?
	
	
	public Dimension(int height, int width)
	{
		this.height = height;
		this.width = width;
	}
	
	public void changeHeight(int newHeight)
	{
		this.height = newHeight;
	}
	
	public void changeWidth(int newWidth)
	{
		this.width = newWidth;
	}
	
	public void changeSize(int ratio)
	{
		this.height = this.height * ratio;
		this.width = this.width * ratio;
	}
}
