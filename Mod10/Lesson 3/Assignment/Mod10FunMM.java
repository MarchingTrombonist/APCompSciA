/*
	Program Name:	Mod10FunMM
	Author: Mac Mai
	Date:	02/11/2020
	Version:	1.2
	Description:	Reads file and prints
	Problems:	Formatting
		Solutions:	Looked up printf
	What I Learned:	How to use arrays
*/

//Imports
import java.io.*;
import java.util.*;

public class Mod10FunMM {
	public static void main(String[] args) {
		// Vars
		int length = 20;
		int[] id = new int[length];
		int[] scores = new int[length];
		double sum = 0;
		int count = length;
		double avg = 0;

		// Catches FileNotFoundException
		try {
			// Creates scanner to read file
			Scanner input = new Scanner(new File("Lesson 3/Assignment/M10L3A1.dat"));

			// Fills arrays
			for (int index = 0; index < length; index++) {
				id[index] = input.nextInt();
				scores[index] = input.nextInt();
			}

			// Calculates sum and avg
			sum = sum(scores);
			avg = sum / count;

			// Prints header
			System.out.printf("End of reading from file.%nSum = %.0f%nAverage = %.2f%nCount = %d%n", sum, avg, count);
			System.out.printf("%-6s%-6s%6s%n", "ID", "Score", "Diff");

			// Prints arrays
			for (int index = 0; index < length; index++) {
				System.out.printf("%-6d%-6d%6.2f%n", id[index], scores[index], scores[index] - avg);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}
	}

	// Sum method
	private static int sum(int[] array) {
		int sum = 0;
		for (int index = 0; index < array.length; index++) {
			sum += array[index];
		}
		return sum;
	}
}

/*
	Sample Output: [User Input]
		End of reading from file.
		Sum = 4853
		Average = 242.65
		Count = 20
		ID    Score   Diff
		115   257    14.35
		123   253    10.35
		116   246     3.35
		113   243     0.35
		112   239    -3.65
		104   239    -3.65
		110   238    -4.65
		218   243     0.35
		208   242    -0.65
		222   223   -19.65
		223   230   -12.65
		213   229   -13.65
		207   228   -14.65
		203   224   -18.65
		305   265    22.35
		306   262    19.35
		311   256    13.35
		325   246     3.35
		321   245     2.35
		323   245     2.35

	Sample Output: [User Input]
		End of reading from file.
		Sum = 5057
		Average = 252.85
		Count = 20
		ID    Score   Diff
		157   263    10.15
		239   274    21.15
		163   260     7.15
		364   237   -15.85
		344   276    23.15
		210   227   -25.85
		193   209   -43.85
		191   277    24.15
		260   296    43.15
		176   215   -37.85
		222   211   -41.85
		101   273    20.15
		330   276    23.15
		254   231   -21.85
		320   214   -38.85
		163   296    43.15
		277   225   -27.85
		230   241   -11.85
		274   281    28.15
		107   275    22.15
*/