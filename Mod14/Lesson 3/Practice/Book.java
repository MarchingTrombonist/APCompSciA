import java.util.Calendar;

public class Book extends Media {
	// Instance variables
	private String author;

	// Default constructor for objects of class Book
	public Book() {
		super();
		author = null;
	}

	// Normal constructor for objects of class Book
	public Book(String t, String a, Calendar c) {
		super(t, c);
		author = a;
	}

	// Copies the Book
	public Book(Book b) {
		super(b.title, b.today);
		author = b.author;
	}

	// Prints specs of the Book object
	public String toString() {
		String str = "The specs of this book are: ";
		str += "\n\tTitle: " + title;
		str += "\n\tAuthor: " + author;
		str += "\n\tReturn date: " + getReturnDate().getTime();
		return str;
	}

	public Calendar getReturnDate() {
		Calendar dueDate = Calendar.getInstance();
		dueDate.set(today.MONTH, today.get(today.MONTH));
		dueDate.set(today.YEAR, today.get(today.YEAR));
		dueDate.add(today.DATE, 21);
		return dueDate;
	}

	// Getters

	public String getAuthor() {
		return author;
	}

	// Setters

	public void setAuthor(String a) {
		author = a;
	}

}