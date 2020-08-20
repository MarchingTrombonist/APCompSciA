/*
	Program Name:	Mod14RabbitsMM
	Author: Mac Mai
	Date:	04/08/2020
	Version:	1.0
	Description:	Fibonacci numbers
	Problems:	No problems
		Solutions:	N/A
	What I Learned:	How to recurse
*/

public class Mod14RabbitsMM {
	public static void main(String[] args) {
		for(int i = 0; i <= 10; i++) {
			System.out.println(fib(i));
		}
	}

	public static int fib(int n) {
		// Base cases
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			// Recurses
			return fib(n - 1) + fib(n - 2);
		}
	}
}

/*
	Sample Output: [User Input]
		0
		1
		1
		2
		3
		5
		8
		13
		21
		34
		55
*/