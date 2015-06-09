package fr.iutvalence.info.projet.s2.g17.photop.GUI;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Menu;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import fr.iutvalence.info.projet.s2.g17.photop.TypeShape;

/**
 * Represents the menu bar of the application, it gathers all the Photop's function like draw, change the pointer's size...
 * @author Mathie, Jean-Batiste, Medy
 */
public class MenuBar extends JMenuBar
{
	/**
	 * The menubar
	 */
	private JMenuBar menuBar;
	/**
	 * The tab file
	 */
	private JMenu file;
	/**
	 * The menu item "open image"
	 */
	private JMenuItem openImage;
	/**
	 * The menu item "create image"
	 */
	private JMenuItem createImage;
	/**
	 * The menu item "save image"
	 */
	private JMenuItem saveImage;
	/**
	 * The menu item "save as"
	 */
	private JMenuItem saveAsImage;
	/**
	 * The menu item "Quit"
	 */
	private JMenuItem quit;
	
	/**
	 * The tab edition
	 */
	private JMenu edition;
	/**
	 * The menu item "erase"
	 */
	private JMenuItem erase;
	/**
	 * The menu item "erase all"
	 */
	private JMenuItem eraseAll;
	
	/**
	 * The menu brus
	 */
	private JMenu brush;
	/**
	 * The menu item "increase size"
	 */
	private JMenuItem increaseSize;
	/**
	 * The menu item "decrease size"
	 */
	private JMenuItem decreaseSize;
	
	/**
	 * The tabe change color
	 */
	private JMenu changeColor;
	/**
	 * The menu item "white"
	 */
	private JMenuItem white;
	/**
	 * The menu item "yellow"
	 */
	private JMenuItem yellow;
	/**
	 * The menu item "orange"
	 */
	private JMenuItem orange;
	/**
	 * The menu item "red"
	 */
	private JMenuItem red;
	/**
	 * The menu item "magenta"
	 */
	private JMenuItem magenta;
	/**
	 * The menu item "blue"
	 */
	private JMenuItem blue;
	/**
	 * The menu item "green"
	 */
	private JMenuItem green;
	/**
	 * The menu item "black"
	 */
	private JMenuItem black;
	/**
	 * The tab shape
	 */
	private JMenu shape;
	/**
	 * The menu item "circle"
	 */
	private JMenuItem circle;
	/**
	 * The menu item "triangle"
	 */
	private JMenuItem triangle;
	/**
	 * The menu item "rectangle"
	 */
	private JMenuItem rectangle;
	/**
	 * The menu item "square"
	 */
	private JMenuItem square;
	
	/**
	 * The tab embellishement
	 */
	private JMenu embellishement;
	/**
	 * The menu item "heart"
	 */
	private JMenuItem heart;
	/**
	 * The menu item "photop"
	 */
	private JMenuItem photop;
	
	/**
	 * The tab about
	 */
	private JMenu about;
	/**
	 * The menu item "about photop"
	 */
	private JMenuItem aboutPhotop;
	/**
	 * The menu item "about us"
	 */
	private JMenuItem aboutUs;
	
	/**
	 * Represents if the image is already saved or not
	 */
	private boolean imageAlreadySaved;
	/**
	 * The path of the file
	 */
	private String imagePath;
	/**
	 * the name of the image
	 */
	private String imageName;
	/**
	 * The current image
	 */
	private BufferedImage currentImage;
	
	/**
	 * The drawpanel of the application
	 */
	private DrawPanel drawPanel;
	
	/**
	 * The constructor of the menubar
	 * @param drawPanel drawPanel
	 */
	public MenuBar(DrawPanel drawPanel)
	{
		this.imageAlreadySaved = false;
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
		this.shape = new JMenu("Change shape");
		this.circle = new JMenuItem("Circle");
		this.triangle = new JMenuItem("Triangle");
		this.rectangle = new JMenuItem("Rectangle");
		this.square = new JMenuItem("Square");
		
		this.brush = new JMenu("Brush size");
		this.increaseSize = new JMenuItem("Increase +");
		this.decreaseSize = new JMenuItem("Decrease -");
		
		this.embellishement = new JMenu("Add embelishement");
		this.heart = new JMenuItem("Heart");
		this.photop = new JMenuItem("Photop");
		
		this.about = new JMenu("About");
		this.aboutPhotop = new JMenuItem("About Photop'");
		this.aboutUs = new JMenuItem("About us");
	}
	
