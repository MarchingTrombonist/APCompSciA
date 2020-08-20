/*
	Program Name:	Mod9AddressMM
	Author: Mac Mai
	Date:	01/23/2020
	Version:	1.3
	Description:	Takes address and prints
	Problems:	Couldn't get a regex to work for the city
		Solutions:	Looped concatenating until it ended in a ','
	What I Learned:	How to use input and classes
*/

import java.util.*;
import java.io.*;

public class Mod9AddressMM {
	public static void main(String[] args) {
		// Creates scanner
		Scanner input = new Scanner(System.in);

		// Vars (All strings so I can use regex)
		String street;
		String city;
		String state;
		String zip;

		// Creates new Address
		Address address1 = new Address();

		System.out.println("Enter an address with a street number or post office box number, city, state, and zip.\n");

		// Takes first line as street
		street = input.nextLine();

		// Takes everything before the comma as the city (I couldn't get it to work as a
		// regex)
		// Loops next() until it ends in a comma
		city = input.next();
		while (city.charAt(city.length() - 1) != ',') {
			city += " " + input.next();
		}
		city = city.substring(0, city.length() - 1);

		// Takes the next set of characters as the state
		state = input.next();

		// Takes the next set of characters as the zip
		zip = input.next();

		// Checks if state is 2 letters using regex
		// If not, asks again
		while (!(state.matches("[a-zA-Z]{2}"))) {
			System.out.println("Please enter your state as its 2 letter abbreviation. e.g.(NC, NY, WV)");
			state = input.next();
		}

		// Checks if zip is 5 digits using regex
		// If not, asks again
		while (!(zip.matches("\\d{5}"))) {
			System.out.println("Please enter your zip code as a 5 digit number.");
			zip = input.next();
		}

		// Sets all address vars
		address1.setStreet(street);
		address1.setCity(city);
		address1.setState(state);
		address1.setZip(zip);

		// Prints both formats
		System.out.println();
		System.out.println(address1.getStreet());
		System.out.print(address1.getCity() + ", ");
		System.out.print(address1.getState() + " ");
		System.out.println(address1.getZip());

		System.out.println();
		System.out.println(address1.getStreet());
		System.out.println(address1.getCity());
		System.out.println(address1.getState());
		System.out.println(address1.getZip());

	}
}

/*
	Sample Output: [User Input]
		Enter an address with a street number or post office box number, city, state, and zip.

		[123 Fake Avenue]
		[Even Very Long City Names Work, notAValidState 1]
		Please enter your state as its 2 letter abbreviation. e.g.(NC,NY, WV)
		[ok]
		Please enter your zip code as a 5 digit number.
		[31415]

		123 Fake Avenue
		Even Very Long City Names Work
		OK
		31415

	Sample Output: [User Input]
		Enter an address with a street number or post office box number, city, state, and zip.
		
		[17 Gauss Way]
		[Berkeley, CA 94720]

		17 Gauss Way
		Berkeley
		CA
		94720
*/