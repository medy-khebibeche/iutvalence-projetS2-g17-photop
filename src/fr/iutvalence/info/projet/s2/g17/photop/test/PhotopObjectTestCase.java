/**
 * 
 */
package fr.iutvalence.info.projet.s2.g17.photop.test;

import fr.iutvalence.info.projet.s2.g17.photop.PhotopObject;
import fr.iutvalence.info.projet.s2.g17.photop.Position;
import junit.framework.TestCase;

/**
 * @author Bastien
 *
 */
public class PhotopObjectTestCase extends TestCase {

	private PhotopObject photopObject;
	private Position position = new Position (50,50);
	private Position position1 = new Position(10,10);
	/**
	 * @param name
	 */
	public PhotopObjectTestCase(String name) {
		super(name);
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
		photopObject = new PhotopObject(position,100);
		}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
		photopObject = null;
	}

	/**
	 * Test method for {@link fr.iutvalence.info.projet.s2.g17.photop.PhotopObject#PhotopObject(fr.iutvalence.info.projet.s2.g17.photop.Position, int)}.
	 */
	public final void testPhotopObject() 
	{
		assertNotNull("L'instance est créée", photopObject);
	}

	/**
	 * Test method for {@link fr.iutvalence.info.projet.s2.g17.photop.PhotopObject#getObjectPosition()}.
	 */
	public final void testGetObjectPosition() 
	{
		assertEquals("Est ce que position est correct", 100 , photopObject.getObjectPosition());
	}

	/**
	 * Test method for {@link fr.iutvalence.info.projet.s2.g17.photop.PhotopObject#setObjectPosition(fr.iutvalence.info.projet.s2.g17.photop.Position)}.
	 */
	public final void testSetObjectPosition() 
	{
		photopObject.setObjectPosition(position1);
		assertEquals("Est ce que position est correct", position1 , photopObject.getObjectPosition());
	}

	/**
	 * Test method for {@link fr.iutvalence.info.projet.s2.g17.photop.PhotopObject#getObjectDimension()}.
	 */
	public final void testGetObjectDimension() 
	{
		assertEquals("Est ce que dimension est correct", 100 , photopObject.getObjectDimension());
	}

	/**
	 * Test method for {@link fr.iutvalence.info.projet.s2.g17.photop.PhotopObject#setObjectDimension(int)}.
	 */
	public final void testSetObjectDimension() 
	{
		photopObject.setObjectDimension(200);
		assertEquals("Est ce que dimension est correct", 200 , photopObject.getObjectDimension());
	}

}
