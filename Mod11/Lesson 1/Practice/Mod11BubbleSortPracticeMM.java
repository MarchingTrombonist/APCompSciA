/*
	Program Name:	Mod11BubbleSortPracticeMM
	Author: Mac Mai
	Date:	02/17/2020
	Version:	1.2
	Description:	Bubble Sort
	Problems:	No problems
		Solutions:	N/A
	What I Learned:	How bubble sort works
*/

// Imports
import java.io.*;
import java.util.*;

public class Mod11BubbleSortPracticeMM {
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
		bubbleSort(values);
		long endTime = System.currentTimeMillis();
		System.out.println("Sorted");
		System.out.println("Total execution time: " + (endTime - startTime) / 1000.0 + " seconds");
		System.out.println();

		// Second sort

		System.out.println("Sorting again");
		startTime = System.currentTimeMillis();
		bubbleSort(values);
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

	// Bubble Sort
	// Moves the largest value to the end
	// When no moves have to be made then it's done
	public static void bubbleSort(int[] a) {
		boolean loop;
		do {
			loop = false;
			for (int i = 0; i < a.length - 1; i ++) {
				if (a[i] > a[i + 1]) {
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					loop = true;
				}
			}
		} while (loop);
	}
}

/*
	Sample Output: [User Input]
		Size: [10000]
		Sorting
		Sorted
		Total execution time: 0.706 seconds

		Sorting again
		Sorted again
		Total execution time: 0.0 seconds

		Duplicates: 3727; 37.269999999999996%
*/