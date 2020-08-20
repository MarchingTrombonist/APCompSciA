/*
	Program Name:	Mod9MoviesMM
	Author: Mac Mai
	Date:	01/23/2020
	Version:	1.5
	Description:	Reads and prints movies from a data file
	Problems:	Reading/printing takes ~16 lines for each movie and it's hard to read
		Solutions:	Indent it a line so I can collapse it
	What I Learned:	How to use data files and classes
*/

import java.io.*;
import java.util.*;

public class Mod9MoviesMM {
	public static void main(String[] args) {
		// Creates scanner
		Scanner inFile = null;
		// Catches errors
		try {
			// Reads file
			inFile = new Scanner(new File("Lesson 4/Assignment 3/Movies.dat"));

			// Lets the scanner skip a line
			String lineBreak;
			// Movies
			// Creates 10 Movies
			Movie movie1 = new Movie();
			Movie movie2 = new Movie();
			Movie movie3 = new Movie();
			Movie movie4 = new Movie();
			Movie movie5 = new Movie();
			Movie movie6 = new Movie();
			Movie movie7 = new Movie();
			Movie movie8 = new Movie();
			Movie movie9 = new Movie();
			Movie movie10 = new Movie();

			// Movie read/write
			// FOR ALL MOVIES:
			// Sets each value
			// Prints each value
			// Increments the scanner by a line

			// Movie 1
			movie1.setTitle(inFile.nextLine());
			movie1.setGenre(inFile.nextLine());
			movie1.setRating(inFile.nextDouble());
			movie1.setPricePaid(inFile.nextDouble());
			movie1.setRentPrice(inFile.nextDouble());

			System.out.println("Movie: " + movie1.getTitle());
			System.out.println("Genre: " + movie1.getGenre());
			System.out.println("Rating: " + movie1.getRating() + "/10");
			System.out.println("Cost of movie: $" + movie1.getPricePaid());
			System.out.println("Rental price: $" + movie1.getRentPrice() + "\n");

			lineBreak = inFile.nextLine();
			lineBreak = inFile.nextLine();

			// Movie 2
			movie2.setTitle(inFile.nextLine());
			movie2.setGenre(inFile.nextLine());
			movie2.setRating(inFile.nextDouble());
			movie2.setPricePaid(inFile.nextDouble());
			movie2.setRentPrice(inFile.nextDouble());

			System.out.println("Movie: " + movie2.getTitle());
			System.out.println("Genre: " + movie2.getGenre());
			System.out.println("Rating: " + movie2.getRating() + "/10");
			System.out.println("Cost of movie: $" + movie2.getPricePaid());
			System.out.println("Rental price: $" + movie2.getRentPrice() + "\n");

			lineBreak = inFile.nextLine();
			lineBreak = inFile.nextLine();

			// Movie 3
			movie3.setTitle(inFile.nextLine());
			movie3.setGenre(inFile.nextLine());
			movie3.setRating(inFile.nextDouble());
			movie3.setPricePaid(inFile.nextDouble());
			movie3.setRentPrice(inFile.nextDouble());

			System.out.println("Movie: " + movie3.getTitle());
			System.out.println("Genre: " + movie3.getGenre());
			System.out.println("Rating: " + movie3.getRating() + "/10");
			System.out.println("Cost of movie: $" + movie3.getPricePaid());
			System.out.println("Rental price: $" + movie3.getRentPrice() + "\n");

			lineBreak = inFile.nextLine();
			lineBreak = inFile.nextLine();

			// Movie 4
			movie4.setTitle(inFile.nextLine());
			movie4.setGenre(inFile.nextLine());
			movie4.setRating(inFile.nextDouble());
			movie4.setPricePaid(inFile.nextDouble());
			movie4.setRentPrice(inFile.nextDouble());

			System.out.println("Movie: " + movie4.getTitle());
			System.out.println("Genre: " + movie4.getGenre());
			System.out.println("Rating: " + movie4.getRating() + "/10");
			System.out.println("Cost of movie: $" + movie4.getPricePaid());
			System.out.println("Rental price: $" + movie4.getRentPrice() + "\n");

			lineBreak = inFile.nextLine();
			lineBreak = inFile.nextLine();

			// Movie 5
			movie5.setTitle(inFile.nextLine());
			movie5.setGenre(inFile.nextLine());
			movie5.setRating(inFile.nextDouble());
			movie5.setPricePaid(inFile.nextDouble());
			movie5.setRentPrice(inFile.nextDouble());

			System.out.println("Movie: " + movie5.getTitle());
			System.out.println("Genre: " + movie5.getGenre());
			System.out.println("Rating: " + movie5.getRating() + "/10");
			System.out.println("Cost of movie: $" + movie5.getPricePaid());
			System.out.println("Rental price: $" + movie5.getRentPrice() + "\n");

			lineBreak = inFile.nextLine();
			lineBreak = inFile.nextLine();

			// Movie 6
			movie6.setTitle(inFile.nextLine());
			movie6.setGenre(inFile.nextLine());
			movie6.setRating(inFile.nextDouble());
			movie6.setPricePaid(inFile.nextDouble());
			movie6.setRentPrice(inFile.nextDouble());

			System.out.println("Movie: " + movie6.getTitle());
			System.out.println("Genre: " + movie6.getGenre());
			System.out.println("Rating: " + movie6.getRating() + "/10");
			System.out.println("Cost of movie: $" + movie6.getPricePaid());
			System.out.println("Rental price: $" + movie6.getRentPrice() + "\n");

			lineBreak = inFile.nextLine();
			lineBreak = inFile.nextLine();

			// Movie 7
			movie7.setTitle(inFile.nextLine());
			movie7.setGenre(inFile.nextLine());
			movie7.setRating(inFile.nextDouble());
			movie7.setPricePaid(inFile.nextDouble());
			movie7.setRentPrice(inFile.nextDouble());

			System.out.println("Movie: " + movie7.getTitle());
			System.out.println("Genre: " + movie7.getGenre());
			System.out.println("Rating: " + movie7.getRating() + "/10");
			System.out.println("Cost of movie: $" + movie7.getPricePaid());
			System.out.println("Rental price: $" + movie7.getRentPrice() + "\n");

			lineBreak = inFile.nextLine();
			lineBreak = inFile.nextLine();

			// Movie 8
			movie8.setTitle(inFile.nextLine());
			movie8.setGenre(inFile.nextLine());
			movie8.setRating(inFile.nextDouble());
			movie8.setPricePaid(inFile.nextDouble());
			movie8.setRentPrice(inFile.nextDouble());

			System.out.println("Movie: " + movie8.getTitle());
			System.out.println("Genre: " + movie8.getGenre());
			System.out.println("Rating: " + movie8.getRating() + "/10");
			System.out.println("Cost of movie: $" + movie8.getPricePaid());
			System.out.println("Rental price: $" + movie8.getRentPrice() + "\n");

			lineBreak = inFile.nextLine();
			lineBreak = inFile.nextLine();

			// Movie 9
			movie9.setTitle(inFile.nextLine());
			movie9.setGenre(inFile.nextLine());
			movie9.setRating(inFile.nextDouble());
			movie9.setPricePaid(inFile.nextDouble());
			movie9.setRentPrice(inFile.nextDouble());

			System.out.println("Movie: " + movie9.getTitle());
			System.out.println("Genre: " + movie9.getGenre());
			System.out.println("Rating: " + movie9.getRating() + "/10");
			System.out.println("Cost of movie: $" + movie9.getPricePaid());
			System.out.println("Rental price: $" + movie9.getRentPrice() + "\n");

			lineBreak = inFile.nextLine();
			lineBreak = inFile.nextLine();

			// Movie 10
			movie10.setTitle(inFile.nextLine());
			movie10.setGenre(inFile.nextLine());
			movie10.setRating(inFile.nextDouble());
			movie10.setPricePaid(inFile.nextDouble());
			movie10.setRentPrice(inFile.nextDouble());

			System.out.println("Movie: " + movie10.getTitle());
			System.out.println("Genre: " + movie10.getGenre());
			System.out.println("Rating: " + movie10.getRating() + "/10");
			System.out.println("Cost of movie: $" + movie10.getPricePaid());
			System.out.println("Rental price: $" + movie10.getRentPrice() + "\n");

			lineBreak = inFile.nextLine();
			lineBreak = inFile.nextLine();

			// Catches file not found
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
	}
}

/*
	Sample Output: [User Input]
		Movie: title1
		Genre: genre1
		Rating: 1.0/10
		Cost of movie: $2.0
		Rental price: $1.0

		Movie: title2
		Genre: genre2
		Rating: 2.0/10
		Cost of movie: $4.0
		Rental price: $2.0

		Movie: title3
		Genre: genre3
		Rating: 3.0/10
		Cost of movie: $6.0
		Rental price: $3.0

		Movie: title4
		Genre: genre4
		Rating: 4.0/10
		Cost of movie: $8.0
		Rental price: $4.0

		Movie: title5
		Genre: genre5
		Rating: 5.0/10
		Cost of movie: $10.0
		Rental price: $5.0

		Movie: title6
		Genre: genre6
		Rating: 6.0/10
		Cost of movie: $12.0
		Rental price: $6.0

		Movie: title7
		Genre: genre7
		Rating: 7.0/10
		Cost of movie: $14.0
		Rental price: $7.0

		Movie: title8
		Genre: genre8
		Rating: 8.0/10
		Cost of movie: $16.0
		Rental price: $8.0

		Movie: title9
		Genre: genre9
		Rating: 9.0/10
		Cost of movie: $18.0
		Rental price: $9.0

		Movie: title10
		Genre: genre10
		Rating: 10.0/10
		Cost of movie: $20.0
		Rental price: $10.0
*/