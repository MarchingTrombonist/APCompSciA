/*
	Program Name:	Mod9EncapsulationTutorialMM
	Author: Mac Mai
	Date:	01/21/2020
	Version:	1.1
	Description:	Tests public and private
	Problems:	The doubles don't work
		Solutions:	You would have to make cost and pricePerCalorie() public
	What I Learned:	How public vs. private works
*/

public class Mod9EncapsulationTutorialMM {
	public static void main(String[] args) {
		Recipe yummyStuff = new Recipe("Watermelon Salad");

		// Don't work because cost and pricePerCalorie() are private
		// double ff = yummyStuff.cost;
		// double gg = yummyStuff.pricePerCalorie(3);
	}
}

/*
	Sample Output: [User Input]
		Mod9EncapsulationTutorialMM.java:17: error: cost has private access in Recipe
						double ff = yummyStuff.cost;
																	^
		Mod9EncapsulationTutorialMM.java:18: error: pricePerCalorie(int) has private access in Recipe
						double gg = yummyStuff.pricePerCalorie(3);
																	^
		2 errors
		compiler exit status 1
*/