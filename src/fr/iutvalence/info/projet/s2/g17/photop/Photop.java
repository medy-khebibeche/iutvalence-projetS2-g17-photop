package fr.iutvalence.info.projet.s2.g17.photop;

import fr.iutvalence.info.projet.s2.g17.photop.HMI.HMIPhotop;


/**
 * Photop' is a photo editing software</br>
 * Features :</br>
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
	 * launch the application by running the HMI
	 */
	public void launch()
	{
		HMIPhotop hmi = new HMIPhotop();
		hmi.runHMI();
	}
	
	
//	/**
//	 * 1. open the file explorer view 
//	 * 2. the user select an image
//	 * 3. display the selected image in the window
//	 * @return void 
//	 */
//	
//	public void openImage()
//	{	
//		//TODO display selected image in the Photop window
//		//TODO in HMI link this method to a button openImage
//		//TODO link the selected image to an Image object
//	}
//	
	
}
