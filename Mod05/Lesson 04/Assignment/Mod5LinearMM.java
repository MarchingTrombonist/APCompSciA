/*
	Program Name:	Mod5LinearMM
	Author: Mac Mai
	Date:	10/08/2019
	Version:	1.3
	Description:	Solves linear equations
	Problems:	I did booleans wrong in the ifs
		Solutions:	I added a '!'
	What I Learned:	How to test multiple possibilities in else ifs and do math
*/

//Imports
import java.util.*;
import java.io.*;

public class Mod5LinearMM {
	public static void main(String[] args) {
		// Creates scanner
		Scanner coefficients = new Scanner(System.in);
		// Prints
		System.out.println("Linear Equation Solver\nAx+B=0");
		// Catches errors
		try {
			// Gets coefficients
			System.out.print("Enter A: ");
			double a = coefficients.nextDouble();
			System.out.print("Enter B: ");
			double b = coefficients.nextDouble();
			// Tests for all four possibilities and outputs
			if (a == 0 && b == 0) {
				System.out.println("0x + 0 = 0 --> There are infinite solutions");
			} else if (a == 0 && b != 0) {
				System.out.printf("0x + (%f) = 0 --> There are no solutions", b);
			} else if (a != 0 && b == 0) {
				System.out.printf("(%f)x + 0 = 0 --> x = 0", a);
			} else if (a != 0 && b != 0) {
				double x = (0 - b) / a;
				System.out.printf("(%f)x + (%f) = 0 --> x = %f (-%f/%f)", a, b, x, b, a);
			} else {
				System.out.println(
						"This is supposed to be an impossible outcome. If you're seeing this message, something has gone very wrong.");
			}
		} catch (Exception e) {
			System.out.println("Error: Invalid input\nPlease restart");
		}

		// Closes scanner
		coefficients.close();
	}
}

/*
	Sample Output: [User Input]
		Linear Equation Solver
		Ax+B=0
		Enter A: [4]
		Enter B: [-5]
		(4.000000)x + (-5.000000) = 0 --> x = 1.250000 (--5.000000/4.000000)
	
	Sample Output: [User Input]
		Linear Equation Solver
		Ax+B=0
		Enter A: [7]
		Enter B: [12]
		(7.000000)x + (12.000000) = 0 --> x = -1.714286 (-12.000000/7.000000)
	
	Sample Output: [User Input]
		Linear Equation Solver
		Ax+B=0
		Enter A: [0]
		Enter B: [0]
		0x + 0 = 0 --> There are infinite solutions
	
	Sample Output: [User Input]
		Linear Equation Solver
		Ax+B=0
		Enter A: [0]
		Enter B: [7]
		0x + (7.000000) = 0 --> There are no solutions
	
	Sample Output: [User Input]
		Linear Equation Solver
		Ax+B=0
		Enter A: [3.5]
		Enter B: [-1.6]
		(3.500000)x + (-1.600000) = 0 --> x = 0.457143 (--1.600000/3.500000)
	
	Sample Output: [User Input]
		Linear Equation Solver
		Ax+B=0
		Enter A: [5]
		Enter B: [1.3]
		(5.000000)x + (1.300000) = 0 --> x = -0.260000 (-1.300000/5.000000)
*/