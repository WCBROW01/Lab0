/**
 * This class stores the radius of a circle and calculates the area.
 * 
 * @author Will Brown
 * @version 1.0
 */
public class Circle {
	
	private double radius;
	
	/**
	 * No parameters, sets radius to 1.
	 */
	public Circle() {
		radius = 1;
	} // end constructor
	
	/**
	 * Sets the radius to whatever is sent to it.
	 * 
	 * @param radius the radius of the circle
	 */
	public Circle(double radius) {
		this.radius = radius;
	} // end constructor
	
	/**
	 * @return the area of the circle
	 */
	public double calculateArea() {
		return Math.PI * Math.pow(radius, 2);
	} // end calculateArea
	
	/**
	 * @return the current radius value
	 */
	public double getRadius() {
		return radius;
	} // end getRadius
	
	/**
	 * @param radius the radius value to be set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	} // end setRadius
	
} // end class
