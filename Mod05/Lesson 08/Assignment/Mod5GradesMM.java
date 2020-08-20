/*
	Program Name:	Mod5GradesMM
	Author: Mac Mai
	Date:	10/17/2019
	Version:	1.2
	Description:	Reads a file and outputs the average
	Problems:	It kept reading one past the 0
		Solutions:	I rewrote my for loop with the incrementing in a different place
	What I Learned:	How to read files and use the data
*/

//Imports
import java.util.*;
import java.io.*;

public class Mod5GradesMM {
	public static void main(String[] args) {
		// Creates scanner
		Scanner inFile = null;
		// Catches errors
		try {
			// Reads file
			inFile = new Scanner(new File("Lesson 08/Assignment/ints.dat"));
			// Sets sum and count to 0
			int sum = 0;
			int count = 0;
			// Prints next number, adds next number to sum and increments count until next
			// number is 0
			for (int i = inFile.nextInt(); i != 0; i = inFile.nextInt()) {
				System.out.println(i);
				sum += i;
				count++;
			}
			// Prints sum, count, and average
			System.out.println("Sum: " + sum);
			System.out.println("Count: " + count);
			double average = (double) sum / count;
			System.out.println("Average: " + average);
			// Catches file not found
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			// Catches non-integer inputs
		} catch (InputMismatchException e) {
			System.out.println("Grade [" + inFile.next() + "] is invalid");
		}
	}
}

/*
	Sample Output: [User Input]
		3
		8
		1
		13
		18
		15
		7
		17
		1
		14
		Sum: 97
		Count: 10
		Average: 9.7
*/