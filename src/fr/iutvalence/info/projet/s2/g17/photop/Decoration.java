package fr.iutvalence.info.projet.s2.g17.photop;

import java.awt.Color;
import java.awt.color.*;
/**
 * Represents a decoration
 * @author Jean-Baptiste
 *
 */
public class Decoration extends Object
{
	/**
	 * the color of the decoration
	 */
	private Color colorOfTheDecoration;
	/**
	 * the angle of the decoration
	 */
	private int angleOfTheDecoration;

	/**
	 * the constructor of a decoration
	 * @param colorOfTheDecoration
	 * @param angleofTheDecoration
	 */
	public Decoration(Color colorOfTheDecoration, int angleofTheDecoration, Position positionOfTheDecoration, Dimension dimensionOfTheDecoration)
	{
		super(positionOfTheDecoration,dimensionOfTheDecoration);
		Angle angleOfDecoration = new Angle(angleofTheDecoration);
		this.angleOfTheDecoration = angleofTheDecoration;
		this.colorOfTheDecoration = colorOfTheDecoration;
		
	}
	/**
	 * Method who changes the color of a decoration
	 * @param newColor
	 */
	public void changeColor(Color newColor)
	{
		this.colorOfTheDecoration = newColor;
	}
	/**
	 * Method who rotates the decoration
	 * @param newAngle
	 */
	public void rotationOfTheDecoration(int newAngle)
	{
		this.angleOfTheDecoration =  this.angleOfTheDecoration + newAngle;
	}
	
	
}
