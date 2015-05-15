package fr.iutvalence.info.projet.s2.g17.photop;
/**
 * The enum of different fonts
 * @author Medy
 *
 */
public enum Font
{
	normal("Normal"),
	bold("Gras"),
	italic("Italique"),
	underlined("Souligné"),
	higlighted("Surligné"),
	blocked("Barré");
	/**
	 * The name of the font style
	 */
	private String name="";
	/**
	 * The constructor of Font
	 * @param name
	 */
	private Font(String name)
	{
		this.name = name;
	}
}
