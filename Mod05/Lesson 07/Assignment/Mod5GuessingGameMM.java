/*
	Program Name:	Mod5GuessingGameMM
	Author: Mac Mai
	Date:	10/15/2019
	Version:	1.3
	Description:	A game where you have 3 tries to guess the computer's number
	Problems:	Not enough else ifs
		Solutions:	I added more in
	What I Learned:	How to nest else ifs to have multiple tries
*/

//Imports
import java.util.*;
import java.io.*;

public class Mod5GuessingGameMM {
	public static void main(String[] args) {
		// Creates scanner
		Scanner getGuess = new Scanner(System.in);
		// Creates random number
		Random rndm = new Random();
		// Creates rand as a random number
		int rand = 1 + rndm.nextInt(10);
		// Asks for input
		System.out.println("Guess the number I chose 1-10");
		// Gets input
		int guess = getGuess.nextInt();
		// Checks multiple times for all combinations of correct/too high/too low and
		// prints what to do
		if (guess == rand) {
			System.out.println("Congratulations");
		} else if (guess < rand) {
			System.out.println("Guess higher");
			guess = getGuess.nextInt();
			if (guess == rand) {
				System.out.println("Congratulations");
			} else if (guess < rand) {
				System.out.println("Guess higher");
				guess = getGuess.nextInt();
				if (guess == rand) {
					System.out.println("Congratulations");
				} else {
					System.out.println("My number was " + rand);
				}
			} else if (guess > rand) {
				System.out.println("Guess lower");
				guess = getGuess.nextInt();
				if (guess == rand) {
					System.out.println("Congratulations");
				} else {
					System.out.println("My number was " + rand);
				}
			}
		} else if (guess > rand) {
			System.out.println("Guess lower");
			guess = getGuess.nextInt();
			if (guess == rand) {
				System.out.println("Congratulations");
			} else if (guess < rand) {
				System.out.println("Guess higher");
				guess = getGuess.nextInt();
				if (guess == rand) {
					System.out.println("Congratulations");
				} else {
					System.out.println("My number was " + rand);
				}
			} else if (guess > rand) {
				System.out.println("Guess lower");
				guess = getGuess.nextInt();
				if (guess == rand) {
					System.out.println("Congratulations");
				} else {
					System.out.println("My number was " + rand);
				}
			}
		}

		// Closes scanner
		getGuess.close();
	}
}

/*
	Sample Output: [User Input]
		Guess the number I chose 1-10
		[5]
		Guess lower
		[3]
		Guess higher
		[4]
		Congratulations
*/