/*
	Program Name:	Mod10SpaceWeightMM
	Author: Mac Mai
	Date:	02/12/2020
	Version:	1.1
	Description:	Calculates weight on other planets
	Problems:	No problems
		Solutions:	N/A
	What I Learned:	How to use arrays
*/

//Imports
import java.io.*;
import java.util.*;

public class Mod10SpaceWeightMM {
	public static void main(String[] args) {
		// Creates scanner
		Scanner input = new Scanner(System.in);

		/*
			[0] Mercury: .38
			[1] Venus: .91
			[2] Earth: 1.0
			[3] Mars: .38
			[4] Jupiter: 2.36
			[5] Saturn: .91
			[6] Neptune: 1.12
			[7] Uranus: .89
			[8] Pluto: .06
		*/

		// Arrays
		double[] ratios = { .38, .91, 1.0, .38, 2.36, .91, 1.12, .89, .06 };
		String[] planets = { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Neptune", "Uranus", "Pluto" };

		// Base cases
		double weight = 0;
		int destination = 2;

		// Loops until quit
		while (true) {
			// Prints start
			System.out.println("Convert your weight on Earth to: ");
			for (int i = 0; i < 9; i++) {
				System.out.println("[" + i + "] " + planets[i]);
			}

			// Gets destination
			System.out.println("Select a destination by number or 9 to quit.");
			System.out.print("Destination: ");

			destination = input.nextInt();

			// Quits
			if (destination == 9) {
				System.exit(0);
			}

			// Loops reasking until valid input
			while ((destination < 0) || (destination > 8)) {
				System.out.print("Invalid Destination\nPlease select another destination: ");
				destination = input.nextInt();
			}

			// Gets weight
			System.out.print("Enter your weight: ");

			weight = input.nextDouble();

			// Loops reasking until valid input
			while (weight < 0) {
				System.out.print("Weight cannot be negative\nPlease enter your weight: ");
				weight = input.nextDouble();
			}

			// Prints
			System.out.println("\nYour weight on " + planets[destination] + " would be " + (weight * ratios[destination]) + "\n\n");
		}
	}
}

/*
	Sample Output: [User Input]
		Convert your weight on Earth to:
		[0] Mercury
		[1] Venus
		[2] Earth
		[3] Mars
		[4] Jupiter
		[5] Saturn
		[6] Neptune
		[7] Uranus
		[8] Pluto
		Select a destination by number or 9 to quit.
		Destination: [0]
		Enter your weight: [100]

		Your weight on Mercury would be 38.0


		Convert your weight on Earth to:
		[0] Mercury
		[1] Venus
		[2] Earth
		[3] Mars
		[4] Jupiter
		[5] Saturn
		[6] Neptune
		[7] Uranus
		[8] Pluto
		Select a destination by number or 9 to quit.
		Destination: [1]
		Enter your weight: [73]

		Your weight on Venus would be 66.43


		Convert your weight on Earth to:
		[0] Mercury
		[1] Venus
		[2] Earth
		[3] Mars
		[4] Jupiter
		[5] Saturn
		[6] Neptune
		[7] Uranus
		[8] Pluto
		Select a destination by number or 9 to quit.
		Destination: [2]
		Enter your weight: [134.7492]

		Your weight on Earth would be 134.7492


		Convert your weight on Earth to:
		[0] Mercury
		[1] Venus
		[2] Earth
		[3] Mars
		[4] Jupiter
		[5] Saturn
		[6] Neptune
		[7] Uranus
		[8] Pluto
		Select a destination by number or 9 to quit.
		Destination: [4]
		Enter your weight: [103.4782]

		Your weight on Jupiter would be 244.208552


		Convert your weight on Earth to:
		[0] Mercury
		[1] Venus
		[2] Earth
		[3] Mars
		[4] Jupiter
		[5] Saturn
		[6] Neptune
		[7] Uranus
		[8] Pluto
		Select a destination by number or 9 to quit.
		Destination: [10]
		Invalid Destination
		Please select another destination: [8]
		Enter your weight: [-20]
		Weight cannot be negative
		Please enter your weight: [20]

		Your weight on Pluto would be 1.2


		Convert your weight on Earth to:
		[0] Mercury
		[1] Venus
		[2] Earth
		[3] Mars
		[4] Jupiter
		[5] Saturn
		[6] Neptune
		[7] Uranus
		[8] Pluto
		Select a destination by number or 9 to quit.
		Destination: [9]
*/