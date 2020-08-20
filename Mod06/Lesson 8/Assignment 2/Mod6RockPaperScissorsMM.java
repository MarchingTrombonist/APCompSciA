/*
	Program Name:	Mod6RockPaperScissorsMM
	Author: Mac Mai
	Date:	11/18/2019
	Version:	1.3
	Description:	Plays rps
	Problems:	Testing who wins without hardcoding all 9 possibilities
		Solutions:	I figured out how to test it with modulo
	What I Learned:	How to test and use loops
*/

//Imports
import java.util.*;
import java.io.*;

public class Mod6RockPaperScissorsMM {
	public static void main(String[] args) {
		// Creates a random and scanner
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		// Creates a boolean to test for replay
		boolean replay = true;
		// Loops until the user says to quit playing
		do {
			// Prints key
			System.out.println("0 = Rock\n1 = Paper\n2 = Scissors\n");
			// Generates compChoice and gets userChoice
			int compChoice = rand.nextInt(3);
			System.out.print("Enter your choice: ");
			int userChoice = input.nextInt();

			// Turns the int choices into items as strings
			String compItem = itemChosen(compChoice);
			String userItem = itemChosen(userChoice);

			// Not needed, but waits for dramatic effect
			System.out.print("\nComputer is choosing");
			try {
				for (int i = 1; i <= 3; i++) {
					Thread.sleep(500);
					System.out.print(".");
				}
			} catch (Exception e) {
			}

			// Prints choices
			System.out.println("\n\nComputer chose: " + compItem);
			System.out.println("You chose: " + userItem + "\n");

			// Tests how much greater the compChoice is than the userChoice to decide who
			// wins
			// Without + 3, you get negatives
			switch ((compChoice - userChoice + 3) % 3) {
			// If the difference is 0, it's a tie
			case 0:
				System.out.println("You tie");
				break;

			// If the compChoice is 1 greater than the userChoice, then you lose
			case 1:
				System.out.println("You lose");
				break;

			// If the compChoice is 2 greater (1 less) than the userChoice, then you win
			case 2:
				System.out.println("You win");
				break;

			// Catches any errors with negatives
			default:
				System.out.println("ERROR\nPlease enter a valid choice");
				break;
			}

			// Asks if play again
			System.out.print("\nPlay again? y/n\n");
			// If the next char is n, then it won't loop
			if (input.next().charAt(0) == 'n') {
				replay = false;
				System.out.print("Thanks for playing");
			} else {
				System.out.println();
			}
			// Loops if replay is true
		} while (replay);

		input.close();
	}

	// Takes int choice and returns string item
	public static String itemChosen(int choice) {
		String item;
		// Switches based on int choice
		switch (choice) {
		case 0:
			item = "Rock";
			return item;

		case 1:
			item = "Paper";
			return item;

		case 2:
			item = "Scissors";
			return item;

		// If invalid value, prints and quits
		default:
			item = "INVALID CHOICE";
			System.out.println(item);
			System.exit(0);
			return item;
		}
	}
}

/*
	Sample Output: [User Input]
		0 = Rock
		1 = Paper
		2 = Scissors

		Enter your choice: [0]

		Computer is choosing...

		Computer chose: Rock
		You chose: Rock

		You tie

		Play again? y/n
		[y]

		0 = Rock
		1 = Paper
		2 = Scissors

		Enter your choice: [1]

		Computer is choosing...

		Computer chose: Scissors
		You chose: Paper

		You lose

		Play again? y/n
		[y]

		0 = Rock
		1 = Paper
		2 = Scissors

		Enter your choice: [2]

		Computer is choosing...

		Computer chose: Paper
		You chose: Scissors

		You win

		Play again? y/n
		[n]
		Thanks for playing
*/