package fr.iutvalence.info.projet.s2.g17.photop.GUI;

import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

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

public class TopMenuBar extends JMenuBar implements ActionListener
{
	/**
	 * The main window
	 */
	private JFrame window;
	/**
	 * the drawing panel
	 */
	private DrawPanel drawPanel;

	/**
	 * The menu bar of the window
	 */
	private JMenuBar menuBar;
	/**
	 * The current image
	 * This image is temporary created and doesn't exists as an "physical" image (like "test.png" )
	 */
	private BufferedImage currentImage;
	
	/**
	 * The name of the image
	 */
	private String imageName;
	
	/**
	 * The "File" menu item
	 */
	private JMenu file;
	/**
	 * The "Open file" menu item
	 */
	private JMenuItem openFile;
	/**
	 * The "Create" menu item
	 */
	private JMenuItem create;
	/**
	 * The "Close" menu item
	 */
	private JMenuItem closeFile;
	/**
	 * The "Save" menu item
	 */
	private JMenuItem saveFile;
	
	/**
	 * The "Save to..." menu item
	 */
	private JMenuItem saveFileAs;
	/**
	 * The "Edit" menu item
	 */
	private JMenu edit;
	/**
	 * The "Rotate" menu item
	 */	
	private JMenuItem rotate;
	/**
	 * The "Select" menu item
	 */
	private JMenuItem select;
	
	/**
	 * The "Add" menu item
	 */
	private JMenu add;
	/**
	 * The "Shape" menu item
	 */
	private JMenu shape; 
	/**
	 * The "Circle" menu item
	 */
	private JMenuItem circle;
	/**
	 * The "Square" menu item
	 */
	private JMenuItem square;
	/**
	 * The "Triangle" menu item
	 */
	private JMenuItem triangle;
	/**
	 * The "Rectangle" menu item
	 */
	private JMenuItem rectangle;
	/**
	 * The "Text" menu item
	 */
	private JMenuItem text;
	/**
	 * The "Frame" menu item 
	 */
	private JMenuItem frame;
	
	/**
	 * The "Help" menu item
	 */
	private JMenu help;
	
	/**
	 * The "About Photop'" menu item
	 */
	private JMenuItem aboutPhotop;
	
	/**
	 * The "About us'" menu item
	 */
	private JMenuItem aboutUs;
	
	/**
	 * The "canvas"
	 */
	private JLabel image;
	/**
	 * The main panel
	 */
	private JPanel panel;
	/**
	 * Boolean which represent if the image has been already saved before
	 */
	private boolean wasSaved;
	
	/**
	 * The path of the current image
	 */
	private String path;
	
	
	/**
	 * The topMenuBar class which represents the top menu bar of the frame
	 * @param window
	 */
	public TopMenuBar(JFrame window, DrawPanel drawPanel)
	{
		this.wasSaved = false;
		this.window = window;
		this.drawPanel = drawPanel;
		
		this.window.setLayout(new GridBagLayout());
		
		this.panel = new JPanel();
		this.panel.setLayout(new BorderLayout());
		this.image = new JLabel("");
		this.panel.add(this.image, BorderLayout.CENTER);
		
		this.window.add(this.panel, new GridBagConstraints());
		
		
		this.menuBar= new JMenuBar();
		
		this.file = new JMenu("File");
		this.openFile = new JMenuItem("Open file");
		this.create = new JMenuItem("Create picture");
		this.closeFile = new JMenuItem("Close");
		this.saveFile = new JMenuItem("Save");
		this.saveFileAs = new JMenuItem("Save as...");
		
		
		this.add = new JMenu("Add");
		this.shape = new JMenu("Shape"); 
		this.circle = new JMenuItem("Circle");
		this.square = new JMenuItem("Square");
		this.triangle = new JMenuItem("Triangle");
		this.rectangle = new JMenuItem("Rectangle");
		this.text = new JMenuItem("Text");
		this.frame = new JMenuItem("Frame");
		
		this.help = new JMenu("Help");
		this.aboutPhotop = new JMenuItem("About Photop");
		this.aboutUs = new JMenuItem("About us");
		
	}
	
