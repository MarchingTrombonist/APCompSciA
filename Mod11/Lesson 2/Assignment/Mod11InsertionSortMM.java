/*
	Program Name:	Mod11InsertionSortMM
	Author: Mac Mai
	Date:	02/24/2020
	Version:	1.2
	Description: Insertion Sort	
	Problems:	No problems
		Solutions:	N/A
	What I Learned:	How insertion sort works
*/

// Imports
import java.io.*;
import java.util.*;

public class Mod11InsertionSortMM {
	public static void main(String[] args) {
		// Scanner and Random
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int size = 0;

		
		System.out.println("Elements selected from the range (0 to size)");
		
		// Gets size
		System.out.print("\nSize: ");

		size = input.nextInt();

		// Creates and fills array to be sorted
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

		// Calculates time
		System.out.println("Sorting again");
		long startTimeAgain = System.currentTimeMillis();
		insertionSort(values);
		long endTimeAgain = System.currentTimeMillis();
		System.out.println("Sorted again");
		System.out.println("Total execution time: " + (endTimeAgain - startTimeAgain) / 1000.0 + " seconds");
		System.out.println();

		// Counts duplicates
		int dupCount = 0;

		for (int i = 1; i < size; i++) {
			if (values[i] == values[i - 1]) {
				dupCount++;
			}
		}

		System.out.println("Duplicates: " + dupCount + "; " + 100 * (dupCount / (double) size) + "%");

		// Finds mean and median
		double sum = 0;
		double mean = 0;
		double median = 0;

		// Finds mean
		for (int i = 0; i < size; i++) {
			sum += values[i];
		}
		mean = sum / size;

		// Finds median
		if (size % 2 == 0) {
			median = (values[(size / 2) - 1] + values[size / 2]) / 2.0;
		} else {
			median = values[size / 2];
		}

		// Prints
		System.out.println("Mean: " + mean);
		System.out.println("Median: " + median);



		// Second sort with higher numbers
		// Creates and fills array to be sorted
		for (int i = 0; i < size; i++) {
			if (i % 10 == 0) {
				values[i] = rand.nextInt(9 * size) + size;
			} else {
				values[i] = rand.nextInt(size);
			}
		}


		// Calculates time
		System.out.println("\n\n\nWith every 10th element in a higher range (size to 10 * size)");
		System.out.println("\nSize: " + size);
		System.out.println("Sorting");
		long startTime2 = System.currentTimeMillis();
		insertionSort(values);
		long endTime2 = System.currentTimeMillis();
		System.out.println("Sorted");
		System.out.println("Total execution time: " + (endTime2 - startTime2) / 1000.0 + " seconds");
		System.out.println();


		// Second sort

		// Calculates time
		System.out.println("Sorting again");
		long startTimeAgain2 = System.currentTimeMillis();
		insertionSort(values);
		long endTimeAgain2 = System.currentTimeMillis();
		System.out.println("Sorted again");
		System.out.println("Total execution time: " + (endTimeAgain2 - startTimeAgain2) / 1000.0 + " seconds");
		System.out.println();

		// Counts duplicates
		int dupCount2 = 0;

		for (int i = 1; i < size; i++) {
			if (values[i] == values[i - 1]) {
				dupCount2++;
			}
		}

		System.out.println("Duplicates: " + dupCount2 + "; " + 100 * (dupCount2 / (double) size) + "%");

		// Finds mean and median
		double sum2 = 0;
		double mean2 = 0;
		double median2 = 0;

		// Finds mean
		for (int i = 0; i < size; i++) {
			sum2 += values[i];
		}
		mean2 = sum2 / size;

		// Finds median
		if (size % 2 == 0) {
			median2 = (values[(size / 2) - 1] + values[size / 2]) / 2.0;
		} else {
			median2 = values[size / 2];
		}

		// Prints
		System.out.println("Mean: " + mean2);
		System.out.println("Median: " + median2);


		// Compares
		System.out.println("\nIt took " + ((endTime2 - startTime2) - (endTime - startTime)) / 1000.0 + " seconds longer.");
		System.out.println("There were " + (dupCount - dupCount2) + " fewer duplicates.");
		System.out.println("The mean was " + (mean2 - mean) + " higher.");
		System.out.println("The median was " + (median2 - median) + " higher.");

		input.close();
	}

	// Insertion Sort
	// Takes the next value and inserts it into the sorted subset
	// When it inserts the last value then it's done
	public static void insertionSort(int[] list) { 
		// For each unsorted integer
		for (int j = 1; j < list.length; j++) { 
			// Keep swapping with its left neighbor 
			// until it is larger or equal to
			// left neighbor
			int k = j;
			while (k > 0 && list[k - 1] > list[k]) {
				int temp = list[k - 1];
				list[k - 1] = list[k];
				list[k] = temp;
				k--;
			}
		}
	}
}

/*
	Sample Output: [User Input]
		Elements selected from the range (0 to size)

		Size: [10000]
		Sorting
		Sorted
		Total execution time: 0.132 seconds

		Sorting again
		Sorted again
		Total execution time: 0.0 seconds

		Duplicates: 3733; 37.330000000000005%
		Mean: 5001.7125
		Median: 5008.0



		With every 10th element in a higher range (size to 10 * size)

		Size: 10000
		Sorting
		Sorted
		Total execution time: 0.312 seconds

		Sorting again
		Sorted again
		Total execution time: 0.0 seconds

		Duplicates: 3072; 30.72%
		Mean: 9868.5402
		Median: 5475.5

		It took 0.18 seconds longer.
		There were 661 fewer duplicates.
		The mean was 4866.8277 higher.
		The median was 467.5 higher.
*/