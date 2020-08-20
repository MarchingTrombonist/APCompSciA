/*
	Program Name:	Mod6FindingSumAndAverageMM
	Author: Mac Mai
	Date:	10/29/2019
	Version:	1.1
	Description:	Reads a file and finds the sum and average
	Problems:	Used a for loop at first
		Solutions:	I changed it to a while loop
	What I Learned:	How to use while loops
*/

//Imports
import java.io.*;
import java.util.*;

public class Mod6FindingSumAndAverageMM {
	public static void main(String[] args) {
		Scanner inFile = null;
		// Catches errors
		try {
			// Reads file
			inFile = new Scanner(new File("Lesson 1/Assignment/M6L1.in"));
			// Vars
			double sum = 0;
			int count = 0;
			// Loops
			double i = inFile.nextDouble();
			// Prints next cost and goes to the next until it reaches a 0
			while (i != 0) {
				System.out.println("$" + i);
				sum += i;
				count++;
				i = inFile.nextDouble();
			}

			// Prints
			System.out.printf("The sum of the cost: $%.2f%n", sum);
			System.out.println("The number of costs: " + count);
			double average = (double) sum / count;
			System.out.printf("The average cost: $%.2f%n", average);
			// Catches file not found
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			// Catches cost not a double
		} catch (InputMismatchException e) {
			System.out.println("[" + inFile.next() + "] is invalid");
		}
	}
}

/*
	Sample Output: [User Input]
		$14.99
		$39.99
		$69.95
		$74.95
		$59.95
		$49.95
		$75.5
		$14.5
		$29.95
		$29.95
		The sum of the cost: $459.68
		The number of costs: 10
		The average cost: $45.97
*/