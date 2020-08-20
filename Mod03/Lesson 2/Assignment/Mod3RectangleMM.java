/*
	Program Name:	Mod3RectangleMM
	Author:	Mac Mai
	Date:	09/12/2019
	Version:	1.1
	Description:	Outputs areas and perimeters calculated from a given length and width
	Problems:	I switched the values of length and width
		Solutions:	I switched them back
	What I Learned:	How to do basic math
*/

public class Mod3RectangleMM {
	public static void main(String[] args) {
		// Declares the 6 variables as [int]s
		int length, width, perimeter, area, bigPerimeter, bigArea;
		// Defines the 6 variables
		length = 5;
		width = 4;
		perimeter = (2 * length) + (2 * width);
		area = length * width;
		bigPerimeter = (2 * (length + 1)) + (2 * (width + 1));
		bigArea = (length + 1) * (width + 1);
		// Prints the 6 variables
		System.out.println("length = " + length);
		System.out.println("width = " + width);
		System.out.println("perimeter = " + perimeter);
		System.out.println("area = " + area);
		System.out.println("bigPerimeter = " + bigPerimeter);
		System.out.println("bigArea = " + bigArea);
	}
}

/*
	Sample Output: [User Input]
		length = 5
		width = 4
		perimeter = 18
		area = 20
		bigPerimeter = 22
		bigArea = 30
*/