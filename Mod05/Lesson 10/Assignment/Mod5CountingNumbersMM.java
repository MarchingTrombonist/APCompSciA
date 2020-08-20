/*
	Program Name:	Mod5DataMM
	Author: Mac Mai
	Date:	10/22/2019
	Version:	1.2
	Description:	Reads a file and counts numbers more and less than 500
	Problems:	I had a while instead of do while
		Solutions:	I changed it to a do while
	What I Learned:	How to read files and use the data
*/

//Imports
import java.util.*;
import java.io.*;

public class Mod5CountingNumbersMM {
	public static void main(String[] args) {
		// Creates scanner
		Scanner inFile = null;
		// Catches errors
		try {
			// Reads file
			inFile = new Scanner(new File("Lesson 10/Assignment/p209a.dat"));
			// Starting vars
			int smaller = 0;
			int larger = 0;
			int total = 0;
			// Loops until no more ints
			do {
				// Increments smaller or larger based on next int
				int num = inFile.nextInt();
				if (num < 500) {
					smaller++;
				} else {
					larger++;
				}
			} while (inFile.hasNextInt());
			// Sets total
			total = smaller + larger;
			// Prints
			System.out.println("The number of numbers less than 500 is " + smaller);
			System.out.println("The number of numbers greater than or equal to 500 is " + larger);
			System.out.println("The total number of numbers is " + total);
			// Catches errors
		} catch (FileNotFoundException e) {
			System.out.println("No such file exists");
		} catch (InputMismatchException e) {
			System.out.println("[" + inFile.next() + "] is not an integer");
		}
	}
}

/*
	Sample Output: [User Input]
		The number of numbers less than 500 is 263
		The number of numbers greater than or equal to 500 is 237
		The total number of numbers is 500
*/