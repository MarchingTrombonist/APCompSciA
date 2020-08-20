/*
	Program Name:	Mod9AnonymousMM
	Author: Mac Mai
	Date:	01/17/2020
	Version:	1.2
	Description:	Tests object equality
	Problems:	Didn't have all the tests
		Solutions:	Added them
	What I Learned:	How to test equality
*/

public class Mod9AnonymousMM {
	public static void main(String[] args) {
		Recipe yummyStuff;
		yummyStuff = new Recipe("Watermelon Salad");

		// Circle cir1 = new Circle(13.2);
		yummyStuff.setServings(new Circle(13.2));

		// Compares
		Circle cir1 = new Circle(12.1);
		Circle cir2 = new Circle(12.1);

		// Refer to different objects so false
		System.out.println(cir1.equals(cir2));
		System.out.println(cir1 == cir2);

		// Refer to the same object so true
		cir2 = cir1;
		System.out.println(cir1.equals(cir2));
		System.out.println(cir1 == cir2);
	}
}

/*
	Sample Output: [User Input]
		false
		false
		true
		true
*/