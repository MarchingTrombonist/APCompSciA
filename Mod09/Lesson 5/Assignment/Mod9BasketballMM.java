/*
	Program Name:	Mod9BasketballMM
	Author: Mac Mai
	Date:	01/28/2020
	Version:	1.2
	Description:	Plays basketball
	Problems:	Formatting
		Solutions:	Added a \n
	What I Learned:	How to use methods
*/

import java.io.*;
import java.util.*;

public class Mod9BasketballMM {
	public static void main(String[] args) {
		// Creates new game
		Basketball game1 = new Basketball();

		// Creates scanner
		Scanner input = new Scanner(System.in);

		// Gets team names and max score
		System.out.print("Enter name of team 1: ");
		game1.setName1(input.nextLine());
		System.out.print("Enter name of team 2: ");
		game1.setName2(input.nextLine());
		System.out.print("Enter max score: ");
		game1.setMaxScore(input.nextInt());

		// Loops until the game is done
		while (!(game1.getGameDone())) {
			// Prints
			System.out.println("\nRandom # for " + game1.getName1() + ": " + game1.scorePoints1() + "; for " + game1.getName2() + ": " + game1.scorePoints2());

			System.out.println(game1.getName1() + " " + game1.getPoints1() + ", " + game1.getName2() + " " + game1.getPoints2() + "; " + game1.gameStatus());
		}
	}
}

/*
	Sample Output: [User Input]
		Enter name of team 1: [Shirts]
		Enter name of team 2: [Skins]
		Enter max score: [17]

		Random # for Shirts: 3; for Skins: 3
		Shirts 3, Skins 3; Teams are tied.

		Random # for Shirts: 1; for Skins: 2
		Shirts 4, Skins 5; Skins is winning.

		Random # for Shirts: 3; for Skins: 2
		Shirts 7, Skins 7; Teams are tied.

		Random # for Shirts: 1; for Skins: 3
		Shirts 8, Skins 10; Skins is winning.

		Random # for Shirts: 3; for Skins: 1
		Shirts 11, Skins 11; Teams are tied.

		Random # for Shirts: 2; for Skins: 1
		Shirts 13, Skins 12; Shirts is winning.

		Random # for Shirts: 1; for Skins: 2
		Shirts 14, Skins 14; Teams are tied.

		Random # for Shirts: 3; for Skins: 1
		Shirts 17, Skins 15; Shirts is the winner.
*/