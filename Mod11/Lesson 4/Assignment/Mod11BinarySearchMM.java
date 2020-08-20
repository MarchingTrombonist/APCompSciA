/*
	Program Name:	Mod11BinarySearchMM
	Author: Mac Mai
	Date:	02/24/2020
	Version:	1.2
	Description:	Searches file
	Problems:	No problems
		Solutions:	N/A
	What I Learned:	How to use binary search
*/

// Imports
import java.util.*;
import java.io.*;

public class Mod11BinarySearchMM {
	public static void main(String[] args) {
		// Catches FileNotFoundException
		try {
			// Counts values in file
			Scanner fileCount = new Scanner(new File("Lesson 4/Assignment/ModuleElevenLessonFourAssignmentDataFile.dat"));
			int count = 0;
			while (fileCount.hasNextInt()) {
				count++;
				fileCount.nextInt();
			}
			fileCount.close();

			// Creates and fills array with values from the file
			Scanner fileRead = new Scanner(new File("Lesson 4/Assignment/ModuleElevenLessonFourAssignmentDataFile.dat"));
			int[] values = new int[count];
			for (int i = 0; i < count; i++) {
				values[i] = fileRead.nextInt();
			}
			fileRead.close();

			// Creates input scanner
			Scanner input = new Scanner(System.in);
			int search = 0;

			// Loops until user quits
			while (true) {
				// Gets number to search
				System.out.print("Enter a number to search for: ");
				search = input.nextInt();
			
				// Prints where number is
				if (binarySearch(values, search) != -1) {
					System.out.println(search + " is at position " + binarySearch(values, search));
				} else {
					System.out.println(search + " does not appear in this list.");
				}
				
				// Asks user if they want to quit
				System.out.println("Again? Y/N");
				if (input.next().matches("\\b[nN].*")) {
					input.close();
					System.exit(0);
				}
				System.out.println();
			}
		// Catches FileNotFoundException
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
	}

	// Binary Search
	public static int binarySearch(int[] array, int search) {
		// Bounds
		int lb = 0;
		int ub = array.length - 1;
		
		// Searches
		while (lb <= ub) {
			// Sets mid to middle of bounds
			int mid = (lb + ub) / 2;
			if (array[mid] == search) {
				return mid;
			
			// Shrinks bounds
			} else if (search > array[mid]) {
				lb = mid + 1;
			} else {
				ub = mid - 1;
			}
		}
		// If value not found
		return -1;
	}
}

/*
	Sample Output: [User Input]
		Enter a number to search for: [0]
		0 does not appear in this list.
		Again? Y/N
		[y]

		Enter a number to search for: [1]
		1 is at position 0
		Again? Y/N
		[y]

		Enter a number to search for: [2]
		2 is at position 2
		Again? Y/N
		[y]

		Enter a number to search for: [3]
		3 is at position 3
		Again? Y/N
		[y]

		Enter a number to search for: [4]
		4 is at position 4
		Again? Y/N
		[y]

		Enter a number to search for: [5]
		5 is at position 5
		Again? Y/N
		[y]

		Enter a number to search for: [6]
		6 does not appear in this list.
		Again? Y/N
		[y]

		Enter a number to search for: [7]
		7 does not appear in this list.
		Again? Y/N
		[y]

		Enter a number to search for: [8]
		8 is at position 6
		Again? Y/N
		[y]

		Enter a number to search for: [9]
		9 is at position 7
		Again? Y/N
		[y]

		Enter a number to search for: [10]
		10 does not appear in this list.
		Again? Y/N
		[n]
*/