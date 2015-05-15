package fr.iutvalence.info.projet.s2.g17.photop;

/**
 * Represents an angle
 * An angle has a value
 * @author Jean-Baptiste
 *
 */
public class Angle
{
	/**
	 * The value of the angle
	 */
	private int angleValue;

	/**
	 * Creates an angle
	 * @param angleValue
	 */
	public Angle(int angleValue)
	{
		this.angleValue = angleValue;
	}

	/**
	 * returns the Angle's value
	 * @return angleValue the Angle's value
	 */
	public int getAngleValue()
	{
		return angleValue;
	}

	/**
	 * Sets the angle's value
	 * @param angleValue the angle's value to set
	 */
	public void setAngleValue(int angleValue)
	{
		this.angleValue = angleValue;
	}

	/**
	 * adds the current angle with an other
	 * @param newAngle
	 * @return this the changed angle
	 */
	public Angle rotate(Angle newAngle)
	{
		this.angleValue = this.angleValue + newAngle.getAngleValue();
		return this;			
	}
	

}
