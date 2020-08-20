public class Rectangle {
	// Instance variables
	private double length;
	private double width;

	// Default
	public Rectangle() {
		length = 0;
		width = 0;
	}

	// Normal
	public Rectangle(double l, double w) {
		length = l;
		width = w;
	}

	// Getters
	public double getPerimeter() {
		return 2 * (length + width);
	}

	public double getArea() {
		return length * width;
	}

	// Setters
	public void setLength(double l) {
		length = l;
	}

	public void setWidth(double w) {
		width = w;
	}
}