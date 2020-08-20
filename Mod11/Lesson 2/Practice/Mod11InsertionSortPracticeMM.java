/*
	Program Name:	Mod11InsertionSortPracticeMM
	Author: Mac Mai
	Date:	02/17/2020
	Version:	1.2
	Description: Insertion Sort	
	Problems:	No problems
		Solutions:	N/A
	What I Learned:	How insertion sort works
*/

// Imports
import java.io.*;
import java.util.*;

public class Mod11InsertionSortPracticeMM {
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
		insertionSort(values);
		long endTime = System.currentTimeMillis();
		System.out.println("Sorted");
		System.out.println("Total execution time: " + (endTime - startTime) / 1000.0 + " seconds");
		System.out.println();

		// Second sort

		System.out.println("Sorting again");
		startTime = System.currentTimeMillis();
		insertionSort(values);
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

	// Insertion Sort
	// Takes the next value and inserts it into the sorted subset
	// When it inserts the last value then it's done
	public static void insertionSort(int[] a) {
		int itemToInsert;
		int j;
		boolean loop;
		for (int k = 1; k < a.length; k++) {
			itemToInsert = a[k];
			j = k - 1;
			loop = true;
			while ((j >= 0) && loop) {
				if (itemToInsert < a[j]) {
					a[j + 1] = a[j];
					j--;
					if (j == -1) {
						a[0] = itemToInsert;
					}
				} else {
					loop = false;
					a[j + 1] = itemToInsert;
				}
			}
		}
	}
}

/*
	Sample Output: [User Input]
		Size: [10000]
		Sorting
		Sorted
		Total execution time: 0.235 seconds

		Sorting again
		Sorted again
		Total execution time: 0.001 seconds

		Duplicates: 3719; 37.19%
*/