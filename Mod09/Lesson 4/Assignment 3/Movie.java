//Movie class
public class Movie {
	// Instance vars
	private String title;
	private String genre;
	private double rating;
	private double pricePaid;
	private double rentPrice;

	// Constructors
	public Movie() {
		title = "";
		genre = "";
		rating = 0;
		pricePaid = 0;
		rentPrice = 0;
	}

	public Movie(String t, String g, double r, double pP, double rP) {
		title = t;
		genre = g;
		rating = r;
		pricePaid = pP;
		rentPrice = rP;
	}

	// Setters

	public void setTitle(String t) {
		title = t;
	}

	public void setGenre(String g) {
		genre = g;
	}

	public void setRating(double r) {
		rating = r;
	}

	public void setPricePaid(double pP) {
		pricePaid = pP;
	}

	public void setRentPrice(double rP) {
		rentPrice = rP;
	}

	// Getters

	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return genre;
	}

	public double getRating() {
		return rating;
	}

	public double getPricePaid() {
		return pricePaid;
	}

	public double getRentPrice() {
		return rentPrice;
	}
}