package fr.iutvalence.info.projet.s2.g17.photop;

import fr.iutvalence.info.projet.s2.g17.photop.GUI.GUIPhotop;


/**
 * Photop' is a photo editing software
 * Features :
 *  <ul>
 *  	<li>open an image</li>
 *  	<li>create an image</li>
 *  	<li>save an image</li>
 *    	<li>transform an image</li>
 *  	<li>add shapes</li>
 *  	<li>add text</li>
 *   	<li>add embellishment</li>
 *     	<li>add a frame</li>
 *     	<li>draw</li>
 *  </ul>
 * @author bertholm
 *
 */

public class Photop 
{
	/**
	 * The GUI of the application Photop
	 */
	private GUIPhotop guiPhotop;
	
	/**
	 * The association of the GUI and the application
	 * @param guiPhotop guiPhotop
	 */
	public void GUIAssociation(GUIPhotop guiPhotop)
	{
		this.guiPhotop = guiPhotop;
		
	}
	
	
	
	
	
}
