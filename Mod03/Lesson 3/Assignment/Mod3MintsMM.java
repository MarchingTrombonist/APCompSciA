/*
	Program Name:	Mod3MintsMM
	Author:	Mac Mai
	Date:	09/16/2019
	Version:	1.1
	Description:	Prints amount of mints, the amount of bags needed, and the mints left over
	Problems:	I did totalMints / 3 - mintsLeftOver at first
		Solutions:	I changed it to (totalMints - mintsLeftOver) / 3
	What I Learned:	When to use modulo vs. division
*/

public class Mod3MintsMM {
	public static void main(String[] args) {
		// Declares vars, int because I only want whole bags
		int totalMints, numberOfBags, mintsLeftOver;
		// Defines vars
		totalMints = 500;
		// Uses modulo for remainder
		mintsLeftOver = totalMints % 3;
		// Uses division for quotient
		numberOfBags = (totalMints - mintsLeftOver) / 3;
		// Prints
		System.out.println("Total Mints = " + totalMints);
		System.out.println("Number of Bags = " + numberOfBags);
		System.out.println("Mints Left Over = " + mintsLeftOver);
	}
}

/*
	Sample Output: [User Input]
		Total Mints = 500
		Number of Bags = 166
		Mints Left Over = 2
*/