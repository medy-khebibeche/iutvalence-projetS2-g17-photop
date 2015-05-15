package fr.iutvalence.info.projet.s2.g17.photop;


/**
 * Represents an image :
 * an image has a name, an extension, an url and is saved or not
 * @author bertholm
 */
public class Image extends Object
{
	
	/**
	 * the name of the image
	 */
	private String name;
	
	/**
	 * the extension of the image (bmp, png, jpg)
	 */
	private String imageExtension;
	
	/**
	 * reresent the state of the image, is it saved or not
	 */
	private boolean isSaved;
	
	/**
	 * the path of the image
	 */
	private String path;

	
	/**
	 * creates an image
	 * @param name the name of the image
	 * @param imageExtension its extension
	 * @param isSaved saving state
	 * @param path the path of the image
	 */
	public Image(String path,String name, String imageExtension, boolean isSaved, Position positionOfTheImage, Dimension dimensionOfTheImage)
	{
		super(positionOfTheImage,dimensionOfTheImage);
		this.path = path;
		this.name = name;
		this.imageExtension = imageExtension;
		this.isSaved = isSaved;
	}
	
	

}
