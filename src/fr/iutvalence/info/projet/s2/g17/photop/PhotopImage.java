package fr.iutvalence.info.projet.s2.g17.photop;

/**
 * Represents an image :
 * an image has a name, an extension, an url and is saved or not
 * @author bertholm
 */
public class PhotopImage extends PhotopObject
{
	
	/**
	 *represents the name of the image
	 */
	private String name;
	
	/**
	 * represents the extension of the image (bmp, png, jpg)
	 */
	private String imageExtension;
	
	/**
	 * represents the state of the image, is it saved or not
	 */
	private boolean isSaved;
	
	/**
	 * represents the path of the image
	 */
	private String path;
	
	
	/**
	 * creates an image
	 * @param name the name of the image
	 * @param imageExtension its extension
	 * @param isSaved saving state
	 * @param path the path of the image
	 * @param positionOfTheImage positionOfTheImage
	 * @param dimensionOfTheImage dimensionOfTheImage
	 */
	public PhotopImage(String path,String name, String imageExtension, boolean isSaved, Position positionOfTheImage, int dimensionOfTheImage)
	{
		super(positionOfTheImage,dimensionOfTheImage);
		this.path = path;
		this.name = name;
		this.imageExtension = imageExtension;
		this.isSaved = isSaved;
	}
	
	
	
}
