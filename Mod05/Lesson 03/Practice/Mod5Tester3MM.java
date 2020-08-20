/*
	Program Name:	Mod5Tester3MM
	Author: Mac Mai
	Date:	10/08/2019
	Version:	1.1
	Description:	Tells you your letter grade
	Problems:	I had an if on the last else
		Solutions:	I removed it
	What I Learned:	How to use else if statements
*/

import java.util.*;
import java.io.*;

public class Mod5Tester3MM {
	public static void main(String[] args) {
		// Creates kbReader as a scanner
		Scanner kbReader = new Scanner(System.in);
		// Asks for grade
		System.out.print("What is your grade? ");
		// Declares the input grade as an int
		int myGrade = kbReader.nextInt();

		// Checks what the grade is and gives a letter grade
		if (myGrade >= 90) {
			System.out.println("You made an A.");
		} else if (myGrade >= 80) {
			System.out.println("You made an B.");
		} else if (myGrade >= 70) {
			System.out.println("You made an C.");
		} else {
			System.out.println("You failed.");
		}

		// Closes kbReader
		kbReader.close();
	}
}

/*
	Sample Output: [User Input]
		What is your grade? [90]
		You made an A.

	Sample Output: [User Input]
		What is your grade? [80]
		You made an B.

	Sample Output: [User Input]
		What is your grade? [70]
		You made an C.

	Sample Output: [User Input]
		What is your grade? [69]
		You failed.
*/