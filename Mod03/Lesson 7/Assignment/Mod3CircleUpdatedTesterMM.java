/*
	Program Name: Mod3CircleUpdatedTesterMM
	Author: Mac Mai
	Date: 09/18/2019
	Version: 1.2
	Description: Outputs circle diameter
	Problems: I forgot double in the diameter method
						I had the two classes in the same file
		Solutions:	I added double
								I moved CircleUpdated to a different file
	What I Learned: How to write my own methods
*/

public class Mod3CircleUpdatedTesterMM {
	public static void main(String[] args) {
		// Creates a new Circle method
		CircleUpdatedMM cir1 = new CircleUpdatedMM(35.5);
		// Prints the diameter of cir1
		print(cir1.diameter());
	}

	// Makes print shorter
	public static void print(double x) {
		System.out.println(x);
	}
}

/*
	Sample Output: [User Input]
		71.0
*/