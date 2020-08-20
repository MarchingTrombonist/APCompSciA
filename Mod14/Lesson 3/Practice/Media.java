import java.util.Calendar;

public abstract class Media {
	public String title;
	public Calendar today;

	public Media() {
		title = null;
		today = Calendar.getInstance();
	}

	public Media(String t, Calendar c) {
		title = t;
		today = c;
	}

	// Getters

	public String getTitle() {
		return title;
	}

	public Calendar getToday() {
		return today;
	}

	// Setters

	public void setTitle(String t) {
		title = t;
	}

	public void setToday(Calendar c) {
		today = c;
	}

	public abstract Calendar getReturnDate();
}