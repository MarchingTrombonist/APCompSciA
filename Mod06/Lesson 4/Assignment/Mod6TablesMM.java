/*
	Program Name:	Mod6TablesMM
	Author: Mac Mai
	Date:	11/07/2019
	Version:	1.0
	Description:	Multiplication Tables
	Problems:	No problems
		Solutions:	N/A
	What I Learned:	How to nest for loops
*/

public class Mod6TablesMM {
	public static void main(String[] args) {
		// Loops first factor
		for (int a = 1; a <= 12; a++) {
			// Loops second factor
			for (int b = 1; b <= 12; b++) {
				// Prints
				System.out.println(a + " * " + b + " = " + a * b);
			}
			System.out.println();
		}
	}
}

/*
	Sample Output: [User Input]
		1 * 1 = 1
		1 * 2 = 2
		1 * 3 = 3
		1 * 4 = 4
		1 * 5 = 5
		1 * 6 = 6
		1 * 7 = 7
		1 * 8 = 8
		1 * 9 = 9
		1 * 10 = 10
		1 * 11 = 11
		1 * 12 = 12

		2 * 1 = 2
		2 * 2 = 4
		2 * 3 = 6
		2 * 4 = 8
		2 * 5 = 10
		2 * 6 = 12
		2 * 7 = 14
		2 * 8 = 16
		2 * 9 = 18
		2 * 10 = 20
		2 * 11 = 22
		2 * 12 = 24

		3 * 1 = 3
		3 * 2 = 6
		3 * 3 = 9
		3 * 4 = 12
		3 * 5 = 15
		3 * 6 = 18
		3 * 7 = 21
		3 * 8 = 24
		3 * 9 = 27
		3 * 10 = 30
		3 * 11 = 33
		3 * 12 = 36

		4 * 1 = 4
		4 * 2 = 8
		4 * 3 = 12
		4 * 4 = 16
		4 * 5 = 20
		4 * 6 = 24
		4 * 7 = 28
		4 * 8 = 32
		4 * 9 = 36
		4 * 10 = 40
		4 * 11 = 44
		4 * 12 = 48

		5 * 1 = 5
		5 * 2 = 10
		5 * 3 = 15
		5 * 4 = 20
		5 * 5 = 25
		5 * 6 = 30
		5 * 7 = 35
		5 * 8 = 40
		5 * 9 = 45
		5 * 10 = 50
		5 * 11 = 55
		5 * 12 = 60

		6 * 1 = 6
		6 * 2 = 12
		6 * 3 = 18
		6 * 4 = 24
		6 * 5 = 30
		6 * 6 = 36
		6 * 7 = 42
		6 * 8 = 48
		6 * 9 = 54
		6 * 10 = 60
		6 * 11 = 66
		6 * 12 = 72

		7 * 1 = 7
		7 * 2 = 14
		7 * 3 = 21
		7 * 4 = 28
		7 * 5 = 35
		7 * 6 = 42
		7 * 7 = 49
		7 * 8 = 56
		7 * 9 = 63
		7 * 10 = 70
		7 * 11 = 77
		7 * 12 = 84

		8 * 1 = 8
		8 * 2 = 16
		8 * 3 = 24
		8 * 4 = 32
		8 * 5 = 40
		8 * 6 = 48
		8 * 7 = 56
		8 * 8 = 64
		8 * 9 = 72
		8 * 10 = 80
		8 * 11 = 88
		8 * 12 = 96

		9 * 1 = 9
		9 * 2 = 18
		9 * 3 = 27
		9 * 4 = 36
		9 * 5 = 45
		9 * 6 = 54
		9 * 7 = 63
		9 * 8 = 72
		9 * 9 = 81
		9 * 10 = 90
		9 * 11 = 99
		9 * 12 = 108

		10 * 1 = 10
		10 * 2 = 20
		10 * 3 = 30
		10 * 4 = 40
		10 * 5 = 50
		10 * 6 = 60
		10 * 7 = 70
		10 * 8 = 80
		10 * 9 = 90
		10 * 10 = 100
		10 * 11 = 110
		10 * 12 = 120

		11 * 1 = 11
		11 * 2 = 22
		11 * 3 = 33
		11 * 4 = 44
		11 * 5 = 55
		11 * 6 = 66
		11 * 7 = 77
		11 * 8 = 88
		11 * 9 = 99
		11 * 10 = 110
		11 * 11 = 121
		11 * 12 = 132

		12 * 1 = 12
		12 * 2 = 24
		12 * 3 = 36
		12 * 4 = 48
		12 * 5 = 60
		12 * 6 = 72
		12 * 7 = 84
		12 * 8 = 96
		12 * 9 = 108
		12 * 10 = 120
		12 * 11 = 132
		12 * 12 = 144
*/