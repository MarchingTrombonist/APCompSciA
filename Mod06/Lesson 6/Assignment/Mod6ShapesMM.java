/*
	Program Name:	Mod6ShapesMM
	Author: Mac Mai
	Date:	11/14/2019
	Version:	1.2
	Description:	Makes triangles of letters
	Problems:	Couldn't take an input of char with a scanner
		Solutions:	Took the first letter of the string instead
	What I Learned:	How to nest loops and use them correctly
*/

//Imports
import java.io.*;
import java.util.*;

public class Mod6ShapesMM {
	public static void main(String[] args) {
		// Creates scanner
		Scanner input = new Scanner(System.in);
		// Creates rows/letter/quit vars
		int rows;
		char letter;
		char quit = 'n';
		// Loops until quit is 'y'
		do {
			// Asks for and stores int rows
			System.out.print("How many rows: ");
			rows = input.nextInt();
			// Asks for and stores the character to be repeated (first char of the inputted
			// string)
			System.out.print("What character: ");
			letter = input.next().charAt(0);
			System.out.println();

			// Loops what row it's on
			for (int i = 1; i <= rows; i++) {
				// Loops how many to print (same as number of the row)
				for (int j = 1; j <= i; j++) {
					System.out.print(letter);
				}
				System.out.println();
			}

			// Asks quit? and stores char (first char of the string) to quit
			System.out.print("\nQuit?\ny/n: ");
			quit = input.next().charAt(0);
			System.out.println();
			// Checks to see if quit is y(es)
		} while (quit != 'y');

		input.close();
	}
}

/*
	Sample Output: [User Input]
		How many rows: [7]
		What character: [o]

		o
		oo
		ooo
		oooo
		ooooo
		oooooo
		ooooooo

		Quit?
		y/n: [n]

		How many rows: [4]
		What character: [^]

		^
		^^
		^^^
		^^^^

		Quit?
		y/n: [n]

		How many rows: [17]
		What character: [H]

		H
		HH
		HHH
		HHHH
		HHHHH
		HHHHHH
		HHHHHHH
		HHHHHHHH
		HHHHHHHHH
		HHHHHHHHHH
		HHHHHHHHHHH
		HHHHHHHHHHHH
		HHHHHHHHHHHHH
		HHHHHHHHHHHHHH
		HHHHHHHHHHHHHHH
		HHHHHHHHHHHHHHHH
		HHHHHHHHHHHHHHHHH

		Quit?
		y/n: [y]
*/