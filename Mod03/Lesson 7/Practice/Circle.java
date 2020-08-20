//Circle class
public class Circle {
	// Defines radius
	public Circle(double r) {
		radius = r;
	}

	// Calculates the area
	public double area() {
		double a = Math.PI * radius * radius;
		return a;
	}

	// Calculates the circumference
	public double circumference() {
		double c = 2 * Math.PI * radius;
		return c;
	}

	// Sets the radius to nr
	public void setRadius(double nr) {
		radius = nr;
	}

	public double radius;
}