	/**
	 * Initializes the MenuBar and adds ActionListener
	 * @param window window
	 */
	public void initMenu(final JFrame window)
	{	
		openImage.addActionListener(MenuAction.openImage(this));
		
		erase.addActionListener(MenuAction.erase(this));
		
		eraseAll.addActionListener(MenuAction.eraseAll(this));
		
		quit.addActionListener(MenuAction.quit(this));
		
		saveImage.addActionListener(MenuAction.saveImage(this));
		
		saveAsImage.addActionListener(MenuAction.saveAsImage(this));
		
		createImage.addActionListener(MenuAction.createImage(this,window));
		
		circle.addActionListener(MenuAction.circle(this));
		
		square.addActionListener(MenuAction.square(this));
		
		rectangle.addActionListener(MenuAction.rectangle(this));
		
		triangle.addActionListener(MenuAction.triangle(this));
		
		heart.addActionListener(MenuAction.heart(this));
		
		photop.addActionListener(MenuAction.photop(this));
		
		white.addActionListener(MenuAction.white(this));
		
		yellow.addActionListener(MenuAction.yellow(this));
		
		orange.addActionListener(MenuAction.orange(this));
		
		red.addActionListener(MenuAction.red(this));
		
		magenta.addActionListener(MenuAction.magenta(this));
		
		blue.addActionListener(MenuAction.blue(this));
		
		green.addActionListener(MenuAction.green(this));
		
		black.addActionListener(MenuAction.black(this));
		
		aboutPhotop.addActionListener(MenuAction.aboutPhotop());
		
		aboutUs.addActionListener(MenuAction.aboutUs());
		
		increaseSize.addActionListener(MenuAction.increaseSize(this));
		
		decreaseSize.addActionListener(MenuAction.decreaseSize(this));
		
		
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
		
		increaseSize.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, KeyEvent.CTRL_DOWN_MASK));
		brush.add(increaseSize);
		decreaseSize.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, KeyEvent.CTRL_DOWN_MASK));
		brush.add(decreaseSize);
		edition.add(brush);
		
		embellishement.add(photop);
		embellishement.add(heart);
		edition.add(embellishement);
		
		about.add(aboutPhotop);
		about.add(aboutUs);
		
		menuBar.add(file);
		menuBar.add(edition);
		menuBar.add(about);
		window.setJMenuBar(menuBar);
	}
	
	/**
	 * Returns the drawPanel
	 * @return drawPanel
	 */
	public DrawPanel getDrawPanel()
	{
		return this.drawPanel;
	}
	
	/**
	 * Returns the boolean imageAlreadySaved
	 * @return imageAlreadySaved
	 */
	public boolean getImageAlreadySaved()
	{
		return this.imageAlreadySaved;
	}
	
	/**
	 * Returns the imagePath
	 * @return imagePath
	 */
	public String getImagePath()
	{
		return this.imagePath;
	}
	
	/**
	 * Returns the currentImage
	 * @return currentImage
	 */
	public RenderedImage getCurrentImage()
	{
		return this.currentImage;
	}
	
	/**
	 * Returns the imageName
	 * @return imageName
	 */
	public String getImageName()
	{
		return this.imageName;
	}
	
	/**
	 * Sets the imageName with a given String
	 * @param showInputDialog showInputDialog
	 */
	public void setImageName(String showInputDialog)
	{
		this.imageName = showInputDialog;
	}
	
	/**
	 * Sets the imagePath with a given String
	 * @param path path
	 */
	public void setImagePath(String path)
	{
		this.imagePath = path;
	}
	
	/**
	 * Sets the currentImage with a given BufferedImage
	 * @param createScreenCapture createScreenCapture
	 */
	public void setCurrentImage(BufferedImage createScreenCapture)
	{
		this.currentImage = createScreenCapture;
	}
	
	/**
	 * Sets the boolean imageAlreadySaved with a given boolean
	 * @param b boolean
	 */
	public void setImageAlreadySaved(boolean b)
	{
		this.imageAlreadySaved = b;
	}
}
