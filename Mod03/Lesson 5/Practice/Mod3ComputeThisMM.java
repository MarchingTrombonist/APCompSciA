/*
	Program Name:	Mod3ComputeThisMM
	Author:	Mac Mai
	Date:	09/16/2019
	Version:	1.1
	Description:	Does different operations
	Problems:	I didn't ceil() the random number, so I got a floating point
		Solutions:	I added Math.ceil()
	What I Learned:	How to do many different math functions
*/

public class Mod3ComputeThisMM {
	public static void main(String[] args) {
		double x, y, z, w;
		x = 3;
		y = -5;
		z = 0;
		w = 17.5;
		System.out.println("w = " + w + ", x = " + x + ", y = " + y + ", z = " + z);
		z = Math.abs(y);
		System.out.println("z is the absolute value of y and is " + z);
		System.out.println("The square root of w is " + Math.sqrt(w));
		System.out.println("x raised to the power of z is " + Math.pow(x, z));
		System.out.println(Math.max(x, y) + " is the max of x and y");
		System.out.println(Math.min(x, y) + " is the min of x and y");
		System.out.println("If you round w you get " + Math.round(w));
		System.out.println("The floor value of w is " + Math.floor(w));
		System.out.println("The ceiling value of w is " + Math.ceil(w));
		System.out.println("A random number between 1 and 10 is: " + Math.ceil(10 * Math.random()));
	}
}

/*
	Sample Output: [User Input]
		w = 17.5, x = 3.0, y = -5.0, z = 0.0
		z is the absolute value of y and is 5.0
		The square root of w is 4.183300132670378
		x raised to the power of z is 243.0
		3.0 is the max of x and y
		-5.0 is the min of x and y
		If you round w you get 18
		The floor value of w is 17.0
		The ceiling value of w is 18.0
		A random number between 1 and 10 is: 10.0
*/