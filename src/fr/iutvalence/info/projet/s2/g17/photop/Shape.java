package fr.iutvalence.info.projet.s2.g17.photop;

import java.awt.Color;

//TODO javadoc

/**
 * 
 *
 */
public abstract class Shape extends fr.iutvalence.info.projet.s2.g17.photop.Object
{

	/**
	 * 
	 */
	private Color backgroundColor;
	
	
	/**
	 * 
	 */
	private Color borderColor;
	
	/**
	 * 
	 */
	private int borderThickness;
	
	/**
	 * 
	 * @return
	 */
	public Color getBackgroundColor()
	{
		return backgroundColor;
	}

	/**
	 * 
	 * @param backgroundColor
	 */
	public void setBackgroundColor(Color backgroundColor)
	{
		this.backgroundColor = backgroundColor;
	}

	/**
	 * 
	 * @return
	 */
	public Color getBorderColor()
	{
		return borderColor;
	}

	/**
	 * 
	 * @param borderColor
	 */
	public void setBorderColor(Color borderColor)
	{
		this.borderColor = borderColor;
	}

	/**
	 * 
	 * @return
	 */
	public int getBorderThickness()
	{
		return borderThickness;
	}

	/**
	 * 
	 * @param borderThickness
	 */
	public void setBorderThickness(int borderThickness)
	{
		this.borderThickness = borderThickness;
	}
	
	/**
	 * 
	 * @param objectPosition
	 * @param objectDimension
	 */
	protected Shape(Position objectPosition, Dimension objectDimension)
	{
		super(objectPosition, objectDimension);
		
	}
		
}
