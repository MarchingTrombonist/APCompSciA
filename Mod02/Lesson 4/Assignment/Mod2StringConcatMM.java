/*
	Program Name:	Mod2StringConcatMM
	Author:	Mac Mai
	Date:	09/05/2019
	Version:	1.2
	Description:	Outputs my name, the length of my first name, and a 3-letter substring from my last name
	Problems:	I missed a space in printing my name
						I did the length method wrong
		Solutions:	I added a + " " +
								I double checked the notes and fixed it
	What I Learned:	How to concatenate and use methods on strings
*/

public class Mod2StringConcatMM {
	public static void main(String[] args) {
		// Declares variable types
		String firstName, lastName;
		int len;
		// Defines variables
		firstName = "Mac";
		lastName = "Mai";
		len = firstName.length();
		// Outputs the variables in the correct context
		System.out.println("My name is " + firstName + " " + lastName);
		System.out.println("My first name is " + len + " letters long");
		System.out.println("A substring of my last name is " + lastName.substring(0, 3));
	}
}

/*
	Sample Output: [User Input]
		My name is Mac Mai
		My first name is 3 letters long
		A substring of my last name is Mai
*/