/*
	Program Name:	Mod10ArraysMM
	Author: Mac Mai
	Date:	02/03/2020
	Version:	1.2
	Description:	Reverses an array
	Problems:	The print statements were hard-coded
		Solutions:	I made them work for any size array
	What I Learned:	How to use arrays
*/

public class Mod10ArraysMM {
	public static void main(String[] args) {
		int[] val = { 0, 1, 2, 3 };
		int temp;

		// Increments through the array
		System.out.print("Original Array:");
		for (int i = 0; i < val.length; i++) {
			System.out.print(" " + val[i]);
		}

		// Reverse the order of the numbers in the array
		// Puts [0] into temp, [length - 1] into [0], temp into [length - 1]; increments
		// both sides in by one
		// Works for any size array

		for (int i = 0; i < val.length / 2; i++) {
			temp = val[i];
			val[i] = val[val.length - 1 - i];
			val[val.length - 1 - i] = temp;
		}

		// Increments through the array
		System.out.print("\nReversed Array:");
		for (int i = 0; i < val.length; i++) {
			System.out.print(" " + val[i]);
		}
	}
}

/*
	Sample Output: [User Input]
		Original Array: 0 1 2 3
		Reversed Array: 3 2 1 0
*/
