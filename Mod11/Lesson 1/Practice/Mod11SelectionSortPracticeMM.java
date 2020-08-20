/*
	Program Name:	Mod11SelectionSortPracticeMM
	Author: Mac Mai
	Date:	02/17/2020
	Version:	1.2
	Description: Selection Sort	
	Problems:	No problems
		Solutions:	N/A
	What I Learned:	How selection sort works
*/

// Imports
import java.io.*;
import java.util.*;

public class Mod11SelectionSortPracticeMM {
	public static void main(String[] args) {
		// Scanner and Random
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int size = 0;

		// Gets size
		System.out.print("Size: ");

		size = input.nextInt();

		//Creates and fills array to be sorted
		int[] values = new int[size];
		for (int i = 0; i < size; i++) {
			values[i] = rand.nextInt(size);
		}
		// Calculates time
		System.out.println("Sorting");
		long startTime = System.currentTimeMillis();
		selectionSort(values);
		long endTime = System.currentTimeMillis();
		System.out.println("Sorted");
		System.out.println("Total execution time: " + (endTime - startTime) / 1000.0 + " seconds");
		System.out.println();

		// Second sort

		System.out.println("Sorting again");
		startTime = System.currentTimeMillis();
		selectionSort(values);
		endTime = System.currentTimeMillis();
		System.out.println("Sorted again");
		System.out.println("Total execution time: " + (endTime - startTime) / 1000.0 + " seconds");
		System.out.println();

		// Counts duplicates
		int dupCount = 0;

		for (int i = 1; i < size; i++) {
			if (values[i] == values[i - 1]) {
				dupCount++;
			}
		}

		System.out.println("Duplicates: " + dupCount + "; " + 100 * (dupCount / (double) size) + "%");

		input.close();
	}

	// Selection Sort
	// Takes the smallest value and swaps it with the first value
	// When it reaches the last value then it's done
	public static void selectionSort(int[] a) {
		int min;
		int minIndex;
		for (int i = 0; i < a.length; i++) {
			min = a[i];
			minIndex = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < min) {
					min = a[j];
					minIndex = j;
				}
			}
			a[minIndex] = a[i];
			a[i] = min;
		}
	}
}

/*
	Sample Output: [User Input]
		Size: [10000]
		Sorting
		Sorted
		Total execution time: 0.238 seconds

		Sorting again
		Sorted again
		Total execution time: 0.279 seconds

		Duplicates: 3671; 36.71%
*/