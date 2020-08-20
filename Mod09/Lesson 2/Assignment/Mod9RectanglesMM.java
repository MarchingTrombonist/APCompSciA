/*
	Program Name:	Mod9RectanglesMM
	Author: Mac Mai
	Date:	01/09/2020
	Version:	1.2
	Description:	Finds area and perimeter of rectangles
	Problems:	No problems
		Solutions:	N/A
	What I Learned:	How to use methods
*/

//Imports
import java.io.*;
import java.util.*;

public class Mod9RectanglesMM {
	public static void main(String[] args) {
		// Creates scanner
		Scanner input = new Scanner(System.in);

		// Creates rectangle
		Rectangle rect = new Rectangle();

		// Prints and gets length and width
		System.out.print("Please enter the length of the rectangle (in inches): ");
		rect.setLength(input.nextDouble());
		System.out.print("Please enter the width of the rectangle (in inches): ");
		rect.setWidth(input.nextDouble());

		// Prints
		System.out.println("The area of the rectangle is " + rect.getArea() + " square inches. The perimeter is "
				+ rect.getPerimeter() + " inches.");

		// Runs again
		System.out.println("Would you like to run another? (y/n)");
		if (input.next().charAt(0) == 'y') {
			String[] x = { "" };
			Mod9RectanglesMM.main(x);
		} else {
			System.exit(1);
		}
	}
}

/*
	Sample Output: [User Input]
		Please enter the length of the rectangle (in inches): [6]
		Please enter the width of the rectangle (in inches): [10]
		The area of the rectangle is 60.0 square inches. The perimeter is 32.0 inches.
		Would you like to run another? (y/n)
		[y]
		Please enter the length of the rectangle (in inches): [3]
		Please enter the width of the rectangle (in inches): [7]
		The area of the rectangle is 21.0 square inches. The perimeter is 20.0 inches.
		Would you like to run another? (y/n)
		[y]
		Please enter the length of the rectangle (in inches): [2]
		Please enter the width of the rectangle (in inches): [18]
		The area of the rectangle is 36.0 square inches. The perimeter is 40.0 inches.
		Would you like to run another? (y/n)
		[n]
*/