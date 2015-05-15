package fr.iutvalence.info.projet.s2.g17.photop;
import java.awt.Color;
/**
 * The class text which is an heritage of the class Decoration
 * @author Medy
 */
public class Text extends Decoration
{
	/**
	 * The font of the text
	 */
	private Font font;
	
	/**
	 * The text typed by the user
	 */
	private String text;
	
	/**
	 * The constructor of the class Text, which is an heritage of Decoration
	 * @param decorationColor the color of the text
	 * @param decorationAngle the angle of the text
	 * @param decorationPosition the position of the text
	 * @param decorationDimension the dimension of the text
	 */
	public Text(Color decorationColor, int decorationAngle, Position decorationPosition, Dimension decorationDimension)
	{
		super(decorationColor, decorationAngle, decorationPosition, decorationDimension);
	}
	
	/**
	 * Allow to change and set a new font
	 * @param font the new font
	 */
	public void setFont(Font font)
	{
		this.font = font;
	}
	
	//Doit-on faire une autre méthode pour le texte ??? - Médy
	
}
