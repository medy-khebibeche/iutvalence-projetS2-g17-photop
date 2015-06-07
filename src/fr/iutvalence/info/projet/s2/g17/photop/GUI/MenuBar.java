package fr.iutvalence.info.projet.s2.g17.photop.GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

import fr.iutvalence.info.projet.s2.g17.photop.TypeShape;

public class MenuBar extends JMenuBar
{
	private JMenuBar menuBar;
	private JMenu file;
	private JMenuItem openImage;
	private JMenuItem createImage;
	private JMenuItem saveImage;
	private JMenuItem saveAsImage;
	private JMenuItem quit;
	
	private JMenu edition;
	private JMenuItem erase;
	private JMenuItem eraseAll;
	private JMenu changeColor;
	private JMenuItem white;
	private JMenuItem yellow;
	private JMenuItem orange;
	private JMenuItem red;
	private JMenuItem magenta;
	private JMenuItem purple;
	private JMenuItem blue;
	private JMenuItem green;
	private JMenuItem brown;
	private JMenuItem black;
	
	private JMenu shape;
	private JMenuItem circle;
	private JMenuItem triangle;
	private JMenuItem rectangle;
	private JMenuItem square;
	
	private JMenu embellishement;
	private JMenuItem heart;
	private JMenuItem star;
	
	private JMenu about;
	private JMenuItem aboutPhotop;
	private JMenuItem aboutUs;
	
	private DrawPanel drawPanel;
	
	public MenuBar(DrawPanel drawPanel)
	{
		
		this.menuBar = new JMenuBar();
		
		this.drawPanel = drawPanel;
		
		this.file = new JMenu("File");
		this.openImage = new JMenuItem("Open image");
		this.createImage = new JMenuItem("Create image");
		this.saveImage = new JMenuItem("Save image");
		this.saveAsImage = new JMenuItem("Save as");
		this.quit = new JMenuItem("Quit");
		
		this.edition = new JMenu("Edition");
		this.erase = new JMenuItem("Erase");
		this.eraseAll = new JMenuItem("Erase all");
		this.changeColor = new JMenu("Change color");
		this.white = new JMenuItem("White");
		this.yellow = new JMenuItem("Yellow");
		this.orange = new JMenuItem("Orange");
		this.red = new JMenuItem("Red");
		this.magenta = new JMenuItem("Magenta");
		this.blue = new JMenuItem("Blue");
		this.green = new JMenuItem("Green");
		this.black = new JMenuItem("Black");
		this.shape = new JMenu("Add shape");
		this.circle = new JMenuItem("Circle");
		this.triangle = new JMenuItem("Triangle");
		this.rectangle = new JMenuItem("Rectangle");
		this.square = new JMenuItem("Square");
		
		this.embellishement = new JMenu("Add embelishement");
		this.heart = new JMenuItem("Heart");
		this.star = new JMenuItem("Star");
		
		this.about = new JMenu("About");
		this.aboutPhotop = new JMenuItem("About Photop'");
		this.aboutUs = new JMenuItem("About us");
		
	}
	/**
	 * Initializes the MenuBar and adds ActionListener and ActionPerformed
	 * @param window
	 */
	public void initMenu(JFrame window)
	{	
		openImage.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
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
							JOptionPane.showMessageDialog(null, "Image resolution is too big.");
						}
						else
						{
							//drawPanel.drawImage(ImageIO.read(file), null);
							System.out.println(fileExplorer.getSelectedFile().getName());
						}
					} 
					catch (IOException ex) 
					{
						ex.printStackTrace();
					}
					return;
				}						
			}
		});
		erase.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				drawPanel.erase();				
			}
		});
		eraseAll.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				drawPanel.eraseAll();				
			}
		});
		
		quit.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if (JOptionPane.showConfirmDialog(null, "Do you really want to quit Photop ?", "Confirmation", JOptionPane.OK_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION)
					System.exit(0);				
			}
		});
		
		circle.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				drawPanel.setPointerType(TypeShape.CIRCLE);				
			}
		});
		square.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				drawPanel.setPointerType(TypeShape.SQUARE);				
			}
		});
		rectangle.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				drawPanel.setPointerType(TypeShape.RECTANGLE);				
			}
		});
		triangle.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				drawPanel.setPointerType(TypeShape.TRIANGLE);				
			}
		});
		
		
		white.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				drawPanel.setPointerColor(Color.white);
			}});
		yellow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				drawPanel.setPointerColor(Color.yellow);
			}});
		orange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				drawPanel.setPointerColor(Color.orange);
			}});
		red.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				drawPanel.setPointerColor(Color.red);
			}});
		magenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				drawPanel.setPointerColor(Color.magenta);
			}});
		blue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				drawPanel.setPointerColor(Color.blue);
			}});
		green.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				drawPanel.setPointerColor(Color.green);
			}});
		black.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				drawPanel.setPointerColor(Color.black);
			}});
		
		aboutPhotop.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null, "Welcome on Photop !");				
			}
		});
		aboutUs.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null, "Creators : \n Mathie BERTHOLET - Médy KHEBIBECHE - Jean-Baptiste MERCIER - Bastien PLANEILLE - Corentin VALLIER");				
			}
		});
		
		file.add(openImage);
		openImage.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK));
		file.add(createImage);
		createImage.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK));
		file.add(saveImage);
		saveImage.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK));
		file.add(saveAsImage);
		file.add(erase);
		erase.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, KeyEvent.CTRL_DOWN_MASK));
		file.add(eraseAll);
		eraseAll.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, KeyEvent.CTRL_DOWN_MASK));;
		
		file.addSeparator();
		file.add(quit);
		quit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, KeyEvent.CTRL_DOWN_MASK));
		
		shape.add(circle);
		shape.add(square);
		shape.add(triangle);
		shape.add(rectangle);
		edition.add(shape);
		
		changeColor.add(white);
		changeColor.add(yellow);
		changeColor.add(orange);
		changeColor.add(red);
		changeColor.add(magenta);
		changeColor.add(blue);
		changeColor.add(green);
		changeColor.add(black);
		edition.add(changeColor);
		
		embellishement.add(star);
		embellishement.add(heart);
		edition.add(embellishement);
		
		about.add(aboutPhotop);
		about.add(aboutUs);
		
		
		menuBar.add(file);
		menuBar.add(edition);
		menuBar.add(about);
		window.setJMenuBar(menuBar);
	}
}
