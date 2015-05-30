package fr.iutvalence.info.projet.s2.g17.photop.GUI;




import javax.swing.JFrame;
//TODO javadoc
import javax.swing.WindowConstants;

import fr.iutvalence.info.projet.s2.g17.photop.Photop;


public class GUIPhotop implements Runnable
{
		private JFrame window;
		
		private Photop photop;
		 
		private TopMenuBar topMenuBar;
		
	public GUIPhotop (Photop photop)
	{
		this.photop = photop;
		

	}
		
		  private void GUIPhotopCreator()
		  {
			 
			  this.window = new JFrame();
			 // window size and location
			  this.window.setSize(500, 300);
			  this.window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			  this.window.setLocationRelativeTo(null);

			  this.window.setJMenuBar(new TopMenuBar(this.window));
			  this.window.setVisible(true);
			  
		  }


		@Override
		public void run()
		{
			this.GUIPhotopCreator();
			
		}
		  
}
		
	