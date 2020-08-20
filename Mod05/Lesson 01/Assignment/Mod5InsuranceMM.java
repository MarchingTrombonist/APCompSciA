/*
	Program Name:	Mod5InsuranceMM
	Author: Mac Mai
	Date:	10/03/2019
	Version:	1.1
	Description: Outputs insurance cost based on age	
	Problems:	Nothing happened when the age was < 16
		Solutions:	I added a String to output at the end that thanks you and tells you that < 16 isn't old enough to drive
	What I Learned:	How to use if statements to output data
*/

import java.util.*;

public class Mod5InsuranceMM {
	public static void main(String[] args) {
		// Creates ageIn as a scanner
		Scanner ageIn = new Scanner(System.in);
		System.out.print("Enter age of driver: ");
		// Creates ints and strings
		// Gets age as an input
		int age = ageIn.nextInt();
		int insuranceCost = 0;
		String moreInfo = "Thank you for using APCS Insurance!";
		// Tests age
		if ((16 <= age) && (age < 18)) {
			// Sets outputs
			insuranceCost = age * 88;
			// Tests age
		} else if ((18 <= age) && (age < 25)) {
			// Sets outputs
			insuranceCost = age * 72;
			// Tests age
		} else if (25 <= age) {
			// Sets outputs
			insuranceCost = 500;
		} else {
			// Sets outputs
			moreInfo = "Not old enough to drive\n" + moreInfo;
		}
		// Prints
		System.out.println("Driver age = " + age + "\nInsurance cost = $" + insuranceCost + "\n" + moreInfo);

		// Closes ageIn
		ageIn.close();
	}
}

/*
	Sample Output: [User Input]
		Enter age of driver: [15]
		Driver age = 15
		Insurance cost = $0
		Not old enough to drive
		Thank you for using APCS Insurance!
		
	Sample Output: [User Input]
		Enter age of driver: [16]
		Driver age = 16
		Insurance cost = $1408
		Thank you for using APCS Insurance!
		
	Sample Output: [User Input]
		Enter age of driver: [18]
		Driver age = 18
		Insurance cost = $1296
		Thank you for using APCS Insurance!
		
	Sample Output: [User Input]
		Enter age of driver: [25]
		Driver age = 25
		Insurance cost = $500
		Thank you for using APCS Insurance!
*/