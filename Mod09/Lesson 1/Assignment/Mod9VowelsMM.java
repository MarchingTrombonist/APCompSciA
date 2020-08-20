/*
	Program Name:	Mod9VowelsMM
	Author: Mac Mai
	Date:	01/02/2020
	Version:	1.3
	Description:	Counts vowels and consonants
	Problems:	Formatting
		Solutions:	Escaped the quotes
	What I Learned:	How to use classes
*/

//Imports
import java.util.*;
import java.io.*;

public class Mod9VowelsMM {
	public static void main(String args[]) {
		// Creates scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a string of characters: ");

		// Takes input
		CharCount str1 = new CharCount(input.nextLine());

		// Prints values
		System.out.println("The string \"" + str1.getInput() + "\" contains " + str1.countVowels() + " vowels and "
				+ str1.countConsonants() + " consonants.");

		// Runs again
		System.out.println("Would you like to enter a new string? (y/n)");
		if (input.next().charAt(0) == 'y') {
			String[] x = { "" };
			Mod9VowelsMM.main(x);
		} else {
			System.exit(1);
		}
	}
}

/*
	Sample Output: [User Input]
		Please enter a string of characters: [test1]
		The string "test1" contains 1 vowels and 3 consonants.
		Would you like to enter a new string? (y/n)
		[y]
		Please enter a string of characters: [no]
		The string "no" contains 1 vowels and 1 consonants.
		Would you like to enter a new string? (y/n)
		[y]
		Please enter a string of characters: [The state fish of Hawaii is the Humuhumunukunukuapuaa.]
		The string "The state fish of Hawaii is the Humuhumunukunukuapuaa." contains 23 vowels and 23 consonants.
		Would you like to enter a new string? (y/n)
		[n]
*/