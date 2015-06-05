package fr.iutvalence.info.projet.s2.g17.photop;

import java.awt.Color;

/**
 * Represents a decoration
 * a decoration can be a frame, a shape (circle, square...) or a text
 * @author Jean-Baptiste
 */
public abstract class Decoration extends PhotopObject
{
	/**
	 * the color of the decoration
	 */
	private Color decorationColor;

	/**
	 * the angle of the decoration
	 */
	private Angle decorationAngle;

	/**
	 * the constructor of a decoration
	 * @param decorationColor the color of the decoration
	 * @param decorationAngle the angle of the decoration
	 */
	public Decoration(Color decorationColor, int decorationAngle, Position decorationPosition, Dimension decorationDimension)
	{
		super(decorationPosition,decorationDimension);
		this.decorationAngle = new Angle(decorationAngle);
		this.decorationColor = decorationColor;
	}

	/**
	 * This method changes the color of a decoration with a given color
	 * @param newColor the color to change
	 */
	public void changeColor(Color newColor)
	{
		this.decorationColor = newColor;
	}

	/**
	 * This method rotates the decoration with a given angle
	 * @param newAngle the angle to rotate
	 */
	public void rotateDecoration(Angle newAngle)
	{
		this.decorationAngle.rotate(newAngle);
	}



}
