/*
	Program Name:	Mod3EscapeMM
	Author:	Mac Mai
	Date:	09/17/2019
	Version:	1.1
	Description:	Prints things with escape characters
	Problems:	I put a space after escape characters
		Solutions:	I removed the space
	What I Learned:	How to use escape characters
*/

public class Mod3EscapeMM {
	public static void main(String[] args) {
		// Prints the two lines
		print("Hello World\nUnion Academy");
		print("I'm a \"Cardinal\"!\t\tGo Cardinals!");
	}

	// Makes print shorter
	public static void print(String x) {
		System.out.println(x);
	}
}

/*
	Sample Output: [User Input]
		Hello World
		Union Academy
		I'm a "Cardinal"!       Go Cardinals!
*/