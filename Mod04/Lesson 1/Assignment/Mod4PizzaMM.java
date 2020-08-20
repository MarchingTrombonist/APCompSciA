/*
	Program Name:	Mod4PizzaMM
	Author:	Mac Mai
	Date:	09/25/2019
	Version:	1.2
	Description:	Takes user input to order a pizza
	Problems:	I kept getting errors with nextLine() vs. next()
		Solutions:	I changed all the inputs to nextLine()
	What I Learned:	When to use next() and nextLine()
*/

//Imports scanner functions
import java.io.*;
import java.util.*;

public class Mod4PizzaMM {
	public static void main(String[] args) {
		// Creates takeOrder as a scanner
		Scanner takeOrder = new Scanner(System.in);
		// Asks for + takes crust input
		System.out.print("Enter the type of crust (thin, hand tossed, deep dish):\n");
		String crust = takeOrder.nextLine();
		// Asks for + takes topping inputs
		System.out.print("Enter topping 1:\n");
		String t1 = takeOrder.nextLine();
		System.out.print("Enter topping 2:\n");
		String t2 = takeOrder.nextLine();
		System.out.print("Enter topping 3:\n");
		String t3 = takeOrder.nextLine();
		// Prints the ordered pizza
		System.out.println("You have ordered a " + crust + " crust pizza with " + t1 + ", " + t2 + ", and " + t3 + ". Enjoy!");

		// Closes takeOrder
		takeOrder.close();
	}
}

/*
	Sample Output: [User Input]
		Enter the type of crust (thin, hand tossed, deep dish):
		[hand tossed]
		Enter topping 1:
		[pineapple]
		Enter topping 2:
		[green peppers]
		Enter topping 3:
		[thinly sliced italian sausage]
		You have ordered a hand tossed crust pizza with pineapple, green peppers, and thinly sliced italian sausage. Enjoy!
*/