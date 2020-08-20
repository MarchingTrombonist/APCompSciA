/*
	Program Name:	Mod10ArraysPracticeMM
	Author: Mac Mai
	Date:	02/04/2020
	Version:	1.1
	Description:	Does stuff with arrays
	Problems:	None
		Solutions:	N/A
	What I Learned:	How to use arrays
*/

public class Mod10ArraysPracticeMM {
	public static void main(String[] args) {
		// int grade1 = 97;
		// int grade2 = 62;
		// int grade3 = 85;

		// Creates array of ints
		int grade[] = { 97, 62, 85, 26 };
		System.out.println(grade[1]);
		// 4 isn't a valid range
		// System.out.println(grade[4]);

		// Creates array of ints and puts values in
		int grade1[] = new int[400];
		grade1[0] = 97;
		grade1[1] = 62;
		System.out.println(grade1[0]);

		// Prints length of array
		System.out.println(grade.length);

		// Creates array of square numbers
		int sq[] = new int[1000];
		for (int j = 0; j < sq.length; j++) {
			sq[j] = j * j;
		}

		System.out.println(sq[5]);

		// Creates array of doubles
		double d[] = new double[1000];
		System.out.println(d[500]);

		// Creates string and array
		String s = "Hello again";
		String sp[];

		// Splits string
		sp = s.split("a|g");

		// Prints
		for (int j = 0; j < sp.length; j++) {
			System.out.println(sp[j]);
		}
	}
}

/*
	Sample Output: [User Input]
		62
		97
		4
		25
		0.0
		Hello


		in
*/