/*
	Program Name:	Mod4LightsMM
	Author: Mac Mai
	Date:	09/27/2019
	Version:	1.3
	Description:	Prints an electricity bill from an input kWh used
	Problems:	I wanted to make it use the current date and that was a lot more difficult than I expected
						I couldn't get all the numbers to line up the way I wanted them to
		Solutions:	I looked up how someone else did it and then changed it to fit what I needed
								I looked up a formatting guide and left-justified them
	What I Learned:	How to format numbers
*/

//Imports formatting and scanner functions
import java.text.*;
import java.util.*;
import java.io.*;

public class Mod4LightsMM {
	public static void main(String[] args) {

		// Defines cost and percent constants
		final double E_COST = .0425;
		final double SURCHARGE_P = .1;
		final double CITY_TAX_P = .03;
		final double LATE_PENALTY_P = 1.04;

		// Creates kwhUsed as a scanner
		Scanner kwhUsed = new Scanner(System.in);
		// Asks for kwh used
		System.out.print("Enter kWh used:\t");
		// Rounds input kwh and converts back to a double
		double kwh = (double) Math.round(kwhUsed.nextDouble());

		// Calculates different charges
		double baseCharge = kwh * E_COST;
		double surcharge = baseCharge * SURCHARGE_P;
		double cityTax = baseCharge * CITY_TAX_P;
		double totalCharge = baseCharge + surcharge + cityTax;
		double lateCharge = totalCharge * LATE_PENALTY_P;

		// Sets date to current date and lateDate to 30 days later
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, 30);
		Date lateDate = cal.getTime();

		// Prints the bill
		System.out.println("\n\t\tAPCS Electric");
		// Prints current date
		System.out.println("\t\t" + getFormattedDate(date));

		System.out.println("--------------------------------");
		// Formats kwh to left-aligned, 5 digits, 0 decimal digits
		System.out.println("Kilowatts Used: " + String.format("%-5.0f", kwh) + " @ $ " + E_COST);

		System.out.println("--------------------------------");
		// Formats to 5 digits, 2 decimal digits
		System.out.println(String.format("Base Charge\t\t\t\t$ %6.2f", baseCharge));
		// Formats to 5 digits, 2 decimal digits
		System.out.println(String.format("Surcharge\t\t\t\t$ %6.2f", surcharge));
		// Formats to 5 digits, 2 decimal digits
		System.out.println(String.format("City Tax\t\t\t\t$ %6.2f", cityTax));
		// Formats to 5 digits, 2 decimal digits
		System.out.println(String.format("\nPay this amount\t\t\t$ %6.2f", totalCharge));
		// Formats to 5 digits, 2 decimal digits
		// Prints late date
		System.out.println(String.format("After %s Pay\t$ %6.2f", getFormattedDate(lateDate), lateCharge));

		// Closes Scanner kwhUsed
		kwhUsed.close();
	}

	// Formats date to have ordinal days
	// Can all be ignored if you don't care about using the current date
	public static String getFormattedDate(Date date) {

		// Sets date to a Calendar
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int day = cal.get(Calendar.DATE);

		// Checks if day isn't 11-19
		if (!((day > 10) && (day < 19))) {
			// Checks last digit of day
			switch (day % 10) {
			// Runs if day ends in 1
			case 1:
				// Formats to Month [day]st
				return new SimpleDateFormat("MMMM d'st'").format(date);
			// Runs if day ends in 2
			case 2:
				// Formats to Month [day]nd
				return new SimpleDateFormat("MMMM d'nd'").format(date);
			// Runs if day ends in 3
			case 3:
				// Formats to Month [day]rd
				return new SimpleDateFormat("MMMM d'rd'").format(date);
			// Runs if day ends in 0 or 4-9
			default:
				// Formats to Month [day]th
				return new SimpleDateFormat("MMMM d'th'").format(date);
			}
		} else {
			// Runs if day is 11-19
			// Formats to Month [day]th
			return new SimpleDateFormat("MMMM d'th'").format(date);
		}
	}
}

/*
  Sample Output: [User Input]
		Enter kWh used: [997]

						APCS Electric
						September 27th
		--------------------------------
		Kilowatts Used: 997   @ $ 0.0425
		--------------------------------
		Base Charge             $  42.37
		Surcharge               $   4.24
		City Tax                $   1.27

		Pay this amount         $  47.88
		After October 27th Pay  $  49.80
*/