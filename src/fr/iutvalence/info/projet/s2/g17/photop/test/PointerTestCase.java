/**
 * 
 */
package fr.iutvalence.info.projet.s2.g17.photop.test;

import java.awt.Color;

import fr.iutvalence.info.projet.s2.g17.photop.Pointer;
import fr.iutvalence.info.projet.s2.g17.photop.TypeShape;
import junit.framework.TestCase;

/**
 * @author Bastien
 *
 */
public class PointerTestCase extends TestCase {

	private Pointer pointer;
	private Pointer pointer1;

	/**
	 * @param name name
	 */
	public PointerTestCase(String name) 
	{
		super(name); 
	}
	
	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception 
	{
		super.setUp();
		pointer = new Pointer();
		pointer1 = new Pointer(Color.blue, TypeShape.RECTANGLE, -200);
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception 
	{
		super.tearDown();
		pointer = null;
		pointer1 = null;
	}
	
	public void testPointer ()
	{
		assertNotNull("L'instance est créée", pointer);
	}

	/**
	 * Test method for {@link fr.iutvalence.info.projet.s2.g17.photop.Pointer#setColor(java.awt.Color)}.
	 */
	public void testSetColor() 
	{
		pointer.setColor(Color.CYAN);
		assertEquals("Est ce que la couleur est correct", Color.CYAN, pointer.getColor());
	}

	/**
	 * Test method for {@link fr.iutvalence.info.projet.s2.g17.photop.Pointer#setShape(fr.iutvalence.info.projet.s2.g17.photop.TypeShape)}.
	 */
	public void testSetShape() 
	{
		pointer.setShape(TypeShape.TRIANGLE);
		assertEquals("Est ce que le type de forme est correct", TypeShape.TRIANGLE, pointer.getType());
	}

	/**
	 * Test method for {@link fr.iutvalence.info.projet.s2.g17.photop.Pointer#setSize(int)}.
	 */
	public void testSetSize() 
	{
		pointer.setSize(200);
		assertEquals("Est ce que la taille de forme est correct", 200, pointer.getSize());
	}

	/**
	 * Test method for {@link fr.iutvalence.info.projet.s2.g17.photop.Pointer#getColor()}.
	 */
	public void testGetColor() 
	{
		assertEquals("Est ce que couleur est correct", Color.blue , pointer1.getColor());
	}

	/**
	 * Test method for {@link fr.iutvalence.info.projet.s2.g17.photop.Pointer#getType()}.
	 */
	public void testGetType() 
	{
		assertEquals("Est ce que type est correct", TypeShape.RECTANGLE , pointer1.getType());
	}

	/**
	 * Test method for {@link fr.iutvalence.info.projet.s2.g17.photop.Pointer#getSize()}.
	 */
	public void testGetSize() 
	{
		assertEquals("Est ce que size est correct", 200 , pointer1.getSize());
	}

}
