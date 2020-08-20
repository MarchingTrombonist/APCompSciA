/*
	Program Name:	Mod11BigBucksMM
	Author: Mac Mai
	Date:	03/03/2020
	Version:	1.2
	Description:	Creates bank accounts
	Problems:	next() vs nextLine()
		Solutions:	nextLine() to clear extra line after nextDouble()
	What I Learned:	How to use ArrayLists
*/

// Imports
import java.io.*;
import java.util.*;

public class Mod11BigBucksMM {
	public static void main(String[] args) {
		// Creates Scanner and List
		Scanner input = new Scanner(System.in);
		List<BankAccount> accounts = new ArrayList();
		String name = "";
		double balance = 0;

		// Loops
		boolean cont = true;
		// Label
		contLoop:
		while (cont) {
			// Gets name
			System.out.print("Enter the name ('exit' to quit): ");
			name = input.nextLine();
			// Exits
			if (name == "exit") {
				cont = false;
				// Breaks outer loop
				break contLoop;
			}
			// Gets balance
			System.out.print("Enter starting balance: ");
			balance = input.nextDouble();
			// Clears line
			input.nextLine();
			// Creates account
			accounts.add(new BankAccount(name, balance));
		}

		// Base case
		double largest = accounts.get(0).getBalance();
		String largestName = accounts.get(0).getName();
		
		// Finds largest balance
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getBalance() > largest) {
				largest = accounts.get(i).getBalance();
				largestName = accounts.get(i).getName();
			}
		}

		// Prints
		System.out.println("The largest balance belongs to " + largestName);
		System.out.println("The largest balance is " + largest);
		
	}
}

/*
	Sample Output: [User Input]
	Enter the name ('exit' to quit): [test]
	Enter starting balance: [1]
	Enter the name ('exit' to quit): [test2]
	Enter starting balance: [3]
	Enter the name ('exit' to quit): [test3]
	Enter starting balance: [2]
	Enter the name ('exit' to quit): [biggest]
	Enter starting balance: [1000]
	Enter the name ('exit' to quit): [test4]
	Enter starting balance: [4]
	Enter the name ('exit' to quit): [test5]
	Enter starting balance: [30]
	Enter the name ('exit' to quit): [exit]
	The largest balance belongs to biggest
	The largest balance is 1000.0
*/