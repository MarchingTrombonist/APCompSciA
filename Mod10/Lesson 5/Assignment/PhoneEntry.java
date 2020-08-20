//PhoneEntry class
public class PhoneEntry {
	// Private vars
	private String lastName;
	private String firstName;
	private String phone;

	// Constructor
	PhoneEntry(String lN, String fN, String p) {
		lastName = lN;
		firstName = fN;
		phone = p;
	}

	// Getters
	String getLastName() {
		return lastName;
	}

	String getFirstName() {
		return firstName;
	}

	String getPhone() {
		return phone;
	}
}