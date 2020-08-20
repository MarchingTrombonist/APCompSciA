/*
	Program Name:	Mod5QuantityMM
	Author: Mac Mai
	Date:	10/22/2019
	Version:	1.2
	Description:	Takes three input quantities and returns price and unit price
	Problems:	No problems
		Solutions:	N/A
	What I Learned:	How to use switch statements
*/

//Imports
import java.util.*;
import java.io.*;

public class Mod5QuantityMM {
	public static void main(String[] args) {
		// Creates scanner
		Scanner quantityIn = new Scanner(System.in);
		int
		// Starting vars
		quantity = 0;
		double price = 0;
		double totalCost = 0;
		// Prints and gets quantity
		System.out.print("Enter quantity: ");
		quantity = quantityIn.nextInt();
		// Switches price based on quantity; unit price changes every 20, so /20
		switch (quantity / 20) {
		case 0:
			price = 1.29;
			break;
		case 1:
			price = 1.19;
			break;
		case 2:
			price = 1.09;
			break;
		default:
			price = .99;
			break;
		}
		// Finds total cost
		totalCost = price * quantity;
		// Prints
		System.out.printf("Price = $%.2f%nAmount due = $%.2f%n%n", price, totalCost);
		// Closes scanner
		quantityIn.close();
	}
}

/*
	Sample Output: [User Input]
		Enter quantity: [50]
		Price = $1.09
		Amount due = $54.50

	Sample Output: [User Input]
		Enter quantity: [2]
		Price = $1.29
		Amount due = $2.58

	Sample Output: [User Input]
		Enter quantity: [200]
		Price = $0.99
		Amount due = $198.00
*/