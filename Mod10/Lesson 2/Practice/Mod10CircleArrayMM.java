/*
	Program Name:	Mod10CircleArrayMM
	Author: Mac Mai
	Date:	02/06/2020
	Version:	1.1
	Description:	Creates array of circles
	Problems:	No problems
		Solutions:	N/A
	What I Learned:	How to make arrays of objects
*/

public class Mod10CircleArrayMM {
	public static void main(String[] args) {
		// Creates array
		Circle cir[] = new Circle[500];
		// cir[1] = new Circle(1);
		// cir[2] = new Circle(2);

		// Loops and creates circles
		for (int i = 0; i < cir.length; i++) {
			cir[i] = new Circle(i);
		}
	}
}

//The loop is better because it's only 3 lines of code for n circles vs n lines of code for n circles 

/*
	Sample Output: [User Input]
*/