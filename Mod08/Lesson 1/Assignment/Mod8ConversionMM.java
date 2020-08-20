/*
	Program Name:	Mod8ConversionMM
	Author: Mac Mai
	Date:	12/12/2019
	Version:	1.3
	Description:	Converts units
	Problems:	Too many methods; inefficient
		Solutions:	Combined into just 3
	What I Learned:	How to write methods
*/

//Imports
import java.io.*;
import java.util.*;

public class Mod8ConversionMM {
	public static void main(String[] args) {
		// Creates scanner
		Scanner input = new Scanner(System.in);
		// Gets choice of unit
		System.out.print("Choose 1 for km, 2 for mi, 3 for yards: ");
		int unit = input.nextInt();

		// Runs methods based on unit chosen
		switch (unit) {
		// km
		case 1:
			System.out.print("Enter your distance: ");
			kmTo(input.nextDouble());
			break;

		// mi
		case 2:
			System.out.print("Enter your distance: ");
			miTo(input.nextDouble());
			break;

		// yd
		case 3:
			System.out.print("Enter your distance: ");
			ydTo(input.nextDouble());
			break;
		}

		input.close();
	}

	// Converts km to mi and yd and prints
	public static void kmTo(double km) {
		double mi = km * .621371;
		double yd = mi * 1760;
		System.out.println("\nYou entered " + km + " kilometers.\nThis is " + mi + " miles.\nThis is " + yd + " yards.");
	}

	// Converts mi to km and yd and prints
	public static void miTo(double mi) {
		double km = mi / .621371;
		double yd = mi * 1760;
		System.out.println("\nYou entered " + mi + " miles.\nThis is " + km + " kilometers.\nThis is " + yd + " yards.");
	}

	// Converts yd to km and mi and prints
	public static void ydTo(double yd) {
		double mi = yd / 1760;
		double km = mi / .621371;
		System.out.println("\nYou entered " + yd + " yards.\nThis is " + mi + " miles.\nThis is " + km + " kilometers.");
	}
}

/*
	Sample Output: [User Input]
		Choose 1 for km, 2 for mi, 3 for yards: [2]
		Enter your distance: [160]

		You entered 160.0 miles.
		This is 257.4951196628101 kilometers.
		This is 281600.0 yards.
*/