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

public class DrawPanel extends JPanel
{
	/**
	 * The pointer
	 */
	private Pointer point;
	
	/**
	 * The image
	 */
	private Image image;
	
	// c'est quoi ce truc ?
	private ArrayList<PhotopShape> points = new ArrayList<PhotopShape>();  
	

	private int pointsListSize = this.points.size();
	
	/**
	 * This method allows to draw an image in the panel
	 * @param img
	 */
	public DrawPanel(Image img)
	{
		this.point = new Pointer();
		this.image = img;
		this.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				pointsListSize = points.size();
				points.add(new PhotopShape(e.getX() - (point.getSize() / 2), e.getY() - (point.getSize() / 2),point));
				repaint();
			}
		});
		
		this.addMouseMotionListener(new MouseMotionListener(){
			public void mouseDragged(MouseEvent e) {
				pointsListSize = points.size();
				points.add(new PhotopShape(e.getX() - (point.getSize() / 2), e.getY() - (point.getSize() / 2),point));
				repaint();
			}
			
			public void mouseMoved(MouseEvent e) {}
		});
		
	}
	
	/**
	 * This method allows to paint a component
	 * @param g
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
				g.drawImage(img , photopShape.getPosX(), photopShape.getPosY(), observer);;	    
			}	
		}        
	}
	
	
	/**
	 * This method allows to erase the previous paint
	 */
	public void erase()
	{
		if(pointsListSize!=0)
		{
			this.points.remove(pointsListSize-1);
			this.pointsListSize = this.points.size();
		}
		
		repaint();
	}
	
	/**
	 * This method allows to erase all the paint
	 */
	public void eraseAll()
	{
		this.points = new ArrayList<PhotopShape>();
		repaint();
	}
	
	/**
	 * The setter of pointer color
	 * @param c
	 */
	public void setPointerColor(Color c)
	{
		this.point.setColor(c);
	}
	
	/**
	 * The setter of pointer type
	 * @param type
	 */
	public void setPointerType(TypeShape type)
	{
		this.point.setShape(type);
	}
	
	/**
	 * the setter of image
	 * @param image
	 */
	public void setImage(Image image)
	{
		this.image = image;
	}
	
	/**
	 * the setter of pointer size
	 * @param size
	 */
	public void setPointerSize(int size)
	{
		this.point.setSize(size+this.point.getSize());
	}

}
