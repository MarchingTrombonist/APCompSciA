public class PhoneBook_Practice {
	PhoneEntry_Practice[] phoneBook_Practice;

	// constructor
	PhoneBook_Practice() {
		phoneBook_Practice = new PhoneEntry_Practice[5];

		phoneBook_Practice[0] = new PhoneEntry_Practice("James Barclay", "(418) 665-1223");
		phoneBook_Practice[1] = new PhoneEntry_Practice("Grace Dunbar", "(860) 399-3044");
		phoneBook_Practice[2] = new PhoneEntry_Practice("Paul Kratides", "(815) 439-9271");
		phoneBook_Practice[3] = new PhoneEntry_Practice("Violet Smith", "(312) 223-1937");
		phoneBook_Practice[4] = new PhoneEntry_Practice("John Wood", "(913) 883-2874");
	}

	// Use linear search to find the targetName.
	// Return a reference to the matching PhoneEntry_Practice or null
	// if none is found.
	//
	PhoneEntry_Practice search(String targetName) {
		for (int j = 0; j < phoneBook_Practice.length; j++) {
			if (phoneBook_Practice[j].getName().toUpperCase().equals(targetName.toUpperCase())) {
				return phoneBook_Practice[j];
			}
		}
		return null;
	}
}