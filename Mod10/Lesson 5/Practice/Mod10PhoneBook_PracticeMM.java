/*
	Program Name:	Mod10PhoneBook_PracticeMM
	Author: Mac Mai
	Date:	02/12/2020
	Version:	1.1
	Description:	Makes phonebook
	Problems:	No problems
		Solutions:	N/A
	What I Learned:	How to use arrays
*/

public class Mod10PhoneBook_PracticeMM {
	public static void main(String[] args) {
		PhoneBook_Practice pb = new PhoneBook_Practice();
		// search for "Violet Smith"
		PhoneEntry_Practice entry = pb.search("Violet Smith");

		// if found, print out the entry
		if (entry != null) {
			System.out.println(entry.getName() + ": " + entry.getPhone());
		} else {
			System.out.println("Name not found");
		}
	}
}


/*
	Sample Output: [User Input]
		Violet Smith: (312) 223-1937
*/