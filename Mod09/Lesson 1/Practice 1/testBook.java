/*
	Program Name:	testBook
	Author: Mac Mai
	Date:	12/19/2019
	Version:	1.3
	Description:	Creates and prints Books
	Problems:	No problems
		Solutions:	N/A
	What I Learned:	How to use classes
*/

public class testBook {
	public static void main(String[] args) {
		// Creates Books
		Book myBook1 = new Book("Alice in Wonderland", "Lewis Carroll");
		Book myBook2 = new Book();
		Book myBook3 = new Book("On the Highway", "Jen Jones");
		Book myBook4 = new Book(myBook3);

		// Sets/prints Books
		System.out.println("" + myBook1);
		System.out.println("" + myBook3);
		myBook2.setTitle("Alphabet 123");
		myBook2.setAuthor("Sam Smith");
		System.out.println("" + myBook2);
		myBook3.setAuthor("Jennifer Jones");
		System.out.println("\n" + myBook3);

		System.out.print(myBook1.getAuthor() + " ");
		System.out.println(myBook1.getTitle());

		System.out.println(myBook4);
	}
}

/*
	Sample Output: [User Input]
		The specs of this book are:
				Title: Alice in Wonderland
				Author: Lewis Carroll
		The specs of this book are:
				Title: On the Highway
				Author: Jen Jones
		The specs of this book are:
				Title: Alphabet 123
				Author: Sam Smith

		The specs of this book are:
				Title: On the Highway
				Author: Jennifer Jones
		Lewis Carroll Alice in Wonderland
		The specs of this book are:
				Title: On the Highway
				Author: Jen Jones
*/