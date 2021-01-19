/**
 * Test application for the Circle class.
 * 
 * @author Will Brown
 * @version 1.0
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Circle circle1 = new Circle();
		Circle circle2 = new Circle(4);
		
		System.out.println("Radius of circle1 is: " + circle1.getRadius());
		System.out.println("Area of circle1 is: " + circle1.calculateArea());
		System.out.println("Radius of circle2 is: " + circle2.getRadius());
		System.out.println("Area of circle2 is: " + circle2.calculateArea());
	} // end main

} // end class
