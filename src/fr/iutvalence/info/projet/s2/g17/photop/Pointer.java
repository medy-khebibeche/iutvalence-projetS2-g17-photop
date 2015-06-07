package fr.iutvalence.info.projet.s2.g17.photop;
import java.awt.Color;


public class Pointer
{
	
	private Color color;
	private TypeShape type;
	private int size;
	
	public Pointer()
	{
		this.color = Color.black;
		this.type = TypeShape.CIRCLE;
		this.size = 100;
	}
	
	public Pointer(Color col, TypeShape shap, int siz)
	{
		this.color = col;
		this.type = shap;
		this.size = siz;
	}
	public void setColor(Color color)
	{
		this.color = color;
	}
	public void setShape(TypeShape shape)
	{
		this.type = shape;
	}
	public void setSize(int size)
	{
		this.size = size;
	}
	public Color getColor()
	{
		return color;
	}
	public TypeShape getType()
	{
		return type;
	}
	public int getSize()
	{
		return size;
	}

}
