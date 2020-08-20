/*
	Program Name:	Mod11HashPracticeMM
	Author: Mac Mai
	Date:	02/24/2020
	Version:	1.1
	Description:	Hash function
	Problems:	No problems
		Solutions:	N/A
	What I Learned:	How to use hash functions
*/

public class Mod11HashPracticeMM {
	public static void main(String[] args) {
		System.out.println(hashCode(10));
	}

	// Hashes
	public static int hashCode(int key) {
		final int TABLE_SIZE = 75;
		return key % TABLE_SIZE;
	}
}

/*
	Sample Output: [User Input]
		10
*/