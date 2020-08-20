/*
	Program Name:	Mod6CompoundThatMM
	Author: Mac Mai
	Date:	11/05/2019
	Version:	1.3
	Description:	Calculates doubling time for interest
	Problems:	Rounding didn't work
		Solutions:	Changed 100 to 100.0
	What I Learned:	How to use loops
*/

//Imports
import java.util.*;
import java.io.*;

public class Mod6CompoundThatMM {
	public static void main(String[] args) {
		// Scanner
		Scanner input = new Scanner(System.in);
		// Gets inputs
		System.out.print("Enter account balance: $");
		double startBalance = input.nextDouble();
		System.out.print("\nEnter interest rate (as a decimal): ");
		double rate = input.nextDouble();

		// Loops adding interest until the balance is double
		// Runs three trials
		for (int i = 1; i <= 3; i++) {
			System.out.print("\nEnter Period: ");
			double period = input.nextDouble();
			double time = 0;
			double balance = startBalance;
			// Interest
			do {
				balance = Math.round(100.0 * balance * (1 + rate / period)) / 100.0;
				time++;
			} while (balance / 2 < startBalance);
			// Prints
			System.out.println("Years to Double: " + time / period);
			System.out.println("Ending Balance: $" + balance);
		}
		input.close();
	}
}

/*
	Sample Output: [User Input]
		Enter account balance: $[100]

		Enter interest rate (as a decimal): [.09]

		Enter Period: [1]
		Years to Double: 9.0
		Ending Balance: $217.18

		Enter Period: [12]
		Years to Double: 7.75
		Ending Balance: $200.32

		Enter Period: [365]
		Years to Double: 7.632876712328767
		Ending Balance: $200.02
*/