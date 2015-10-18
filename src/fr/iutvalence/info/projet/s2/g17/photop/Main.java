package fr.iutvalence.info.projet.s2.g17.photop;

import javax.swing.SwingUtilities;

import fr.iutvalence.info.projet.s2.g17.photop.GUI.GUIPhotop;

/**
 * The main of the application
 * @author Medy
 */
public class Main
{
	
	/**
	 * The main of the application
	 * @param args args
	 */
	public static void main(String[] args)
	{
		Photop photop = new Photop();
		GUIPhotop guiPhotop = new GUIPhotop(photop);	
		photop.GUIAssociation(guiPhotop);
		SwingUtilities.invokeLater(guiPhotop);
	}
	
}
