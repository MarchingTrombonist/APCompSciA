/*
	Program Name:	Mod5TesterMM
	Author: Mac Mai
	Date:	10/03/2019
	Version:	1.0
	Description:	Tests boolean operators
	Problems:	I did = instead of ==
		Solutions:	I changed it to ==
	What I Learned:	How to use boolean operators
*/

public class Mod5TesterMM {
	public static void main(String[] args) {
		// Declares ints
		int x = 37;
		int y = 49;
		int z = 37;
		// Sets bools by comparing ints
		boolean b = (x >= y);
		// Prints bools
		System.out.println(b);
		// Sets bools by comparing ints
		b = !(x < y) && (x == z);
		// Prints bools
		System.out.println(b);
		// Sets bools by comparing ints
		b = (x > y) || (x < z);
		// Prints bools
		System.out.println(b);
		// Sets bools by comparing ints
		b = true || false && false;
		// Prints bools
		System.out.println(b);
	}
}

/*
	Sample Output: [User Input]
		false
		false
		false
		true
*/