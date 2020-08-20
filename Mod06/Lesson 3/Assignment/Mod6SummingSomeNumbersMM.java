/*
	Program Name:	Mod6SummingSomeNumbersMM
	Author: Mac Mai
	Date:	11/05/2019
	Version:	1.3
	Description:	Sums numbers in a range and gives sum + average
	Problems:	Some things didn't add enought times
		Solutions:	I put them before the loop once
	What I Learned:	How to use do while loops
*/

//Imports
import java.util.*;
import java.io.*;

public class Mod6SummingSomeNumbersMM {
	public static void main(String[] args) {
		// Scanner
		Scanner input = new Scanner(System.in);
		// Gets inputs
		System.out.print("Enter Starting Value: ");
		int start = input.nextInt();
		System.out.print("\nEnter Ending Value: ");
		int stop = input.nextInt();
		// Sets vars
		double count = 1;
		int sum = 0;
		double average = 0;
		// Runs once before the loop
		int test = start;
		sum += test;

		System.out.println("\n\n" + test);
		// Loops printing nums and adding to the sum until the end number is reached
		do {
			test++;
			sum += test;
			count++;
			System.out.println(test);
		} while (test < stop);
		// Prints and calculates average
		System.out.println("Sum of the numbers " + start + "..." + stop + " is " + sum);
		average = sum / count;
		System.out.println("The average of the numbers " + start + "..." + stop + " is " + average);

		input.close();
	}
}

/*
	Sample Output: [User Input]
		Enter Starting Value: [22]

		Enter Ending Value: [25]


		22
		23
		24
		25
		Sum of the numbers 22...25 is 94
		The average of the numbers 22...25 is 23.5

		Enter Starting Value: [1]

		Enter Ending Value: [6]


		1
		2
		3
		4
		5
		6
		Sum of the numbers 1...6 is 21
		The average of the numbers 1...6 is 3.5

		Enter Starting Value: [17]

		Enter Ending Value: [20]


		17
		18
		19
		20
		Sum of the numbers 17...20 is 74
		The average of the numbers 17...20 is 18.5

		Enter Starting Value: [99]

		Enter Ending Value: [105]


		99
		100
		101
		102
		103
		104
		105
		Sum of the numbers 99...105 is 714
		The average of the numbers 99...105 is 102.0

		Enter Starting Value: [57]

		Enter Ending Value: [70]


		57
		58
		59
		60
		61
		62
		63
		64
		65
		66
		67
		68
		69
		70
		Sum of the numbers 57...70 is 889
		The average of the numbers 57...70 is 63.5
*/