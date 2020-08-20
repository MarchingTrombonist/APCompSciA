/*
	Program Name:	Mod11BinarySearchPracticeMM
	Author: Mac Mai
	Date:	02/24/2020
	Version:	1.1
	Description:	Binary search
	Problems:	No problems
		Solutions:	N/A
	What I Learned:	How to use a binary search
*/

public class Mod11BinarySearchPracticeMM {
	public static void main(String[] args) {
		// Creates array
		int[] i = {-7, 15, 21, 22, 43, 49, 51, 67, 78, 81, 84, 89, 95, 97};
		System.out.println(binarySearchI(i, 22));		
		System.out.println(binarySearchI(i, 89));
		System.out.println(binarySearchI(i, -100));
		System.out.println(binarySearchI(i, 72));
		System.out.println(binarySearchI(i, 102));

		int lb = 0;
		int ub = i.length - 1;
		System.out.println(binarySearchR(i, 22, lb, ub));		
		System.out.println(binarySearchR(i, 89, lb, ub));
		System.out.println(binarySearchR(i, -100, lb, ub));
		System.out.println(binarySearchR(i, 72, lb, ub));
		System.out.println(binarySearchR(i, 102, lb, ub));
	}

	private static int binarySearchI(int[] a, int srchVal) {
		// Bounds
		int lb = 0;
		int ub = a.length - 1;

		// Searches
		while (lb <= ub) {
			// Sets mid to middle of bounds
			int mid = (lb + ub) / 2;
			if (a[mid] == srchVal) {
				return mid;
			
			// Shrinks bounds
			} else if (srchVal > a[mid]) {
				lb = mid + 1;
			} else {
				ub = mid - 1;
			}
		}
		// If value not found
		return -1;
	}

	private static int binarySearchR(int[] a, int srchVal, int lb, int ub) {
		// If value not found
		if (lb > ub) {
			return -1;
		} else {
			// Sets mid to middle of bounds
			int mid = (lb + ub) / 2;
			if (a[mid] == srchVal) {
				return mid;
			
			// Shrinks bounds and recurses
			} else if (srchVal > a[mid]) {
				return binarySearchR(a, srchVal, mid + 1, ub);
			} else {
				return binarySearchR(a, srchVal, lb, mid - 1);
			}
		}
	}
}

/*
	Sample Output: [User Input]
		3
		11
		-1
		-1
		-1
		3
		11
		-1
		-1
		-1
*/