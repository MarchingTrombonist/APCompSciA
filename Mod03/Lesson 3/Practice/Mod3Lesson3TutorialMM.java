/*
	Program Name:	Mod3Lesson3TutorialMM
	Author:	Mac Mai
	Date:	09/16/2019
	Version:	1.1
	Description:	Outputs quotient, remainder, and if a number is odd or even
	Problems:	Formatting was wrong
		Solutions:	I added tabs and spaces
	What I Learned:	How to use modulo and use if statements
*/

public class Mod3Lesson3TutorialMM {
	public static void main(String[] args) {
		// remainderExample
		// Declares variables
		int quotient, remainder;
		// Defines variables
		quotient = 19 / 3;
		remainder = 19 % 3;
		// Outputs variables
		System.out.println("The quotient: " + quotient);
		System.out.println("The remainder: " + remainder);
		System.out.println("The original: " + (quotient * 3 + remainder));
		// oddsOrEvens
		// Declares and defines x
		int x = 1;
		// Checks if x is even or odd
		if (x % 2 == 0) {
			System.out.println(x + " is even ");
		} else {
			System.out.println(x + " is odd ");
		}
	}
}

/*
	Sample Output: [User Input]
		The quotient: 6
		The remainder: 1
		The original: 19
		1 is odd
*/