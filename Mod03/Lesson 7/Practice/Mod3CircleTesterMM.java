/*
	Program Name:	Mod3CircleTesterMM
	Author:	Mac Mai
	Date:	09/18/2019
	Version:	1.3
	Description:	Outputs numbers about circles
	Problems:	I had the method syntax wrong
						I had the two classes in the same file
		Solutions:	I double checked the video and fixed it
								I moved it to another file
	What I Learned:	How to use methods
*/

public class Mod3CircleTesterMM {
	public static void main(String[] args) {
		// Creates a new Circle method
		Circle cir1 = new Circle(5.1);
		Circle cir2 = new Circle(20.6);
		// Changes the radius of cir1
		cir1.radius = 20;
		// Prints the circumference of cir1
		print(cir1.circumference());
	}

	// Makes print shorter
	public static void print(double x) {
		System.out.println(x);
	}
}

/*
	Sample Output: [User Input]
		125.66370614359172
*/