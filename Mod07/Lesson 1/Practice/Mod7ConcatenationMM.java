/*
	Program Name:	Mod7ConcatenationMM
	Author:	Mac Mai
	Date:	11/29/2019
	Version:	1.1
	Description:	Outputs strings concatenated and substrings
	Problems:	The variable names were non-descriptive
		Solutions:	I changed them to be better
	What I Learned:	How to concatenate strings and get substrings
*/

public class Mod7ConcatenationMM {
	public static void main(String[] args) {
		String strCon = "Hello";
		String strCat = "good buddy";
		String strConcat = strCon + " " + strCat;
		System.out.println(strConcat);
		System.out.println(strConcat.length());
		String myPet = "Sparky the dog";
		String smallPart = myPet.substring(4, 12);
		System.out.println(smallPart);
	}
}

/*
	Sample Output: [User Input]
		Hello good buddy
		16
		ky the d
*/