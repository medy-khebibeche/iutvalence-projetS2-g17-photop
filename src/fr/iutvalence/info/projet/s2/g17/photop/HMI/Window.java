package fr.iutvalence.info.projet.s2.g17.photop.HMI;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JFileChooser;

import javax.swing.JFrame;

import javax.swing.JMenu;

import javax.swing.JMenuBar;

import javax.swing.JMenuItem;
//TODO javadoc
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
 *  <td>create : </br> an Image(png,jpg,bmp), a file</td>
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
//	create :         |   select         |  		circle    
//		createImage  |                  |  		square    
//		createFile   |                  |  		triangle  
//	---------------- |                  |  		rectangle 
//	closeFile        |                  |  	text          
//                   |                  |   frame         
public class Window extends JFrame
{
			
		  private JMenuBar menuBar = new JMenuBar();
		  
		
		  private JMenu file = new JMenu("Fichier");
		  private JMenu create = new JMenu("Creer fichier");
		  
		
		  private JMenu edition = new JMenu("Edition");
		  
		  
		  private JMenu add = new JMenu("Ajouter");
		  private JMenu shape = new JMenu("Forme");

		  private JMenuItem openFile = new JMenuItem("Ouvrir fichier");
		  private JMenuItem closeFile = new JMenuItem("Fermer");
		  
		  private JMenuItem rotate = new JMenuItem("Tourner");
		  private JMenuItem select = new JMenuItem("Selectionner");
		  
		  private JMenuItem circle = new JMenuItem("Rond");
		  private JMenuItem square = new JMenuItem("Carre");
		  private JMenuItem triangle = new JMenuItem("Triangle");
		  private JMenuItem rectangle = new JMenuItem("Rectangle");

		  private JMenuItem text = new JMenuItem("Texte");
		  private JMenuItem frame = new JMenuItem("Cadre");
		  
		  private JMenuItem createImage = new JMenuItem("Creer image");
		  private JMenuItem createFile = new JMenuItem("Creer fichier");

		  
		  
		  public Window(){
			  
			 // window size and location
		    this.setSize(500, 300);
		    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    this.setLocationRelativeTo(null);

		    //menu file : 
		    //	openFile
		    //	create:
		    //		createImage
		    //		createFile
		    //	------------------
		    //	closeFile
		    this.file.add(openFile);

		    //Open the file explorer view when openFile is selected
		    openFile.addActionListener(new ActionListener()
		    {
			      public void actionPerformed(ActionEvent arg0) 
			      {
			    	  //explorer file box
						JFileChooser explorer = new JFileChooser();
				         explorer.showOpenDialog(null);
			      }        
			 });
		    
		    
		    //fill the submenu create
		    this.create.add(createImage);
		    this.create.add(createFile);

		    //add submenu create to menu file
		    this.file.add(this.create);

		    //add separator
		    this.file.addSeparator();
		    
		    //quit the application when closeFile is selected
		    closeFile.addActionListener(new ActionListener()
		    {
		      public void actionPerformed(ActionEvent arg0)
		      {
		        System.exit(0);
		      }        
		    });
		    
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
		    this.setJMenuBar(menuBar);
		    this.setVisible(true);
		  }
		  
}
		
	