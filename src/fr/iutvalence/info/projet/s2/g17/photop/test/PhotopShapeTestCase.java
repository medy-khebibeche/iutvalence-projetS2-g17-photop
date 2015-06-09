/**
 * 
 */
package fr.iutvalence.info.projet.s2.g17.photop.test;

import java.awt.Color;

import fr.iutvalence.info.projet.s2.g17.photop.PhotopShape;
import fr.iutvalence.info.projet.s2.g17.photop.Pointer;
import fr.iutvalence.info.projet.s2.g17.photop.TypeShape;
import junit.framework.TestCase;

/**
 * @author Bastien
 *
 */
public class PhotopShapeTestCase extends TestCase {
	
	private PhotopShape photoShape;
	private Pointer pointer = new Pointer();

	/**
	 * @param name name 
	 */
	public PhotopShapeTestCase(String name) {
		super(name);
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
		photoShape = new PhotopShape(100, 50, pointer);
		
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
		photoShape = null;
	}

	
	/**
	 * Test method for {@link fr.iutvalence.info.projet.s2.g17.photop.PhotopShape#PhotopShape(int,int,Pointer)}.
	 */
	public void testPhotopShape() 
	{
		assertNotNull("L'instance est créée", photoShape);
	}

	/**
	 * Test method for {@link fr.iutvalence.info.projet.s2.g17.photop.PhotopShape#getColor()}.
	 */
	public void testGetColor() 
	{
		assertEquals("Est ce que color est correct", Color.black, photoShape.getColor());
	}

	/**
	 * Test method for {@link fr.iutvalence.info.projet.s2.g17.photop.PhotopShape#setColor(java.awt.Color)}.
	 */
	public void testSetColor() 
	{
		photoShape.setColor(Color.blue);
		assertEquals("Est ce que color est correct", Color.blue, photoShape.getColor());
	}

	/**
	 * Test method for {@link fr.iutvalence.info.projet.s2.g17.photop.PhotopShape#getType()}.
	 */
	public void testGetType() 
	{
		assertEquals("Est ce que type est correct", TypeShape.CIRCLE, photoShape.getType());
	}

	/**
	 * Test method for {@link fr.iutvalence.info.projet.s2.g17.photop.PhotopShape#setType(fr.iutvalence.info.projet.s2.g17.photop.TypeShape)}.
	 */
	public void testSetType() 
	{
		photoShape.setType(TypeShape.RECTANGLE);
		assertEquals("Est ce que type est correct", TypeShape.RECTANGLE, photoShape.getType());
	}

	/**
	 * Test method for {@link fr.iutvalence.info.projet.s2.g17.photop.PhotopShape#getPosX()}.
	 */
	public void testGetPosX() 
	{
		assertEquals("Est ce que posX est correct", 100, photoShape.getPosX());
	}

	/**
	 * Test method for {@link fr.iutvalence.info.projet.s2.g17.photop.PhotopShape#getPosY()}.
	 */
	public void testGetPosY() {
		assertEquals("Est ce que posX est correct", 50, photoShape.getPosY());
	}

	/**
	 * Test method for {@link fr.iutvalence.info.projet.s2.g17.photop.PhotopShape#getSize()}.
	 */
	public void testGetSize() {
		assertEquals("Est ce que size est correct", 100, photoShape.getSize());
	}

}
