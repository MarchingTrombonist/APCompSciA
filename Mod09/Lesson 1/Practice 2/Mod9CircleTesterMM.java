/*
	Program Name: Mod9CircleTesterMM
	Author: Mac Mai
	Date: 12/19/2019
	Version: 1.3
	Description: Outputs numbers about circles
	Problems: I had the method syntax wrong
		Solutions:	I double checked the video and fixed it
	What I Learned: How to use methods
*/

public class Mod9CircleTesterMM {
	public static void main(String[] args) {
		// Creates Circles
		Circle cir1 = new Circle(5.1);
		Circle cir2 = new Circle(20.6);

		// Sets the radius of cir1
		cir1.setRadius(20);

		// Prints the circumference of cir1
		System.out.println(cir1.getCircumference());
	}
}

/*
	Sample Output: [User Input]
		125.66370614359172
*/