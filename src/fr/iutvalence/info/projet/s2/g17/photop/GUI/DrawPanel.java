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
	private Pointer point;
	
	private Image image;
	
	private ArrayList<PhotopShape> points = new ArrayList<PhotopShape>();  
	
	private int pointsListSize = this.points.size();
	
	
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
	
	
	public void paintComponent(Graphics g) 
	{
		
		g.setColor(Color.white);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		//TODO center the image
		g.drawImage(this.image, this.getWidth()/2, this.getHeight()/2, null);
		
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
	                    new int[]{photopShape.getPosX()+50, photopShape.getPosX()+100, photopShape.getPosX()+0},
	                    new int[]{photopShape.getPosY()+0, photopShape.getPosY()+100, photopShape.getPosY()+100},
	                    3);
			     g.fillPolygon(poly);
			}
			else if(photopShape.getType().equals(TypeShape.RECTANGLE))
			{
				g.fillRect(photopShape.getPosX(), photopShape.getPosY(), photopShape.getSize()+100, photopShape.getSize());
			}	
			else
			{
				Image img = getToolkit().getImage("icones/heart2.png");
				ImageObserver observer = null;
				g.drawImage(img , photopShape.getPosX(), photopShape.getPosY(), observer);	    
			}		
		}        
	}
	
	
	
	public void erase()
	{
		if(pointsListSize!=0)
		{
			this.points.remove(pointsListSize-1);
			this.pointsListSize = this.points.size();
		}
		
		repaint();
	}
	
	public void eraseAll()
	{
		this.points = new ArrayList<PhotopShape>();
		repaint();
	}
	
	public void setPointerColor(Color c)
	{
		this.point.setColor(c);
	}
	
	public void setPointerType(TypeShape type)
	{
		this.point.setShape(type);
	}
	
	public void setImage(Image image)
	{
		this.image = image;
	}


}