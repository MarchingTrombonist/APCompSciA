/*
	Program Name:	Mod9WrapperClassMM
	Author: Mac Mai
	Date:	01/26/2020
	Version:	1.1
	Description:	Prints using Integer wrappers
	Problems:	No problems
		Solutions:	N/A
	What I Learned:	How to use the Integer wrapper
*/

public class Mod9WrapperClassMM {
	public static void main(String[] args) {
		// Multiplies
		Integer x = 3;
		Integer y = 5;
		System.out.println(x * y);

		// Turns the String into an int
		String s = "139";
		// int i = s; /*Doesn't work because you can't convert a String to an int*/
		int i = Integer.parseInt(s);
		System.out.println(i);

		// Turns the String into an int (pentatrigesimal to decimal)
		String s1 = "3w4br";
		int j = Integer.parseInt(s1, 35);
		System.out.println(j);

		// Turns the String into a double
		String s2 = "282.8026";
		double k = Double.parseDouble(s2);
		System.out.println(k);
	}
}

/*
	Sample Output: [User Input]
		15
		139
		5879187
		282.8026
*/