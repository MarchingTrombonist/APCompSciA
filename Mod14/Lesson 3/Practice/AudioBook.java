import java.util.Calendar;

public class AudioBook extends Media {
	// Instance variables
	private String narr;
	private int year;

	// Default constructor for objects of class AudioBook
	public AudioBook() {
		super();
		narr = null;
		year = 0;
	}

	// Normal constructor for objects of class AudioBook
	public AudioBook(String t, String n, int y, Calendar c) {
		super(t, c);
		narr = n;
		year = y;
	}

	// Copies the AudioBook
	public AudioBook(AudioBook a) {
		super(a.title, a.today);
		narr = a.narr;
		year = a.year;
	}

	// Prints specs of the AudioBook object
	public String toString() {
		String str = "The specs of this audiobook are: ";
		str += "\n\tTitle: " + title;
		str += "\n\tNarrator : " + narr;
		str += "\n\tYear: " + year;
		str += "\n\tReturn date: " + getReturnDate().getTime();
		return str;
	}

	public Calendar getReturnDate() {
		Calendar dueDate = Calendar.getInstance();
		dueDate.set(today.MONTH, today.get(today.MONTH));
		dueDate.set(today.YEAR, today.get(today.YEAR));
		dueDate.add(today.DATE, 14);
		return dueDate;
	}

	// Getters

	public String getNarr() {
		return narr;
	}

	public int getYear() {
		return year;
	}

	// Setters

	public void setNarr(String n) {
		narr = n;
	}

	public void setYear(int y) {
		year = y;
	}

}