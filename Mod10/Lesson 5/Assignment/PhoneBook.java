//PhoneBook class
public class PhoneBook {
	PhoneEntry[] phoneBook;

	// Constructor
	PhoneBook() {
		phoneBook = new PhoneEntry[100];

		// Randomly generated a list of 100 random names from a set of 20 first and last
		// names and alphabetized
		// Last names
		String[] lastNames = { 
			"Boyle", "Boyle", "Boyle", "Boyle", "Boyle", "Clayton", "Clayton", "Clayton", "Clayton", "Clayton", 
			"Clayton", "Espinoza", "Espinoza", "Ewing", "Ewing", "Ewing", "Ewing", "Ewing", "Ewing", "Ewing", 
			"Gregory", "Gregory", "Gregory", "Gregory", "Gregory", "Harmon", "Harmon", "Klein", "Klein", "Klein", 
			"Klein", "Klein", "Luna", "Luna", "Luna", "Luna", "Mcpherson", "Mcpherson", "Mcpherson", "Mcpherson", 
			"Mcpherson", "Mooney", "Mooney", "Mooney", "Morrow", "Morrow", "Morrow", "Morrow", "Morrow", "Odonnell", 
			"Odonnell", "Odonnell", "Odonnell", "Odonnell", "Pope", "Pope", "Pope", "Pope", "Pope", "Pope", 
			"Rivers", "Rivers", "Rivers", "Rivers", "Rivers", "Rivers", "Robles", "Robles", "Robles", "Robles", 
			"Robles", "Waller", "Waller", "Waller", "Waller", "Waller", "Waller", "Walsh", "Walsh", "Walsh", 
			"Walsh", "Walsh", "Walsh", "Walsh", "Walsh", "Walsh", "Walsh", "Walter", "Walter", "Walter", 
			"Webster", "Webster", "Webster", "Webster", "West", "West", "West", "West", "West", "West" 
		};

		// First names
		String[] firstNames = { 
			"Glenn", "Hal", "Homer", "Tanisha", "Tanisha", "Beatriz", "Blake", "Homer", "Lee", "Nell", 
			"Orlando", "Giovanni", "Hal", "Beatriz", "Giovanni", "Glenn", "Nell", "Nell", "Orlando", "Orlando", 
			"Hayden", "Lilian", "Merle", "Nell", "Norma", "Homer", "Zachary", "Blake", "Blake", "Giovanni", 
			"Giovanni", "Lee", "Glenn", "Mauro", "Nell", "Zachary", "Giovanni", "Hal", "Hayden", "Hayden", 
			"Mauro", "Lilian", "Michele", "Tanisha", "Jasmine", "Lilian", "Lilian", "Norma", "Tanisha", "Homer", 
			"Lilian", "Merle", "Tanisha", "Tanisha", "Brenda", "Glenn", "Jasmine", "Lilian", "Michele", "Tanisha", 
			"Brenda", "Jasmine", "Lee", "Merle", "Michele", "Zachary", "Hayden", "Lee", "Lilian", "Mauro", 
			"Norma", "Glenn", "Merle", "Nell", "Orlando", "Tanisha", "Zachary", "Beatriz", "Blake", "Douglass", 
			"Giovanni", "Giovanni", "Homer", "Merle", "Michele", "Norma", "Zachary", "Glenn", "Mauro", "Norma", 
			"Blake", "Hal", "Michele", "Zachary", "Homer", "Homer", "Mauro", "Merle", "Michele", "Norma" 
		};

		// Phone numbers
		String[] phones = { 
			"(288) 798-2119", "(076) 449-8760", "(241) 195-3178", "(052) 092-5212", "(640) 387-9023", "(017) 364-8606", "(739) 814-9449", "(684) 906-7961", "(294) 764-7863", "(384) 131-8220", 
			"(142) 302-7447", "(040) 749-5989", "(469) 490-4143", "(166) 768-0813", "(003) 685-6940", "(405) 175-8751", "(520) 686-7454", "(667) 411-3518", "(170) 509-7395", "(780) 558-3592", 
			"(215) 616-2162", "(615) 044-7265", "(963) 219-6557", "(376) 399-9377", "(212) 062-5170", "(891) 804-0106", "(534) 583-3479", "(519) 083-4016", "(652) 944-8701", "(155) 889-5190", 
			"(462) 942-1763", "(421) 038-0046", "(102) 154-5140", "(198) 528-6888", "(196) 301-7618", "(812) 818-0319", "(333) 007-1584", "(207) 388-7078", "(130) 354-6895", "(903) 508-5263", 
			"(951) 083-4048", "(058) 405-3872", "(247) 628-0091", "(288) 061-0034", "(929) 494-5464", "(089) 298-3315", "(642) 513-3217", "(188) 310-8131", "(645) 561-9806", "(519) 855-2521", 
			"(043) 695-2908", "(747) 080-4491", "(084) 477-9294", "(418) 650-6732", "(201) 325-5770", "(788) 419-9063", "(457) 126-6021", "(314) 109-0157", "(758) 269-1278", "(493) 680-3662", 
			"(505) 832-4315", "(701) 833-3926", "(613) 784-7665", "(854) 354-3633", "(762) 671-4090", "(324) 969-3367", "(820) 174-5388", "(502) 190-0265", "(098) 891-3091", "(788) 802-8888", 
			"(342) 566-6143", "(543) 060-9592", "(453) 197-1167", "(356) 018-3216", "(316) 825-1716", "(740) 545-1155", "(261) 078-9068", "(649) 988-1591", "(978) 160-8369", "(585) 252-8292", 
			"(049) 568-3831", "(455) 596-7749", "(293) 788-0957", "(329) 838-8338", "(491) 768-8438", "(685) 401-8872", "(038) 230-3368", "(274) 831-8774", "(268) 016-2219", "(874) 283-1776", 
			"(345) 348-6843", "(724) 413-3360", "(150) 643-9436", "(373) 158-6543", "(070) 884-0318", "(748) 666-9167", "(247) 292-3510", "(418) 942-1985", "(446) 836-3068", "(309) 152-6389" 
		};

		// Loops to fill PhoneBook
		for (int i = 0; i < 100; i++) {
			phoneBook[i] = new PhoneEntry(lastNames[i], firstNames[i], phones[i]);
		}
	}

