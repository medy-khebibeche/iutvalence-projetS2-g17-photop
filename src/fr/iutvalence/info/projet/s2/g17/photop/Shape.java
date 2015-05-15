package fr.iutvalence.info.projet.s2.g17.photop;

import java.awt.Color;
import java.awt.Graphics;

public enum Shape {

	TRIANGLE,
	CIRCLE,
	RECTANGLE,
	SQUARE;
			
	private int shapeThickness ;
	private Color colorButtom;
	private Color colorBorder;
	
	
	public void DrawShape()
	{
	 // ???
	}
	
	public void ChangeColorButtom (Color cBu)
	{
		this.colorButtom = cBu;
	}
	
	public void ChangeColorBorder (Color cBo)
	{
		this.colorBorder = cBo;
	}
	
	public void ChangeShapeThickness(int t)
	{
		this.shapeThickness = t;
	}
}
