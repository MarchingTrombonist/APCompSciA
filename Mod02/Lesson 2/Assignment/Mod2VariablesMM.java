/*
	Program Name:	Mod2VariablesMM
	Author:	Mac Mai
	Date:	09/05/2019
	Version:	1.1
	Description:	Outputs my name, my age, and my age in 5 years
	Problems:	I messed up capitalization when declaring the integers
		Solutions:	I changed it to lowercase
	What I Learned:	How to declare strings and ints and that capitalization is important
*/

public class Mod2VariablesMM {
	public static void main(String[] args) {
		// Declares and defines name, age, age+5
		String myName = "Mac Mai";
		int myAge = 17;
		int futureAge = myAge + 5;
		// Outputs name, age, age+5
		System.out.println(myName);
		System.out.println(myAge);
		System.out.println(futureAge);
	}
}

/*
	Sample Output: [User Input]
		Mac Mai
		17
		22
*/