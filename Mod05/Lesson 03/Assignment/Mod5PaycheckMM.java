/*
	Program Name:	Mod5PaycheckMM
	Author: Mac Mai
	Date:	10/08/2019
	Version:	1.2
	Description:	Outputs paycheck from hours and hourly wage
	Problems:	I missed a '%' in the printf
		Solutions:	I added it in
	What I Learned:	How to use inputs with else ifs
*/

//Imports
import java.util.*;
import java.io.*;

public class Mod5PaycheckMM {
	public static void main(String[] args) {
		// Creates scanner
		Scanner input = new Scanner(System.in);
		// Gets hours worked and hourly pay
		System.out.print("Enter hours worked: ");
		double hours = input.nextDouble();
		System.out.print("Enter hourly pay: ");
		double rate = input.nextDouble();
		double hoursOT;
		// If more than 40 hours worked, the rest is overtime
		if (40 < hours) {
			hoursOT = hours - 40;
			hours = 40;
		} else {
			hoursOT = 0;
		}
		// Calculates hours and pay
		double totalHours = hours + hoursOT;
		double regularPay = hours * rate;
		double payOT = hoursOT * rate * 1.5;
		double totalPay = regularPay + payOT;
		// Prints statement
		System.out.printf(
				"%nHours worked%nRegular hours = %.2f%nOvertime hours = %.2f%nTotal hours = %.2f%n%nRegular pay = %.2f%nOvertime pay = %.2f%nGross pay = %.2f",
				hours, hoursOT, totalHours, regularPay, payOT, totalPay);

		// Closes scanner
		input.close();
	}
}

/*
	Sample Output: [User Input]
		Enter hours worked: [48.25]
		Enter hourly pay: [9.63]

		Hours worked
		Regular hours = 40.00
		Overtime hours = 8.25
		Total hours = 48.25

		Regular pay = 385.20
		Overtime pay = 119.17
		Gross pay = 504.37
*/