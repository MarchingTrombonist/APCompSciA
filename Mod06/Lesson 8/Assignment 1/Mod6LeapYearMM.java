/*
	Program Name:	Mod6LeapYearMM
	Author: Mac Mai
	Date:	11/18/2019
	Version:	1.2
	Description:	Tests if a year is a leap year
	Problems:	I had it as if-elses instead of one test
		Solutions:	I figured out how to make it into one test
	What I Learned:	How to use if-elses and loop until the user says
*/

//Imports
import java.io.*;
import java.util.*;

public class Mod6LeapYearMM {
	public static void main(String[] args) {
		// Creates scanner
		Scanner input = new Scanner(System.in);
		// Loops until the user says no
		do {
			// Asks for year
			System.out.print("Enter a year: ");
			int year = input.nextInt();
			// Prints
			System.out.println("The year you entered is " + year + ".");
			// Prints first half of statement
			System.out.print("The year " + year + " is ");
			// if the year is divisible by 400 OR (NOT divisible by 100 AND divisible by 4)
			// Prints nothing if true and not if false
			if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
				System.out.print("");
			} else {
				System.out.print("not ");
			}
			// Prints second half of statement and asks if repeat
			System.out.println("a leap year.");
			System.out.println("Again? y/n");
			// Repeats unless the entered character is n
		} while (input.next().charAt(0) != 'n');

		input.close();
	}
}

/*
	Sample Output: [User Input]
		Enter a year: [1]
		The year you entered is 1.
		The year 1 is not a leap year.
		Again? y/n
		[y]
		Enter a year: [4]
		The year you entered is 4.
		The year 4 is a leap year.
		Again? y/n
		[y]
		Enter a year: [100]
		The year you entered is 100.
		The year 100 is not a leap year.
		Again? y/n
		[y]
		Enter a year: [400]
		The year you entered is 400.
		The year 400 is a leap year.
		Again? y/n
		[n]
*/