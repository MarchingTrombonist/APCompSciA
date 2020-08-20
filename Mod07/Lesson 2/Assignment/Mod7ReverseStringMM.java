/*
	Program Name:	Mod7ReverseStringMM
	Author: Mac Mai
	Date:	12/03/2019
	Version:	1.1
	Description:	Reverses a string
	Problems:	There wasn't a built in way to reverse strings
		Solutions:	I looked up how to use the StringBuilder class
	What I Learned:	How to reverse strings
*/

//Imports
import java.io.*;
import java.util.*;

public class Mod7ReverseStringMM {
	public static void main(String[] args) {
		// Creates scanner
		Scanner input = new Scanner(System.in);
		// Creates a boolean to test for replay
		boolean replay = true;
		// Loops until the user says to quit
		do {
			// Gets string
			System.out.print("What string would you like to enter: ");
			String a = input.nextLine();
			// Creates a StringBuilder with the input string
			StringBuilder b = new StringBuilder(a);
			// Prints
			System.out.println("\nYou entered " + a);
			// Reverses the StringBuilder and stores it back to a string
			a = b.reverse().toString();
			// Prints and makes uppercase
			System.out.println("\nThe string reversed is " + a);
			System.out.println("\nThe reversed string in capital letters is " + a.toUpperCase());
			// Asks if again
			System.out.print("\nWould you like to enter another string (Y/N)?\n");
			// If the next char is n, then it won't loop
			if (input.next().charAt(0) == 'n') {
				replay = false;
			} else {
				System.out.println();
			}
			// Loops if replay is true
		} while (replay);

		input.close();
	}
}

/*
	Sample Output: [User Input]
		What string would you like to enter: [test 1 2 3]

		You entered test 1 2 3

		The string reversed is 3 2 1 tset

		The reversed string in capital letters is 3 2 1 TSET

		Would you like to enter another string (Y/N)?
		[n]
*/