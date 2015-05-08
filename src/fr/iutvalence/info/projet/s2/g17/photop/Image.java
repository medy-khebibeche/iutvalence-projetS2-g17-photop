package fr.iutvalence.info.projet.s2.g17.photop;

/**
 * Represents an image :
 * an image has a name, an extension and is saved or not
 * 
 * @author bertholm
 *
 */

public class Image
{
	/**
	 * the name of the image
	 */
	private String name;
	
	/**
	 * the extension of the image (bmp, png, jpg)
	 */
	private String ImageExtension;
	
	/**
	 * reresent the state of the image, is it saved or not
	 */
	private boolean IsSaved;

	
	/**
	 * creates an image
	 * @param name the name of the image
	 * @param imageExtension its extension
	 * @param isSaved saving state
	 */
	public Image(String name, String imageExtension, boolean isSaved)
	{
		super();
		this.name = name;
		ImageExtension = imageExtension;
		IsSaved = isSaved;
	}
	
	
	
}
