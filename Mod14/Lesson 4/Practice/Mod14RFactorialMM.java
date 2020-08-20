/*
	Program Name:	
	Author: Mac Mai
	Date:	04/07/2020
	Version:	1.1
	Description:	Recursive factorial
	Problems:	No problems
		Solutions:	N/A
	What I Learned:	Recursive factorial in java breaks after 13!
*/

public class Mod14RFactorialMM {
	public static void main(String[] args) {
		for (int i = 0; i <= 34; i++) {
			System.out.println("Factorial of " + i + " is " + rFactorial(i));
		}
	}

	public static int rFactorial(int a) {
		if (a < 0) {
			System.exit(1);
		}
		if (a == 0) {
			return 1;
		} else {
			return a * rFactorial(a - 1);
		}
	}
}

/*
	Sample Output: [User Input]
		Factorial of 0 is 1
		Factorial of 1 is 1
		Factorial of 2 is 2
		Factorial of 3 is 6
		Factorial of 4 is 24
		Factorial of 5 is 120
		Factorial of 6 is 720
		Factorial of 7 is 5040
		Factorial of 8 is 40320
		Factorial of 9 is 362880
		Factorial of 10 is 3628800
		Factorial of 11 is 39916800
		Factorial of 12 is 479001600
		Factorial of 13 is 1932053504
		Factorial of 14 is 1278945280
		Factorial of 15 is 2004310016
		Factorial of 16 is 2004189184
		Factorial of 17 is -288522240
		Factorial of 18 is -898433024
		Factorial of 19 is 109641728
		Factorial of 20 is -2102132736
		Factorial of 21 is -1195114496
		Factorial of 22 is -522715136
		Factorial of 23 is 862453760
		Factorial of 24 is -775946240
		Factorial of 25 is 2076180480
		Factorial of 26 is -1853882368
		Factorial of 27 is 1484783616
		Factorial of 28 is -1375731712
		Factorial of 29 is -1241513984
		Factorial of 30 is 1409286144
		Factorial of 31 is 738197504
		Factorial of 32 is -2147483648
		Factorial of 33 is -2147483648
		Factorial of 34 is 0
*/