package fr.iutvalence.info.projet.s2.g17.photop.GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Polygon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.util.ArrayList;

import fr.iutvalence.info.projet.s2.g17.photop.PhotopShape;

import javax.swing.JPanel;

import fr.iutvalence.info.projet.s2.g17.photop.Pointer;
import fr.iutvalence.info.projet.s2.g17.photop.TypeShape;

/**
 * A DrawPanel is the panel used to draw
 * @author Mathie
 */
public class DrawPanel extends JPanel
{
	/**
	 * The pointer used to draw on the DrawPanel
	 */
	private Pointer point;
	
	/**
	 * The image selected in the JFileChooser (null if not)
	 */
	private Image image;
	
	/**
	 * An array of PhotopShape : represents all the PhotopShape draw on the DrawPanel
	 */
	private ArrayList<PhotopShape> points = new ArrayList<PhotopShape>();  
	
	/**
	 * Initializes the DrawPanel
	 * @param img the image selected in the JFileChooser
	 */
	public DrawPanel(Image img)
	{
		this.point = new Pointer();
		this.image = img;
		this.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				points.add(new PhotopShape(e.getX() - (point.getSize() / 2), e.getY() - (point.getSize() / 2),point));
				repaint();
			}
		});
		
		this.addMouseMotionListener(new MouseMotionListener(){
			public void mouseDragged(MouseEvent e) {
				points.add(new PhotopShape(e.getX() - (point.getSize() / 2), e.getY() - (point.getSize() / 2),point));
				repaint();
			}
			
			public void mouseMoved(MouseEvent e) {}
		});
		
	}
	
	/**
	 * Draws the selected image and all the PhotopShapes contain in the array
	 * @param g graphics
	 */
	public void paintComponent(Graphics g) 
	{
		g.setColor(Color.white);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.drawImage(this.image, getX(), getY(), null);
		
		for(PhotopShape photopShape : this.points)
		{
			g.setColor(photopShape.getColor());
			
			if(photopShape.getType().equals(TypeShape.SQUARE))
			{
				g.fillRect(photopShape.getPosX(), photopShape.getPosY(), photopShape.getSize(), photopShape.getSize());
			}
			else if(photopShape.getType().equals(TypeShape.CIRCLE))
			{
				g.fillOval(photopShape.getPosX(), photopShape.getPosY(), photopShape.getSize(), photopShape.getSize());
			}
			else if(photopShape.getType().equals(TypeShape.TRIANGLE))
			{
				Polygon poly = new Polygon(
						new int[]{photopShape.getPosX()+50, photopShape.getPosX()+100, photopShape.getPosX()},
						new int[]{photopShape.getPosY(), photopShape.getPosY()+100, photopShape.getPosY()+100},
						3);
				g.fillPolygon(poly);
			}
			else if(photopShape.getType().equals(TypeShape.RECTANGLE))
			{
				g.fillRect(photopShape.getPosX(), photopShape.getPosY(), photopShape.getSize()+100, photopShape.getSize());
			}	
			else if(photopShape.getType().equals(TypeShape.HEART))
			{
				Image img = getToolkit().getImage(getClass().getResource("/fr/iutvalence/info/projet/s2/g17/photop/GUI/heart.png"));
				ImageObserver observer = null;
				g.drawImage(img , photopShape.getPosX(), photopShape.getPosY(), observer);;	    
			}	
			else if(photopShape.getType().equals(TypeShape.PHOTOP))
			{
				Image img = getToolkit().getImage(getClass().getResource("/fr/iutvalence/info/projet/s2/g17/photop/GUI/123.png"));
				ImageObserver observer = null;
				g.drawImage(img , photopShape.getPosX()-photopShape.getSize(), photopShape.getPosY()-photopShape.getSize(), observer);   
			}	
		}        
	}
	
	
	/**
	 * Erases the last PhotopShape painted
	 */
	public void erase()
	{
		if(this.points.size()!=0)
		{
			this.points.remove(this.points.size()-1);
		}
		repaint();
	}
	
	/**
	 * Erases all the PhotopShapes painted
	 */
	public void eraseAll()
	{
		this.points = new ArrayList<PhotopShape>();
		repaint();
	}
	
	/**
	 * Sets the pointer's color with a given color
	 * @param c color
	 */
	public void setPointerColor(Color c)
	{
		this.point.setColor(c);
	}
	
	/**
	 * Sets the pointer's type with a given type
	 * @param type type
	 */
	public void setPointerType(TypeShape type)
	{
		this.point.setShape(type);
	}
	
	/**
	 * Sets the pointer's image with a given image
	 * @param image image
	 */
	public void setImage(Image image)
	{
		this.image = image;
	}
	
	/**
	 * Sets the pointer's size with a given size
	 * @param size size
	 */
	public void setPointerSize(int size)
	{
		this.point.setSize(size+this.point.getSize());
	}
	
}
