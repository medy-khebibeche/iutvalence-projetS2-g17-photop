package fr.iutvalence.info.projet.s2.g17.photop;
import java.awt.Color;
/**
 * The class text which is an heritage of the class Decoration
 * @author Medy
 *
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
	 * @param colorOfTheDecoration
	 * @param angleofTheDecoration
	 * @param positionOfTheDecoration
	 * @param dimensionOfTheDecoration
	 */
	public Text(Color colorOfTheDecoration, int angleofTheDecoration, Position positionOfTheDecoration, Dimension dimensionOfTheDecoration)
	{
		super(colorOfTheDecoration, angleofTheDecoration, positionOfTheDecoration, dimensionOfTheDecoration);
	}
	/**
	 * Allow to change and set a new font
	 * @param font
	 */
	public void setFont(Font font)
	{
		this.font = font;
	}
	
	//Doit-on faire une autre méthode pour le texte ??? - Médy
}
