/**
 * 
 */
package fr.iutvalence.info.projet.s2.g17.photop.test;

import fr.iutvalence.info.projet.s2.g17.photop.Position;
import junit.framework.TestCase;

/**
 * @author Bastien26
 *
 */
public class PositionTestCase extends TestCase {
	
	private Position position ;

	/**
	 * @param name name
	 */
	public PositionTestCase(String name) {
		super(name);
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
		position = new Position(50,60) ;
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
		position = null;
	}

	/**
	 * Test method for {@link fr.iutvalence.info.projet.s2.g17.photop.Position#Position(int, int)}.
	 */
	public final void testPosition() 
	{
		assertNotNull("L'instance est créée", position);
	}

	/**
	 * Test method for {@link fr.iutvalence.info.projet.s2.g17.photop.Position#getPosX()}.
	 */
	public final void testGetPosX() 
	{
		assertEquals("Est ce que posX est correct", 50, position.getPosX());
	}

	/**
	 * Test method for {@link fr.iutvalence.info.projet.s2.g17.photop.Position#setPosX(int)}.
	 */
	public final void testSetPosX() 
	{
		position.setPosX(100);
		assertEquals("Est ce que posX est correct", 100, position.getPosX());
	}

	/**
	 * Test method for {@link fr.iutvalence.info.projet.s2.g17.photop.Position#getPosY()}.
	 */
	public final void testGetPosY() 
	{
		assertEquals("Est ce que posX est correct", 60, position.getPosY());
	}

	/**
	 * Test method for {@link fr.iutvalence.info.projet.s2.g17.photop.Position#setPosY(int)}.
	 */
	public final void testSetPosY() 
	{
		position.setPosY(100);
		assertEquals("Est ce que posX est correct", 100, position.getPosY());
	}

}
