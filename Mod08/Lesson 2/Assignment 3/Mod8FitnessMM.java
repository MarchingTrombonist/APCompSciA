/*
	Program Name:	Mod8FitnessMM
	Author: Mac Mai
	Date:	12/16/2019
	Version:	1.3
	Description:	Gym signup
	Problems:	Switch statement wasn't working right
		Solutions:	Moved the dscList Array to the main method
	What I Learned:	How to write methods
*/

//Imports
import java.util.*;
import java.io.*;

public class Mod8FitnessMM {
	public static void main(String[] args) {
		// Creates scanner
		Scanner input = new Scanner(System.in);

		// Exits if not a new member
		System.out.print("Welcome to Today's Gym. Are you a new member (y/n)? ");
		if (input.next().charAt(0) != 'y') {
			System.out.println("Thank you for returning!");
			System.exit(0);
		}

		// Gets first/last name
		System.out.print("First Name: ");
		String firstName = input.next();
		System.out.print("Last Name: ");
		String lastName = input.next();

		// Creates discount values as an array (1 is default)
		double[] dscList = { 1, 1, 1 };

		// Gets age
		System.out.print("Age: ");
		double age = input.nextDouble();
		// Sets the first discount value
		// discounts() prints
		dscList[0] = discounts("senior", age);

		// Gets months
		System.out.print("How many months do you want: ");
		double months = input.nextDouble();
		// Sets the second discount value
		// discounts() prints
		dscList[1] = discounts("months", months);

		// Gets sessions
		System.out.print("How many personal training sessions do you want: ");
		double sessions = input.nextDouble();
		// Sets the third discount value
		// discounts() prints
		dscList[2] = discounts("sessions", sessions);

		// Prints total price
		System.out.printf("Total price is: $%.2f%n", totalPrice(months, sessions, dscList));

		// Asks if repeat
		System.out.print("Is there another member (y/n)? ");
		repeat(input.next());

		input.close();
	}

	// Repeats program based on user input
	public static void repeat(String input) {
		if (input.charAt(0) != 'y') {
			System.out.println("Thank you!");
			System.exit(1);
		} else {
			String[] x = { "" };
			Mod8FitnessMM.main(x);
		}
	}

	public static double discounts(String dscName, double checkNum) {
		// Discount default value
		double dsc = 1;
		// Checks name of discount and runs for the right one
		switch (dscName) {
		// Senior discount
		case "senior":
			if (checkNum >= 65) {
				// Sets discount to .75 and prints 25%
				dsc = .75;
				System.out.println("You qualify for a 25% senior discount.");
			} else {
				// Prints doesn't qualify
				System.out.println("You do not qualify for a senior discount.");
			}
			return dsc;

		// 12 month discount
		case "months":
			if (checkNum >= 12) {
				// Sets discount to .85 and prints price + 15% discount
				dsc = .85;
				System.out.println("Price: $" + monthPrice(checkNum) + " with a 15% discount = $" + monthPrice(checkNum) * .85);
			} else {
				// Prints price
				System.out.println("Price: $" + monthPrice(checkNum));
			}
			return dsc;

		// 7 session discount
		case "sessions":
			if (checkNum >= 7) {
				// Sets discount to .78 and prints price + 22% discount
				dsc = .78;
				System.out
						.println("Price: $" + sessionPrice(checkNum) + " with a 22% discount = $" + sessionPrice(checkNum) * .78);
			} else {
				// Prints discount
				System.out.println("Price: $" + sessionPrice(checkNum));
			}
			return dsc;

		default:
			return dsc;
		}
	}

	// Calculates month price
	public static double monthPrice(double months) {
		return months * 30;
	}

	// Calculates session price
	public static double sessionPrice(double sessions) {
		return sessions * 15;
	}

	// Calculates total price
	public static double totalPrice(double months, double sessions, double[] dscList) {
		// Month price * month discount
		double monthPrice = monthPrice(months) * dscList[1];
		// Session price * session discount
		double sessionPrice = sessionPrice(sessions) * dscList[2];
		// Adds the two and * senior discount
		double totalPrice = (monthPrice + sessionPrice) * dscList[0];
		return totalPrice;
	}
}

/*
	Sample Output: [User Input]
		Welcome to Today's Gym. Are you a new member (y/n)? [y]
		First Name: [Test]
		Last Name: [Ing]
		Age: [65]
		You qualify for a 25% senior discount.
		How many months do you want: [12]
		Price: $360.0 with a 15% discount = $306.0
		How many personal training sessions do you want: [7]
		Price: $105.0 with a 22% discount = $81.9
		Total price is: $290.92
		Is there another member (y/n)? [y]
		Welcome to Today's Gym. Are you a new member (y/n)? [n]
		Thank you for returning!
*/