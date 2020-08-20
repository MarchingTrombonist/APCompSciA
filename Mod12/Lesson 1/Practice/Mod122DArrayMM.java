/*
	Program Name:	Mod122DArrayMM
	Author: Mac Mai
	Date:	03/10/2020
	Version:	1.1
	Description:	2D arrays
	Problems:	No problems
		Solutions:	N/A
	What I Learned:	How to use 2d arrays
*/

public class Mod122DArrayMM {
	public static void main(String[] args) {
		// 2d arrays
		int[][] a = new int[3][2];
		a[0][0] = 22;
		a[0][1] = 23;
		a[1][0] = 24;
		a[1][1] = 25;
		a[2][0] = 26;
		a[2][1] = 27;

		int[][] b = {
			{23, 23},
			{24, 25},
			{26, 27}
		};

		int[][] c = new int[][] {
			{23, 23},
			{24, 25},
			{26, 27}
		};

		// prints
		System.out.println(a.length);
		System.out.println(a[0].length);

		int[][] abc = new int[20][30];
	}
}

/*
	Sample Output: [User Input]
		3
		2
*/