public class Circle {
	// Instance variables
	private double radius;
	private double area;
	private double circumference;

	// Default constructor for objects of class Circle
	public Circle() {
		radius = 0;
	}

	// Normal constructor for objects of class Circle
	public Circle(double r) {
		radius = r;
	}

	// Getters
	public double getArea() {
		area = Math.PI * radius * radius;
		return area;
	}

	public double getCircumference() {
		circumference = 2 * Math.PI * radius;
		return circumference;
	}

	// Setters
	public void setRadius(double r) {
		radius = r;
	}
}