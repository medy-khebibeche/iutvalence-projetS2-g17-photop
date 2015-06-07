package fr.iutvalence.info.projet.s2.g17.photop.GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import fr.iutvalence.info.projet.s2.g17.photop.TypeShape;

public class MenuAction
{

	public static void openFile(TopMenuBar topMenuBar)
	{
		JFileChooser fileExplorer = new JFileChooser();
		int result = fileExplorer.showOpenDialog(null);
		
		if (result == JFileChooser.APPROVE_OPTION) 
		{
			File file = fileExplorer.getSelectedFile();
			try 
			{
				Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
				double screenWidth = screenSize.getWidth();
				double screenHeight = screenSize.getHeight();
				
				//TODO Check verification for the size of the image
				if(ImageIO.read(file).getWidth() > screenWidth || ImageIO.read(file).getHeight() > screenHeight )
				{
					JOptionPane.showMessageDialog(topMenuBar.getWindow(), "Image resolution is too big.");
					
				}
				else
				{
					topMenuBar.setCurrentImage(ImageIO.read(file));
					topMenuBar.getImage().setIcon(new ImageIcon(ImageIO.read(file)));
					topMenuBar.getWindow().setTitle("Photop' : "+fileExplorer.getSelectedFile().getName());
					System.out.println(fileExplorer.getSelectedFile().getName());
				}
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			return;
		}		
	}

	public static void createFile(TopMenuBar topMenuBar)
	{
		int height = Integer.parseInt(new JOptionPane().showInputDialog(topMenuBar.getWindow(),"Which height do you want ?"));
		int width = Integer.parseInt(new JOptionPane().showInputDialog(topMenuBar.getWindow(),"Which width do you want ?"));
		
		BufferedImage emptyImage = new BufferedImage(width,height, BufferedImage.TYPE_INT_RGB);
		topMenuBar.setCurrentImage(emptyImage);
		for(int x=0; x< emptyImage.getWidth() ; x++)
		{
			for(int y=0; y<emptyImage.getHeight(); y++)
			{
				emptyImage.setRGB(x, y, Color.WHITE.getRGB());
			}
		}
		
		topMenuBar.getImage().setIcon(new ImageIcon(topMenuBar.getCurrentImage()));		
		
		
	}

	public static void saveFileAs(TopMenuBar topMenuBar)
	{
		if(topMenuBar.getImage().getIcon() == null)
			JOptionPane.showMessageDialog(topMenuBar.getWindow(), "No file selected");
		else 
		{
			JFileChooser directoryChooser = new JFileChooser();
			directoryChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			JOptionPane nameChooser = new JOptionPane();
			
			String showInputDialog = nameChooser.showInputDialog(topMenuBar.getWindow(),"Name of the image ?");
			topMenuBar.setImageName(showInputDialog);
			
			if(topMenuBar.getImageName() != null)
			{
				if(directoryChooser.showOpenDialog(topMenuBar.getWindow()) == JFileChooser.APPROVE_OPTION)
				{
					topMenuBar.setPath(directoryChooser.getSelectedFile().getPath());
					System.out.println(topMenuBar.getPath());
					topMenuBar.getWindow().setTitle("Photop' : "+topMenuBar.getImageName()+".png");
					try
					{
						ImageIO.write( topMenuBar.getCurrentImage(), "PNG", new File(topMenuBar.getPath()+"/"+topMenuBar.getImageName()+".PNG"));
					} 
					catch (IOException e)
					{
						e.printStackTrace();
					}
					topMenuBar.setWasSaved(true);
					JOptionPane.showMessageDialog(topMenuBar.getWindow(), "Image "+showInputDialog+".png saved !");
				}
			}
		}
	}

	public static void circle(TopMenuBar topMenuBar, DrawPanel drawPanel)
	{
		if(topMenuBar.getImage().getIcon() == null)
			JOptionPane.showMessageDialog(topMenuBar.getWindow(), "No file selected");
		else
		{
			drawPanel.setPointerType(TypeShape.CIRCLE);
			System.out.println("circle");
		}
	}
	public static void triangle(TopMenuBar topMenuBar, DrawPanel drawPanel)
	{
		if(topMenuBar.getImage().getIcon() == null)
			JOptionPane.showMessageDialog(topMenuBar.getWindow(), "No file selected");
		else
		{
			drawPanel.setPointerType(TypeShape.TRIANGLE);
			System.out.println("triangle");
		}
	}
	public static void square(TopMenuBar topMenuBar, DrawPanel drawPanel)
	{
		if(topMenuBar.getImage().getIcon() == null)
			JOptionPane.showMessageDialog(topMenuBar.getWindow(), "No file selected");
		else
		{
			drawPanel.setPointerType(TypeShape.SQUARE);
			System.out.println("square");
		}
	}
	public static void rectangle(TopMenuBar topMenuBar, DrawPanel drawPanel)
	{
		if(topMenuBar.getImage().getIcon() == null)
			JOptionPane.showMessageDialog(topMenuBar.getWindow(), "No file selected");
		else
		{
			drawPanel.setPointerType(TypeShape.RECTANGLE);
			System.out.println("rectangle");
		}
	}
	
}
