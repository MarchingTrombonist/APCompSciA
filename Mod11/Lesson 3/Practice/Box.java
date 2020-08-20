public class Box {
  private double length;
	private double height;
	private double depth;
  
  public Box(double length, double height, double depth) {
    this.length = length;
    this.height = height;
    this.depth  = depth;
  }
	
	public double volume() {
    return length * height * depth;
  }

  // compare this Box to another Box  
  double compareTo(Box other) {
		return (other.volume() - this.volume());

  //Insert code requested in #2 here
  }
  
  public String toString() {
    return("length: " + length + ",  height: " + height + ",  depth: " + depth + ",  volume: " + volume());
  }
}