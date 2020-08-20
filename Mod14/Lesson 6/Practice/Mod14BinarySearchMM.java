/*
	Program Name:	Mod14BinarySearchMM
	Author: Mac Mai
	Date:	04/09/2020
	Version:	1.1
	Description:	Binary search
	Problems:	No problems
		Solutions:	N/A
	What I Learned:	How to use a binary search
*/

public class Mod14BinarySearchMM {
	public static void main(String[] args) {
		// Creates array
		int[] i = {-7, 15, 21, 22, 43, 49, 51, 67, 78, 81, 84, 89, 95, 97};

		int lb = 0;
		int ub = i.length - 1;
		System.out.println(binarySearchR(i, 22, lb, ub));		
		System.out.println(binarySearchR(i, 89, lb, ub));
		System.out.println(binarySearchR(i, -100, lb, ub));
		System.out.println(binarySearchR(i, 72, lb, ub));
		System.out.println(binarySearchR(i, 102, lb, ub));
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
*/