	public void initTopMenuBar(JFrame window, DrawPanel drawPanel)
	{
		//menu file : 
		//	openFile
		//	create
		//	save file
		//	save file as
		//-------------
		//	closeFile
		this.file.add(openFile);
		this.file.add(create);
		this.file.add(saveFile);
		this.file.add(saveFileAs);
		//add separator
		this.file.addSeparator();
		this.file.add(closeFile);  
		
		//menu edition :
		//	rotate
		//	select
		this.edit.add(rotate);
		this.edit.add(select);
		
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
		
		//menu help :
		//	about photop'
		//	about us
		this.help.add(aboutPhotop);
		this.help.add(aboutUs);
		
		//menubar :
		//file | edition | add | help  
		this.menuBar.add(file);
		this.menuBar.add(edit);
		this.menuBar.add(add);
		this.menuBar.add(help);
		
		this.openFile.addActionListener(this);
		this.create.addActionListener(this);
		this.closeFile.addActionListener(this);
		this.circle.addActionListener(this);
		this.square.addActionListener(this);
		this.rectangle.addActionListener(this);
		this.triangle.addActionListener(this);
		this.text.addActionListener(this);
		this.frame.addActionListener(this);
		this.saveFile.addActionListener(this);
		this.saveFileAs.addActionListener(this);
		this.aboutPhotop.addActionListener(this);
		this.aboutUs.addActionListener(this);
		this.select.addActionListener(this);
		this.rotate.addActionListener(this);
		
		this.add(menuBar);
		this.window.setJMenuBar(this);
	}
	
	/**
	 * All the actions listeners
	 */
	@Override
	public void actionPerformed(ActionEvent event)
	{
		JMenuItem selectedItem = (JMenuItem) event.getSource();
		
		if (selectedItem == this.openFile)
		{
			MenuAction.openFile(this);
		}
		
		if (selectedItem == this.create)
		{	
			MenuAction.createFile(this);
		}
		
		if (selectedItem == this.circle)
		{
			MenuAction.circle(this,this.drawPanel);
		}
		
		if (selectedItem == this.square)
		{
			MenuAction.square(this,this.drawPanel);
		}
		
		if (selectedItem == this.rectangle)
		{
			MenuAction.rectangle(this,this.drawPanel);
		}
		
		if (selectedItem == this.triangle)
		{
			MenuAction.triangle(this,this.drawPanel);
		}
		
		if (selectedItem == this.closeFile)
		{
			if (JOptionPane.showConfirmDialog(this.window, "Do you really want to quit Photop ?", "Confirmation", JOptionPane.OK_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION)
				this.window.dispose();
			return;
		}
		if(selectedItem == this.saveFileAs)
		{
			MenuAction.saveFileAs(this);
		}
		
		if(selectedItem == this.aboutPhotop)
		{
			JOptionPane.showMessageDialog(this.window, "Welcome on Photop !");
		}
		
		if(selectedItem == this.aboutUs)
		{
			JOptionPane.showMessageDialog(this.window, "Creators : \n Mathie BERTHOLET - Médy KHEBIBECHE - Jean-Baptiste MERCIER \n Bastien PLANEILLE - Corentin VALLIER");
		}
		
		if(selectedItem == this.saveFile)
		{
			if(this.image.getIcon() == null)
				JOptionPane.showMessageDialog(this.window, "No file selected");
			else 
			{
				BufferedImage savedImage = this.currentImage;
				try
				{
					JFileChooser directoryChooser = new JFileChooser();
					JOptionPane nameChooser = new JOptionPane();
					
					directoryChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
					
					if(this.wasSaved)
					{
						this.window.setTitle("Photop' : "+this.imageName+".png");
						ImageIO.write( this.currentImage, "PNG", new File(this.path+"/"+this.imageName+".PNG"));
						JOptionPane.showMessageDialog(this.window, "Image "+this.imageName+".png saved !");
					}
					else
					{
						String showInputDialog = nameChooser.showInputDialog(window,"Name of the image ?");
						this.imageName = showInputDialog;
						
						if(this.imageName != null)
						{
							if(directoryChooser.showOpenDialog(window) == JFileChooser.APPROVE_OPTION)
							{
								this.path = directoryChooser.getSelectedFile().getPath();
								System.out.println(this.path);
								this.window.setTitle("Photop' : "+this.imageName+".png");
								ImageIO.write( this.currentImage, "PNG", new File(this.path+"/"+showInputDialog+".PNG"));
								this.wasSaved = true;
								JOptionPane.showMessageDialog(this.window, "Image "+showInputDialog+".png saved !");
							}
						}
					}
				} 
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

	
	public String getImageName()
	{
		return imageName;
	}

	public void setImageName(String imageName)
	{
		this.imageName = imageName;
	}


	public boolean isWasSaved()
	{
		return wasSaved;
	}

	public void setWasSaved(boolean wasSaved)
	{
		this.wasSaved = wasSaved;
	}

	public String getPath()
	{
		return path;
	}

	public void setPath(String path)
	{
		this.path = path;
	}

	public void setWindow(JFrame window)
	{
		this.window = window;
	}

	public void setCurrentImage(BufferedImage currentImage)
	{
		this.currentImage = currentImage;
	}

	public JFrame getWindow()
	{
		return window;
	}

	public BufferedImage getCurrentImage()
	{
		return currentImage;
	}

	public JLabel getImage()
	{
		return image;
	}

	
}

