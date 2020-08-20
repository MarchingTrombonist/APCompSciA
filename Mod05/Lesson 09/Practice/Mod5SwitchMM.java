/*
	Program Name: Mod5SwitchMM
	Author: Mac Mai
	Date:	10/22/2019
	Version:	1.1
	Description:	Takes two inputs and does the operation of the user's choice
	Problems:	I missed a colon
		Solutions:	I added it
	What I Learned:	How to use switch statements
*/

//Imports
import java.util.*;
import java.io.*;

public class Mod5SwitchMM {
	public static void main(String[] args) {
		// Prints
		System.out.println("Make your arithmetic selection from the choices below:\n");
		System.out.println("1. addition");
		System.out.println("2. subtraction");
		System.out.println("3. multiplication");
		System.out.println("4. division\n");
		System.out.print("   Your choice? ");
		// Creates scanner
		Scanner kbReader = new Scanner(System.in);

		// Gets choice
		int choice = kbReader.nextInt();

		// Prints and gets first operand
		System.out.print("\nEnter first operand ");
		double op1 = kbReader.nextDouble();

		// Prints and gets second operand
		System.out.print("\nEnter second operand ");
		double op2 = kbReader.nextDouble();

		// Switches based on choice
		switch (choice) {
		case 1: // addition
			System.out.print(op1 + " plus " + op2 + " = " + (op1 + op2));
			break;
		case 2: // subtraction
			System.out.print(op1 + " minus " + op2 + " = " + (op1 - op2));
			break;
		case 3: // multiplication
			System.out.print(op1 + " times " + op2 + " = " + (op1 * op2));
			break;
		case 4: // division
			System.out.print(op1 + " divided by " + op2 + " = " + (op1 / op2));
			break;
		default: // runs if choice is invalid
			System.out.print("Please enter only 1,2,3,4");
		}
	}
}

/*
	Sample Output: [User Input]
		Make your arithmetic selection from the choices below:

		1. addition
		2. subtraction
		3. multiplication
		4. division

			Your choice? [4]

		Enter first operand [2.71828182846]

		Enter second operand [3.141592653589793]
		2.71828182846 divided by 3.141592653589793 = 0.865255979432569
*/