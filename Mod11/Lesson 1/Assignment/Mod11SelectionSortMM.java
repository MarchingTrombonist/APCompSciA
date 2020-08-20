	/*
	Program Name:	Mod11SelectionSortMM
	Author: Mac Mai
	Date:	02/17/2020
	Version:	1.3
	Description:	Sorts array using selection sort
	Problems:	No problems
		Solutions:	N/A
	What I Learned:	How to use selection sort
*/

// Imports
import java.io.*;
import java.util.*;

public class Mod11SelectionSortMM {
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

		// System.out.println("Before: Not Sorted");
		// startTime = System.currentTimeMillis();
		// selectionSort(values);
		// endTime = System.currentTimeMillis();
		// System.out.println("After: Sorted");
		// System.out.println("Total execution time: " + (endTime - startTime));
		// System.out.println();

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

	// Sort the Array
	public static void selectionSort(int[] array) {
		// Find the integer that should go in each cell of
		// the array, from cell 0 to the end
		for (int j = 0; j < array.length - 1; j++) {
			// Find min: the index of the integer that should go into cell j. 
			// Look through the unsorted integers (those at j or higher)
			int min = j; 
			for (int k = j + 1; k < array.length; k++) {
				if (array[k] < array[min]) {
					min = k;
				}
			}
			// Swap the int at j with the int min
			int temp = array[min]; 
			array[min] = array[j];
			array[j] = temp; 
		}
	}
}

/*
	Sample Output: [User Input]
		Size: [10000]
		Before: Not Sorted
		After: Sorted
		Total execution time: 1478

		Before: Not Sorted
		After: Sorted
		Total execution time: 681
	The difference is because one is already sorted, so it just needs to check it once

	Sample Output: [User Input]
		Size: [10000]
		Sorting
		Sorted
		Total execution time: 0.197 seconds

		Duplicates: 3632; 36.32%
*/