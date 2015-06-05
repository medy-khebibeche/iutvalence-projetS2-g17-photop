package fr.iutvalence.info.projet.s2.g17.photop.GUI;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
//TODO javadoc
import javax.swing.WindowConstants;

import fr.iutvalence.info.projet.s2.g17.photop.Photop;

/**
 * The classGUIPhotop where we create the GUI
 * @author Medy
 *
 */
public class GUIPhotop implements Runnable
{
	/**
	 * The window of the application
	 */
	private JFrame window;
	
	/**
	 * Photop
	 */
	private Photop photop;
	
	/**
	 * The menubar
	 */
	private TopMenuBar topMenuBar;
	
	/**
	 * the constructor
	 * @param photop
	 */
	public GUIPhotop (Photop photop)
	{
		this.photop = photop;
	}
	
	/**
	 * The creator of the GUI with parameters
	 */
	private void GUIPhotopCreator()
	{
		this.window = new JFrame();
		// window size and location
		this.window.setSize(800,800);
		this.window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		this.window.setLocationRelativeTo(null);

		this.window.setJMenuBar(new TopMenuBar(this.window));
		this.window.setVisible(true);
	}

	/**
	 * The method run
	 */
	@Override
	public void run()
	{
		this.GUIPhotopCreator();
	}



}