	// Searches and returns array of all matches
	PhoneEntry[] search(String lName, String fName) {

		// Base case for count
		int count = 0;

		// Counts how many entries to print
		for (int i = 0; i < findLast(); i++) {
			// Creates booleans for if the name matches
			boolean lNBool = (phoneBook[i].getLastName().toUpperCase().equals(lName.toUpperCase()));

			boolean fNBool = (phoneBook[i].getFirstName().toUpperCase().equals(fName.toUpperCase()));

			// Tests if name matches search and increments count; blank search is wildcard
			if (((lName.equals("")) || lNBool) && ((fName.equals("")) || fNBool)) {
				count++;
			}
		}

		// Creates array to store search results
		PhoneEntry[] searchResults = new PhoneEntry[count];
		int index = 0;

		// Searches and fills array
		for (int i = 0; i < findLast(); i++) {
			// Creates booleans for if the name matches
			boolean lNBool = (phoneBook[i].getLastName().toUpperCase().equals(lName.toUpperCase()));

			boolean fNBool = (phoneBook[i].getFirstName().toUpperCase().equals(fName.toUpperCase()));

			// Tests if name matches search and stores into array; blank search is wildcard
			if (((lName.equals("")) || lNBool) && ((fName.equals("")) || fNBool)) {
				searchResults[index] = phoneBook[i];
				index++;
			}
		}
		// Returns array of matches
		return searchResults;
	}

	// Add new name
	String addName(String lName, String fName, String phone) {
		// Finds first null entry and adds new entry
		for (int i = 0; i < phoneBook.length; i++) {
			if (phoneBook[i] == null) {
				phoneBook[i] = new PhoneEntry(lName, fName, phone);
				return "Name has been added.";
			}
		}
		return "No empty spaces.";
	}

	// Delete name
	String deleteName(String lName, String fName, String phone) {
		for (int i = 0; i < findLast(); i++) {
			// Creates booleans for if the name matches
			boolean lNBool = (phoneBook[i].getLastName().toUpperCase().equals(lName.toUpperCase()));

			boolean fNBool = (phoneBook[i].getFirstName().toUpperCase().equals(fName.toUpperCase()));

			// Deletes matching name
			if (lNBool && fNBool && (phone.equals(phoneBook[i].getPhone()))) {
				phoneBook[i] = phoneBook[findLast() - 1];
				phoneBook[findLast() - 1] = null;
				return "Name deleted.";
			}
		}
		return "Name not found.";
	}

	// Finds last non-null entry
	int findLast() {
		for (int i = 0; i < phoneBook.length; i++) {
			if (phoneBook[i] == null) {
				return i;
			}
		}
		return 100;
	}
}