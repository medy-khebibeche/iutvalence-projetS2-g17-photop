package fr.iutvalence.info.projet.s2.g17.photop.GUI;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.regex.*;


/**
 * Creates a window with a menu at the top of the window : </br>
 *  <table border=1>
 *  <tr>
 *  <th>file</th>
 *  <th>edition</th>
 *  <th>add</th>
 *  </tr>
 *  <tr>
 *  <td>openFile</td>
 *  <td>select</td>
 *  <td>shape :</br> circle, square, triangle, rectangle</td>
 *  </tr>
 *  <tr>
 *  <td>create</br> an Image(png,jpg,bmp)</td>
 *  <td>rotate</td>
 *  <td>text</td>
 *  </tr>
 *  <tr>
 *  <td>closeFile</td>
 *  <td></td>
 *  <td>frame</td>
 *  </tr>
 *  </table>
 *  @author bertholm
 */

//file               | edition          | add             
//-------------------|------------------|--------------  
//	openFile         |   rotate         |  	shape :       
//	create           |   select         |  		circle    
//	---------------- |                  |  		square    
//	closeFile        |                  |  		triangle  
//	                 |                  |  		rectangle 
//	                 |                  |  	text          
//                   |                  |   frame         
public class TopMenuBar extends JMenuBar implements ActionListener
{
	  private JFrame window;
	
	  private JMenuBar menuBar;
	  
		
	  private JMenu file;
	  private JMenuItem openFile;
	  private JMenuItem create;
	  private JMenuItem closeFile;
	 
	
	  private JMenu edition;
	  private JMenuItem rotate;
	  private JMenuItem select;
	  
	  
	  private JMenu add;
	  private JMenu shape; 
	  private JMenuItem circle;
	  private JMenuItem square;
	  private JMenuItem triangle;
	  private JMenuItem rectangle;
	  private JMenuItem text;
	  private JMenuItem frame;

	  private JLabel image;
	  private JPanel panel;
	 

	  
	  public TopMenuBar(JFrame window)
	  {
		  	this.window = window;
		  	
		  	
		  	window.setLayout(new GridBagLayout());

	        this.panel = new JPanel();
	        this.panel.setLayout(new BorderLayout());
	        this.image = new JLabel("");
	        this.panel.add(this.image, BorderLayout.CENTER);
	        
	        this.window.add(this.panel, new GridBagConstraints());
		  	
	        
		  	this.menuBar= new JMenuBar();
		  	
			this.file = new JMenu("Fichier");
			this.openFile = new JMenuItem("Ouvrir fichier");
			this.create = new JMenuItem("Creer image");
			this.closeFile = new JMenuItem("Fermer");
			 
			
			this.edition = new JMenu("Edition");
			this.rotate = new JMenuItem("Tourner");
			this.select = new JMenuItem("Selectionner");
			  
			  
			this.add = new JMenu("Ajouter");
			this.shape = new JMenu("Forme"); 
			this.circle = new JMenuItem("Rond");
			this.square = new JMenuItem("Carre");
			this.triangle = new JMenuItem("Triangle");
			this.rectangle = new JMenuItem("Rectangle");
			this.text = new JMenuItem("Texte");
			this.frame = new JMenuItem("Cadre");
			
			//menu file : 
		    //	openFile
		    //	create
			//-------------
		    //	closeFile
		    this.file.add(openFile);
		    this.file.add(this.create);
		    //add separator
		    this.file.addSeparator();
		    this.file.add(closeFile);  
		    
		    //menu edition :
		    //	rotate
		    //	select
		    this.edition.add(rotate);
		    this.edition.add(select);
		    
		    //menu add :
		    //	shape : 
		    //		circle
		    //		square
		    //		triangle
		    //		rectangle
		    //	text
		    //frame
		    this.shape.add(circle);
		    this.shape.add(square);
		    this.shape.add(triangle);
		    this.shape.add(rectangle);
		    
		    this.add.add(shape);
		    this.add.add(text);
		    this.add.add(frame);
		    
		    //menubar :
		    //file | edition | add
		    this.menuBar.add(file);
		    this.menuBar.add(edition);
		    this.menuBar.add(add);
			

		    this.openFile.addActionListener(this);
		    this.create.addActionListener(this);
		    this.closeFile.addActionListener(this);
		    this.circle.addActionListener(this);
		    this.square.addActionListener(this);
		    this.rectangle.addActionListener(this);
		    this.triangle.addActionListener(this);
		    this.text.addActionListener(this);
		    this.frame.addActionListener(this);

			this.add(menuBar);
		 
	  }
	  
	  
	@Override
	public void actionPerformed(ActionEvent event)
	{
		JMenuItem selectedItem = (JMenuItem) event.getSource();

		if (selectedItem == this.openFile)
		{
			JFileChooser fileExplorer = new JFileChooser();
            int result = fileExplorer.showOpenDialog(null);
            
            if (result == JFileChooser.APPROVE_OPTION) 
            {
                File file = fileExplorer.getSelectedFile();
                try 
                {
                    this.image.setIcon(new ImageIcon(ImageIO.read(file)));
                    this.window.setSize(ImageIO.read(file).getWidth(),ImageIO.read(file).getHeight());
                    
                } 
                catch (IOException e) 
                {
                    e.printStackTrace();
                }
                return;
            }
		}
		
		if (selectedItem == this.circle)
		{
			if(this.image.getIcon() == null)
				JOptionPane.showMessageDialog(this.window, "No file selected");
			else
				System.out.println("circle");
			
			
		}
		
		if (selectedItem == this.square)
		{
			if(this.image.getIcon() == null)
				JOptionPane.showMessageDialog(this.window, "No file selected");
			else
				System.out.println("square");
		}
		
		if (selectedItem == this.rectangle)
		{
			if(this.image.getIcon() == null)
				JOptionPane.showMessageDialog(this.window, "No file selected");
			else
				System.out.println("rectangle");
		}
		
		if (selectedItem == this.triangle)
		{
			if(this.image.getIcon() == null)
				JOptionPane.showMessageDialog(this.window, "No file selected");
			else
				System.out.println("triangle");
		}
		
		
		if (selectedItem == this.closeFile)
		{
			if (JOptionPane.showConfirmDialog(this.window, "Fermer l'application ?", "Confirmation", JOptionPane.OK_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION)
				this.window.dispose();
			return;
		}
	}
}

