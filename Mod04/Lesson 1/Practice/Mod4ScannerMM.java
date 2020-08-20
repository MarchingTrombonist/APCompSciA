/*
	Program Name:	 Mod4ScannerMM
	Author: Mac Mai
	Date:	09/24/2019
	Version:	1.3
	Description:	Takes int, doubles, and strings and then outputs them
	Problems:	I tried to use the same scanner for .nextLine()
						The scanners weren't closed
						I got a new error			
		Solutions:	I made another scanner
								I did scanner.close();
								I commented out scanner.close();
	What I Learned:	How to get user input and use it in the program
*/

//Imports scanner functions
import java.io.*;
import java.util.*;

public class Mod4ScannerMM {
	public static void main(String[] args) {
		// Creates kbReader as a scanner
		Scanner kbReader = new Scanner(System.in);
		// Takes user input of (int) and outputs it * 3
		System.out.print("Enter your integer here: ");
		int i = kbReader.nextInt();
		System.out.println(3 * i);

		// Takes user input of two (double)s and outputs the first one
		System.out.print("Enter your doubles here: ");
		double d = kbReader.nextDouble();
		double dd = kbReader.nextDouble();
		System.out.println(d);

		// Takes user input of two (String)s and outputs them concatenated with
		// preprogrammed sentences
		System.out.print("Enter your strings here: ");
		String s = kbReader.next();
		System.out.println("This is the first part of the String,..." + s);
		s = kbReader.next();
		System.out.println("This is the next part of the String,..." + s);
		kbReader.close();

		// Creates lineReader as a new scanner
		Scanner lineReader = new Scanner(System.in);
		// Takes user input of a (String) and outputs it
		System.out.print("Enter your String here: ");
		String ss = lineReader.nextLine();
		System.out.println(ss);

		lineReader.close();
	}
}

/*
	Sample Output: [User Input]
		Enter your integer here: [1]
		3
		Enter your doubles here: [2.3]
		[4.5]
		2.3
		Enter your strings here: [two strings]
		This is the first part of the String,...two
		This is the next part of the String,...strings
		Enter your string here: [one string]
		one string
*/