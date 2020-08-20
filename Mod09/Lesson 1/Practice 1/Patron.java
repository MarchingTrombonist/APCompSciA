public class Patron {
	// Instance variables
	private String fName;
	private String lName;
	private String libNumber;
	private Book patBook;

	// Default constructor for objects of class Patron
	public Patron() {
		fName = null;
		lName = null;
		libNumber = null;
		patBook = null;
	}

	// Normal constructor for objects of class Patron
	public Patron(String f, String l, String ln, Book b) {
		fName = f;
		lName = l;
		libNumber = ln;
		patBook = b;
	}

	// Prints specs of the Patron object
	public String toString() {
		String str = "The specs of this Patron are: ";
		str += "\n\tFirst Name: " + fName;
		str += "\n\tLast Name: " + lName;
		str += "\n\tLibrary Number: " + libNumber;
		str += "\n\t" + patBook;
		return str;
	}

	// Getters

	public String getFName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

	public String getLibNumber() {
		return libNumber;
	}

	public Book getBook() {
		return patBook;
	}

	// Setters

	public void setFName(String f) {
		fName = f;
	}

	public void setLName(String l) {
		lName = l;
	}

	public void setLibNumber(String ln) {
		libNumber = ln;
	}

	public void setBook(Book b) {
		patBook = b;
	}
}