/*
	Program Name:	Mod6DoWhileLoopMM
	Author: Mac Mai
	Date:	11/05/2019
	Version:	1.1
	Description:	Do-while loop
	Problems:	No problems
		Solutions:	
	What I Learned:	How to use a do-while loop
*/

public class Mod6DoWhileLoopMM {
	public static void main(String[] args) {
		// Vars
		int sum = 0;
		int j = 3;
		// Adds j to sum until j is 79 (79 is the last added)
		do {
			sum += j;
			j++;
		} while (j <= 79);
		// Prints
		System.out.println(sum);

		// Checks first, then runs
		while (j <= 79) {

		}
		// Runs first, then checks
		do {

		} while (j <= 79);
	}
}

/*
	Sample Output: [User Input]
		3157
*/