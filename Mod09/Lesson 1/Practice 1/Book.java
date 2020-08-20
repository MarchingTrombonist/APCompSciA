public class Book {
	// Instance variables
	private String title;
	private String author;

	// Default constructor for objects of class Book
	public Book() {
		title = null;
		author = null;
	}

	// Normal constructor for objects of class Book
	public Book(String t, String a) {
		title = t;
		author = a;
	}

	// Copies the Book
	public Book(Book b) {
		title = b.title;
		author = b.author;
	}

	// Prints specs of the Book object
	public String toString() {
		String str = "The specs of this book are: ";
		str += "\n\tTitle: " + title;
		str += "\n\tAuthor: " + author;
		return str;
	}

	// Getters

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	// Setters

	public void setTitle(String t) {
		title = t;
	}

	public void setAuthor(String a) {
		author = a;
	}
}