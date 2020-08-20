/*
	Program Name:	Mod4TopSecretMM
	Author: Mac Mai
	Date:	09/26/2019
	Version:	1.2
	Description:	Converts characters to ascii
	Problems:	It only exited after I input the second letter
		Solutions:	I split it into two if statements
	What I Learned:	How to convert characters to ascii
*/

//Imports scanner functions
import java.io.*;
import java.util.*;

public class Mod4TopSecretMM {
	public static void main(String[] args) {
		// Creates initials as a scanner
		Scanner initials = new Scanner(System.in);

		// Asks for first initial
		System.out.print("Enter the first initial of your first name: ");
		// Takes the first character of the input string
		char init1 = initials.nextLine().charAt(0);
		// Checks if the character is a letter, if yes makes it capital, if no gives an
		// error and exits
		if (Character.isLetter(init1)) {
			init1 = Character.toUpperCase(init1);
		} else {
			System.out.println("Invalid Input: " + init1 + " is not a letter");
			System.exit(0);
		}

		// Asks for second initial
		System.out.print("Enter the first initial of your last name: ");
		// Takes the first character of the input string
		char init2 = initials.nextLine().charAt(0);
		// Checks if the character is a letter, if yes makes it capital, if no gives an
		// error and exits
		if (Character.isLetter(init2)) {
			init2 = Character.toUpperCase(init2);
		} else {
			System.out.println("Invalid Input: " + init2 + " is not a letter");
			System.exit(0);
		}

		// Makes the initials into ascii
		int ascii1 = (int) init1;
		int ascii2 = (int) init2;

		// Prints statement
		System.out.println("Initials: " + init1 + " " + init2 + "\nEncrypted Name: " + ascii1 + " " + ascii2);

		// Closes the scanner
		initials.close();
	}
}

/*
	Sample Output: [User Input]
		Enter the first initial of your first name: [m]
		Enter the first initial of your last name: [m]
		Initials: M M
		Encrypted Name: 77 77
	
	Sample Output: [User Input]
		Enter the first initial of your first name: [1]
		Invalid Input: 1 is not a letter
*/