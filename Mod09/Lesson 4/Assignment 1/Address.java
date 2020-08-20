//Address class
public class Address {
	// Instance vars

	private String street;
	private String city;
	private String state;
	private String zip;

	// Constructors

	public Address() {
		street = "";
		city = "";
		state = "";
		zip = "";
	}

	public Address(String s, String c, String st, String z) {
		street = s;
		city = c;
		state = st;
		zip = z;
	}

	// Getters

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZip() {
		return zip;
	}

	// Setters

	public void setStreet(String s) {
		street = s;
	}

	public void setCity(String c) {
		city = c;
	}

	public void setState(String st) {
		state = st.toUpperCase();
	}

	public void setZip(String z) {
		zip = z;
	}
}