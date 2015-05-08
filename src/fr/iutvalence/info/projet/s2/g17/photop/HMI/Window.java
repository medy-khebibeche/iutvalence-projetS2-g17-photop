package fr.iutvalence.info.projet.s2.g17.photop.HMI;

import javax.swing.JFrame;
/**
 * Creates a window :</br>
 * a window has a title and a size(lenght/widght)
 * @author bertholm
 *
 */
public class Window extends JFrame
{
	
	/**
	 * the title of the window
	 */
	private String windowName;
	
	/**
	 * the lenght of the window
	 */
	private int sizeLength;
	
	/**
	 * the width of the window
	 */
	private int sizeWidth;

	
	/**
	 * Creates a window with a given title and size
	 * @param title the window's title
	 * @param sizeLength window's length
	 * @param sizeWidth window's width
	 */
	public Window(String windowName, int sizeLength, int sizeWidth)
	{
		super();
		this.windowName = windowName;
		this.sizeLength = sizeLength;
		this.sizeWidth = sizeWidth;
	}	
	

	/**
	 * Creates a window : 
	 * set a title to the window
	 * set a size
	 * set it visible
	 * @return void
	 */
	public void DrawWindow()
	{
		this.setTitle(this.windowName);
		this.setSize(this.sizeLength,this.sizeWidth);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}


}
