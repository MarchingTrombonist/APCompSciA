import java.util.Calendar;

public class Movie extends Media {
	private int year;

	public Movie() {
		super();
		year = 0;
	}

	public Movie(String t, int y, Calendar c) {
		super(t, c);
		year = y;
	}

	public Movie(Movie m) {
		super(m.title, m.today);
		year = m.year;
	}

	public String toString() {
		String str = "The specs of this movie are: ";
		str += "\n\tTitle: " + title;
		str += "\n\tYear released: " + year;
		str += "\n\tReturn date: " + getReturnDate().getTime();
		return str;
	}

	public Calendar getReturnDate() {
		Calendar dueDate = Calendar.getInstance();
		dueDate.set(today.MONTH, today.get(today.MONTH));
		dueDate.set(today.YEAR, today.get(today.YEAR));
		dueDate.add(today.DATE, 7);
		return dueDate;
	}

	// Getters

	public int getYear() {
		return year;
	}

	// Setters

	public void setYear(int y) {
		year = y;
	}
}