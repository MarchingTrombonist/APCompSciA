/*
	Program Name:	testPatron
	Author: Mac Mai
	Date:	12/19/2019
	Version:	1.3
	Description:	Creates and prints Patrons
	Problems:	No problems
		Solutions:	N/A
	What I Learned:	How to use classes
*/

public class testPatron {
	public static void main(String[] args) {
		// Creates Books and Patrons
		Book myBook = new Book("ABC", "Lucy Wells");
		Book myBook2 = new Book("Hiking", "Go Trails");
		Patron pat1 = new Patron();
		Patron pat2 = new Patron("Harry", "Wells", "1234", myBook);

		// Sets/prints Patrons
		System.out.println("" + pat2);

		pat1.setFName("Mary");
		pat1.setLName("Suzel");
		pat1.setLibNumber("2345");
		pat1.setBook(myBook2);
		System.out.println("" + pat1);
	}
}

/*
	Sample Output: [User Input]
		The specs of this Patron are:
				First Name: Harry
				Last Name: Wells
				Library Number: 1234
				The specs of this book are:
				Title: ABC
				Author: Lucy Wells
		The specs of this Patron are:
				First Name: Mary
				Last Name: Suzel
				Library Number: 2345
				The specs of this book are:
				Title: Hiking
				Author: Go Trails
*/