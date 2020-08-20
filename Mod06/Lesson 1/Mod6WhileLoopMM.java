/*
	Program Name:	Mod6WhileLoopMM
	Author: Mac Mai
	Date:	10/29/2019
	Version:	1.1
	Description:	While loop
	Problems:	Forgot a semicolon
		Solutions:	I added it
	What I Learned:	How to use while loops
*/

public class Mod6WhileLoopMM {
	public static void main(String[] args) {
		// Declares vars
		int sum = 0;
		// Same as for(int j = 3; j <= 79; j++){}
		int j = 3;
		// Loops until j > 79
		while (j <= 79) {
			sum += j;
			j++;
		}
		// Prints
		System.out.println(sum);
	}
}

/*
	Sample Output: [User Input]
		3157
*/