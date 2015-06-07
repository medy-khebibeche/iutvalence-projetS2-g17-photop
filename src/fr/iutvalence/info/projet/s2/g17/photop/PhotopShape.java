package fr.iutvalence.info.projet.s2.g17.photop;


import java.awt.Color;

/**
 * 
 * @author Bastien, Mathie
 *
 */
public class PhotopShape extends PhotopObject
{
	  private Color color;

	  private TypeShape type;
	  
	  public PhotopShape(int x, int y, Pointer point)
	  {
		  super(new Position(x, y), point.getSize());

		    this.color = point.getColor();
		    this.type = point.getType();
		  }

		  public Color getColor() 
		  {
		    return color;
		  }
		  public void setColor(Color color) 
		  {
		    this.color = color;
		  }
	
		  public TypeShape getType() 
		  {
		    return this.type;
		  }
		  public void setType(TypeShape type) 
		  {
		    this.type = type;
		  }
	
		  public int getPosX()
		  {
			  return this.getObjectPosition().getPosX();
		  }
		  public int getPosY()
		  {
			  return this.getObjectPosition().getPosY();
		  }
		  
		  public int getSize()
		  {
			  return this.getObjectDimension();
		  }
}



