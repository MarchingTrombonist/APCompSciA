/*
	Program Name:	Mod8ConcertMM
	Author: Mac Mai
	Date:	12/12/2019
	Version:	1.2
	Description:	Calculates stats about concert tickets
	Problems:	Wasn't calculating everything in the methods
		Solutions:	Made lostRevenue() take more inputs and use arrays to sort
	What I Learned:	How to write methods
*/

//Imports
import java.io.*;
import java.util.*;

public class Mod8ConcertMM {
	public static void main(String[] args) {
		// Creates scanner
		Scanner input = new Scanner(System.in);

		// Takes all required inputs

		// Capacity
		System.out.print("What is the capacity of the venue: ");
		double capacity = input.nextDouble();

		// Phone price
		System.out.print("What is the price per ticket sold by phone: $");
		double phPrice = input.nextDouble();

		// Phone tickets sold
		System.out.print("What is the number of phone sales: ");
		double phTSold = input.nextDouble();

		// Venue price
		System.out.print("What is the price per ticket sold at venue: $");
		double vPrice = input.nextDouble();

		// Venue tickets sold
		System.out.print("What is the number of venue sales: ");
		double vTSold = input.nextDouble();

		// Tickets to sell
		System.out.print("What is the number of tickets to sell: ");
		double toSell = input.nextDouble();

		// Sends values to methods and prints

		// Percent capacity usage
		double pCapUsage = pCapUsage(capacity, toSell);
		System.out.println("\nPercent capacity usage is " + pCapUsage + " or " + 100 * pCapUsage + "%");

		// Phone sales
		double phSales = sales(phPrice, phTSold);
		System.out.println("Phone sales: $" + phSales);

		// Venue sales
		double vSales = sales(vPrice, vTSold);
		System.out.println("Venue sales: $" + vSales);

		// Total sales
		double tSales = totalSales(phSales, vSales);
		System.out.println("Total sales: $" + tSales);

		// Lost revenue
		double lostRevenue = lostSales(phPrice, vPrice, phTSold, vTSold, toSell);
		System.out.println("Lost revenue based on lowest priced ticket: $" + lostRevenue);

		input.close();
	}

	// Methods for calculating values

	// Percent capacity usage
	public static double pCapUsage(double capacity, double toSell) {
		return toSell / capacity;
	}

	// Sales
	public static double sales(double price, double sold) {
		return price * sold;
	}

	// Total sales
	public static double totalSales(double phSales, double vSales) {
		return phSales + vSales;
	}

	// Lost sales
	public static double lostSales(double phPrice, double vPrice, double phTSold, double vTSold, double toSell) {
		// Creates array for prices, sorts it, takes [0] (lowest value)
		double[] prices = { phPrice, vPrice };
		Arrays.sort(prices);
		double lowestPrice = prices[0];
		// Calculates how many tickets not sold
		double notSold = toSell - (phTSold + vTSold);
		return notSold * lowestPrice;
	}
}

/*
	Sample Output: [User Input]
		What is the capacity of the venue: [100]
		What is the price per ticket sold by phone: $[15]
		What is the number of phone sales: [20]
		What is the price per ticket sold at venue: $[20]
		What is the number of venue sales: [15]
		What is the number of tickets to sell: [50]

		Percent capacity usage is 0.5 or 50.0%
		Phone sales: $300.0
		Venue sales: $300.0
		Total sales: $600.0
		Lost revenue based on lowest priced ticket: $225.0
*/