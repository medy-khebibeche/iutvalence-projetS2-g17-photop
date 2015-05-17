package fr.iutvalence.info.projet.s2.g17.photop;

/**
 * 
 *
 */
public class Rectangle extends Shape {
	
	// Methodes utile dans Graphics: drawRect et clearRect
	

	/**
	 * coordinates of rectangle
	 */
	private int x;
	private int y;
	
	/**
	 * width and height of rectangle
	 */
	private int width;
	private int height;
	
	/**
	 * 
	 * @param objectPosition
	 * @param objectDimension
	 */
	protected Rectangle(Position objectPosition, Dimension objectDimension)
	{
		super(objectPosition, objectDimension);
		// TODO Auto-generated constructor stub
	}

}
