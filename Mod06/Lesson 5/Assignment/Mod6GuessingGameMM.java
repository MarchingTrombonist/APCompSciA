/*
	Program Name:	Mod6GuessingGameMM
	Author: Mac Mai
	Date:	11/12/2019
	Version:	1.2
	Description:	Guessing game
	Problems:	The loop kept checking in the wrong place
		Solutions:	I made it break; and run while(true)
	What I Learned:	How to use do-while loops
*/

//Imports
import java.util.*;
import java.io.*;

public class Mod6GuessingGameMM {
	public static void main(String[] args) {
		// Creates scanner
		Scanner getGuess = new Scanner(System.in);
		// Creates rand as a random number
		Random rndm = new Random();
		// Creates random number
		int rand = 1 + rndm.nextInt(100);
		double cost = 2.00;
		// Asks for input
		System.out.println("Guess the number I chose 1-100");
		// Gets input
		System.out.print("Payout is $" + cost + ". Your guess is ");
		int guess = getGuess.nextInt();
		// Loops asking for a guess until you get it right
		do {
			// If correct, prints with correct number and cost and then breaks
			if (guess == rand) {
				System.out.println("Congratulations. Computer’s number is " + rand + ". This guess cost you $" + (2.0 - cost));
				break;
				// If too low
			} else if (guess < rand) {
				System.out.println("Guess higher");
				// If too high
			} else if (guess > rand) {
				System.out.println("Guess lower");
			}
			// Increments cost, prints current payout, and gets next guess
			cost -= .25;
			System.out.print("Payout is $" + cost + ". Your guess is ");
			guess = getGuess.nextInt();
		} while (true);

		getGuess.close();
	}
}

/*
	Sample Output: [User Input]
		Guess the number I chose 1-100
		Payout is $2.0. Your guess is [50]
		Guess lower
		Payout is $1.75. Your guess is [25]
		Guess higher
		Payout is $1.5. Your guess is [37]
		Guess lower
		Payout is $1.25. Your guess is [31]
		Guess higher
		Payout is $1.0. Your guess is [34]
		Congratulations. Computer’s number is 34. This guess cost you $1.0
*/