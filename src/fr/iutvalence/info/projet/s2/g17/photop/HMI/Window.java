package fr.iutvalence.info.projet.s2.g17.photop.HMI;

import javax.swing.JFrame;
/**
 * Creates a window
 * @author bertholm
 *
 */
public class Window extends JFrame
{
/**
 * Creates a window 
 * set a title to the window : "Photop'"
 * set a size
 * set it visible
 */
	public Window(){

		this.setTitle("Photop'");
		this.setSize(700,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setVisible(true);
	}
	

}
