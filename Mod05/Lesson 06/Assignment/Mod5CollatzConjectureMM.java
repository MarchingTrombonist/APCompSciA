/*
	Program Name:	Mod5CollatzConjectureMM
	Author: Mac Mai
	Date:	10/15/2019
	Version:	1.3
	Description: Prints the collatz conjecture sequence from n=1 to n=25, the length of each sequence, and the longest sequence	
	Problems:	I did = instead of == in the ifs
						When I tried to run it with big numbers, it took too much time printing everything
						I got an integer overflow with big numbers
		Solutions:	I changed it
								I commented out the printing when I tried it with big numbers
								I used longs instead of ints
	What I Learned:	How to print terms in a sequence and format correctly
*/


/*
	If you want to find the longest sequence in a range
	comment out all the print statements within the for() loop
	(marked with 'Comment me out')
	set low and high 
	(I would not recommend you set high to past 1000000, as it starts to take very long)
*/

public class Mod5CollatzConjectureMM {
	public static void main(String[] args) {
		// Sets vars to track the longest sequence to 0
		long longest = 0;
		long longestLength = 0;
		// Sets range to run the sequence in
		int low = 1;
		int high = 25;
		// for loop that runs the collatz conjecture from 'low' to 'high'
		for (long i = low; i <= high; i++) {
			System.out.print(i + ": ");/* Comment me out */
			// Uses n instead of i to do math with so that the for loop runs properly
			long n = i;
			// Sets length to 0 at the beginning of the sequence
			long length = 0;
			// Until n == 1, tests if n is even or odd and then stores and prints the next
			// value according to the rules of the conjecture
			do {
				if (n % 2 == 1) {
					n = (n * 3) + 1;
					System.out.print(n + " ");/* Comment me out */
				} else if (n % 2 == 0) {
					n = n / 2;
					System.out.print(n + " ");/* Comment me out */
				}
				// Increments the length each time a number is appended
				length++;
				// Checks if the loop should repeat
			} while (n != 1);
			// After the sequence reaches 1, if the length is longer than the current
			// longest length, the length becomes the new longest length
			// And the current starting value (i) becomes the new longest starting value
			if (length > longestLength) {
				longestLength = length;
				longest = i;
			}
			// Prints the length at the end of the sequence
			System.out.println("[Length of " + length + "]");/* Comment me out */
		}
		// Prints what the number for the longest sequence was, along with its length
		// and the sequence itself
		System.out.println("\n\nLongest sequence is " + longest + ", with a length of " + longestLength + ".");
		System.out.print("\n" + longest + ": ");
		// Redoes the sequence for the stored longest starting number
		do {
			if (longest % 2 == 1) {
				longest = (longest * 3) + 1;
				System.out.print(longest + " ");
			} else if (longest % 2 == 0) {
				longest = longest / 2;
				System.out.print(longest + " ");
			}
		} while (longest != 1);
	}
}

/*
	Sample Output: [User Input]
		1: 4 2 1 [Length of 3]
		2: 1 [Length of 1]
		3: 10 5 16 8 4 2 1 [Length of 7]
		4: 2 1 [Length of 2]
		5: 16 8 4 2 1 [Length of 5]
		6: 3 10 5 16 8 4 2 1 [Length of 8]
		7: 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 [Length of 16]
		8: 4 2 1 [Length of 3]
		9: 28 14 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 [Length of 19]
		10: 5 16 8 4 2 1 [Length of 6]
		11: 34 17 52 26 13 40 20 10 5 16 8 4 2 1 [Length of 14]
		12: 6 3 10 5 16 8 4 2 1 [Length of 9]
		13: 40 20 10 5 16 8 4 2 1 [Length of 9]
		14: 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 [Length of 17]
		15: 46 23 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1 [Length of 17]
		16: 8 4 2 1 [Length of 4]
		17: 52 26 13 40 20 10 5 16 8 4 2 1 [Length of 12]
		18: 9 28 14 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 [Length of 20]
		19: 58 29 88 44 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 [Length of 20]
		20: 10 5 16 8 4 2 1 [Length of 7]
		21: 64 32 16 8 4 2 1 [Length of 7]
		22: 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 [Length of 15]
		23: 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1 [Length of 15]
		24: 12 6 3 10 5 16 8 4 2 1 [Length of 10]
		25: 76 38 19 58 29 88 44 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 [Length of 23]


		Longest sequence is 25, with a length of 23.

		25: 76 38 19 58 29 88 44 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1
*/

/*
	If you're curious, the starting values for the longest sequence up to the powers of 10 up to 10^9 are:

	[Tested up to: starting value; sequence length]
	1000000000: 670617279; 986
	100000000: 63728127; 949
	10000000: 8400511; 685
	1000000: 837799; 524
	100000: 77031; 350
	10000: 6171; 261
	1000: 871; 178
	100: 97; 118
	10: 9; 19
	1: 1; 3
*/