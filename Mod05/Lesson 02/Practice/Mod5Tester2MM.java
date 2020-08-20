/*
	Program Name:	Mod5Tester2MM
	Author: Mac Mai
	Date:	10/03/2019
	Version:	1.1
	Description:	Tells you if you failed
	Problems:	I forgot exclamation points in the outputs
		Solutions:	I added them
	What I Learned:	How to use else statements
*/

import java.util.*;
import java.io.*;

public class Mod5Tester2MM {
	public static void main(String[] args) {
		// Creates kbReader as a scanner
		Scanner kbReader = new Scanner(System.in);
		// Asks for grade
		System.out.print("What is your grade? ");
		// Declares the input grade as an int
		int myGrade = kbReader.nextInt();

		// Tests grade and tells you if you failed
		if (myGrade >= 70) {
			System.out.println("Congratulations, you passed!");
		} else {
			System.out.println("Better luck next time!");
		}

		// Closes kbReader
		kbReader.close();
	}
}

/*
	Sample Output: [User Input]
		What is your grade? [85]
		Congratulations, you passed!

	Sample Output: [User Input]
		What is your grade? [65]
		Better luck next time!
*/