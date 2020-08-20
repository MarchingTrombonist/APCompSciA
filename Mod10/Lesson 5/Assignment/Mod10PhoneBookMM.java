/*
	Program Name:	Mod10PhoneBookMM
	Author: Mac Mai
	Date:	02/16/2020
	Version:	1.5
	Description:	Uses a phonebook
	Problems:	Getting the search to return multiple results
		Solutions:	I put the results into an array
	What I Learned:	How to use arrays
*/

//Imports
import java.io.*;
import java.util.*;

public class Mod10PhoneBookMM {
	public static void main(String[] args) {
		// Creates Scanner
		Scanner input = new Scanner(System.in);
		// Creates phonebook to use
		PhoneBook pb = new PhoneBook();
		// Search strings
		String searchLast;
		String searchFirst;
		String searchPhone;

		// Loops until user quits
		while (true) {
			// Prints Header
			System.out.print("Search Names (s), Add Name (a), or Delete Name (d): ");

			// Switches action to be run
			switch (input.nextLine()) {

			// Search Names
			case "s":
				System.out.println("Search Name\n\n");
				// Asks for last name to search
				System.out.print("Last Name: ");
				searchLast = input.nextLine();

				// Asks for first name to search
				System.out.print("First Name: ");
				searchFirst = input.nextLine();

				// Returns an array of all matches
				PhoneEntry[] entry = pb.search(searchLast, searchFirst);

				// Prints count and list of matches
				if (entry.length != 0) {
					System.out.println("\n" + entry.length + " results found: ");
					for (int i = 0; i < entry.length; i++) {
						System.out.println(entry[i].getLastName() + ", " + entry[i].getFirstName() + ": " + entry[i].getPhone());
					}
				} else {
					System.out.println("No results found.");
				}
				break;

			// Add Name
			case "a":
				System.out.println("Add Name\n\n");
				// Asks for last name
				System.out.print("Last Name: ");
				searchLast = input.nextLine();

				// Asks for first name
				System.out.print("First Name: ");
				searchFirst = input.nextLine();

				// Asks for phone
				System.out.print("Phone Number: ");
				searchPhone = input.nextLine();

				// Prints if successful or not
				System.out.println(pb.addName(searchLast, searchFirst, searchPhone));
				break;

			// Delete Name
			case "d":
				System.out.println("Delete Name\n\n");
				// Asks for last name
				System.out.print("Last Name: ");
				searchLast = input.nextLine();

				// Asks for first name
				System.out.print("First Name: ");
				searchFirst = input.nextLine();

				// Asks for phone
				System.out.print("Phone Number: ");
				searchPhone = input.nextLine();

				// Prints if successful or not
				System.out.println(pb.deleteName(searchLast, searchFirst, searchPhone));
				break;

			// Default
			default:
				System.out.println("Option not found.");
			}

			// Quits if input matches the RegEx "\\b[nN].*" (first character is n or N)
			System.out.print("\nAgain? (y/n): ");
			if (input.nextLine().matches("\\b[nN].*")) {
				System.out.println("Goodbye");
				input.close();
				System.exit(0);
			}
		}
	}
}

/*
	Sample Output: [User Input]
		Search Names (s), Add Name (a), or Delete Name (d): [s]
		Search Name


		Last Name: [robles]
		First Name: []

		5 results found:
		Robles, Hayden: (820) 174-5388
		Robles, Lee: (502) 190-0265
		Robles, Lilian: (098) 891-3091
		Robles, Mauro: (788) 802-8888
		Robles, Norma: (342) 566-6143

		Again? (y/n): [y]
		Search Names (s), Add Name (a), or Delete Name (d): [s]
		Search Name


		Last Name: []
		First Name: [lee]

		4 results found:
		Clayton, Lee: (294) 764-7863
		Klein, Lee: (421) 038-0046
		Rivers, Lee: (613) 784-7665
		Robles, Lee: (502) 190-0265

		Again? (y/n): [y]
		Search Names (s), Add Name (a), or Delete Name (d): [s]
		Search Name


		Last Name: [robles]
		First Name: [lee]

		1 results found:
		Robles, Lee: (502) 190-0265

		Again? (y/n): [y]
		Search Names (s), Add Name (a), or Delete Name (d): [a]
		Add Name


		Last Name: [Robles]
		First Name: [Lee]
		Phone Number: [(502) 190-0265]
		No empty spaces.

		Again? (y/n): [y]
		Search Names (s), Add Name (a), or Delete Name (d): [d]
		Delete Name


		Last Name: [robles]
		First Name: [lee]
		Phone Number: [(502) 190-0265]
		Name deleted.

		Again? (y/n): [y]
		Search Names (s), Add Name (a), or Delete Name (d): [s]
		Search Name


		Last Name: [robles]
		First Name: [lee]
		No results found.

		Again? (y/n): [y]
		Search Names (s), Add Name (a), or Delete Name (d): [a]
		Add Name


		Last Name: [Robles]
		First Name: [Lee]
		Phone Number: [(502) 190-0265]
		Name has been added.

		Again? (y/n): [y]
		Search Names (s), Add Name (a), or Delete Name (d): [s]
		Search Name


		Last Name: [robles]
		First Name: [lee]

		1 results found:
		Robles, Lee: (502) 190-0265

		Again? (y/n): [y]
		Search Names (s), Add Name (a), or Delete Name (d): [s]
		Search Name


		Last Name: []
		First Name: []

		100 results found:
		Boyle, Glenn: (288) 798-2119
		Boyle, Hal: (076) 449-8760
		Boyle, Homer: (241) 195-3178
		Boyle, Tanisha: (052) 092-5212
		Boyle, Tanisha: (640) 387-9023
		Clayton, Beatriz: (017) 364-8606
		Clayton, Blake: (739) 814-9449
		Clayton, Homer: (684) 906-7961
		Clayton, Lee: (294) 764-7863
		Clayton, Nell: (384) 131-8220
		Clayton, Orlando: (142) 302-7447
		Espinoza, Giovanni: (040) 749-5989
		Espinoza, Hal: (469) 490-4143
		Ewing, Beatriz: (166) 768-0813
		Ewing, Giovanni: (003) 685-6940
		Ewing, Glenn: (405) 175-8751
		Ewing, Nell: (667) 411-3518
		Ewing, Nell: (520) 686-7454
		Ewing, Orlando: (780) 558-3592
		Ewing, Orlando: (170) 509-7395
		Gregory, Hayden: (215) 616-2162
		Gregory, Lilian: (615) 044-7265
		Gregory, Merle: (963) 219-6557
		Gregory, Nell: (376) 399-9377
		Gregory, Norma: (212) 062-5170
		Harmon, Homer: (891) 804-0106
		Harmon, Zachary: (534) 583-3479
		Klein, Blake: (519) 083-4016
		Klein, Blake: (652) 944-8701
		Klein, Giovanni: (155) 889-5190
		Klein, Giovanni: (462) 942-1763
		Klein, Lee: (421) 038-0046
		Luna, Glenn: (102) 154-5140
		Luna, Mauro: (198) 528-6888
		Luna, Nell: (196) 301-7618
		Luna, Zachary: (812) 818-0319
		Mcpherson, Giovanni: (333) 007-1584
		Mcpherson, Hal: (207) 388-7078
		Mcpherson, Hayden: (903) 508-5263
		Mcpherson, Hayden: (130) 354-6895
		Mcpherson, Mauro: (951) 083-4048
		Mooney, Lilian: (058) 405-3872
		Mooney, Michele: (247) 628-0091
		Mooney, Tanisha: (288) 061-0034
		Morrow, Jasmine: (929) 494-5464
		Morrow, Lilian: (642) 513-3217
		Morrow, Lilian: (089) 298-3315
		Morrow, Norma: (188) 310-8131
		Morrow, Tanisha: (645) 561-9806
		Odonnell, Homer: (519) 855-2521
		Odonnell, Lilian: (043) 695-2908
		Odonnell, Merle: (747) 080-4491
		Odonnell, Tanisha: (084) 477-9294
		Odonnell, Tanisha: (418) 650-6732
		Pope, Brenda: (201) 325-5770
		Pope, Glenn: (788) 419-9063
		Pope, Jasmine: (457) 126-6021
		Pope, Lilian: (314) 109-0157
		Pope, Michele: (758) 269-1278
		Pope, Tanisha: (493) 680-3662
		Rivers, Brenda: (505) 832-4315
		Rivers, Jasmine: (701) 833-3926
		Rivers, Lee: (613) 784-7665
		Rivers, Merle: (854) 354-3633
		Rivers, Michele: (762) 671-4090
		Rivers, Zachary: (324) 969-3367
		Robles, Hayden: (820) 174-5388
		Robles, Lee: (502) 190-0265
		Robles, Lilian: (098) 891-3091
		Robles, Mauro: (788) 802-8888
		Robles, Norma: (342) 566-6143
		Waller, Glenn: (543) 060-9592
		Waller, Merle: (453) 197-1167
		Waller, Nell: (356) 018-3216
		Waller, Orlando: (316) 825-1716
		Waller, Tanisha: (740) 545-1155
		Waller, Zachary: (261) 078-9068
		Walsh, Beatriz: (649) 988-1591
		Walsh, Blake: (978) 160-8369
		Walsh, Douglass: (585) 252-8292
		Walsh, Giovanni: (049) 568-3831
		Walsh, Giovanni: (455) 596-7749
		Walsh, Homer: (293) 788-0957
		Walsh, Merle: (329) 838-8338
		Walsh, Michele: (491) 768-8438
		Walsh, Norma: (685) 401-8872
		Walsh, Zachary: (038) 230-3368
		Walter, Glenn: (274) 831-8774
		Walter, Mauro: (268) 016-2219
		Walter, Norma: (874) 283-1776
		Webster, Blake: (345) 348-6843
		Webster, Hal: (724) 413-3360
		Webster, Michele: (150) 643-9436
		Webster, Zachary: (373) 158-6543
		West, Homer: (070) 884-0318
		West, Homer: (748) 666-9167
		West, Mauro: (247) 292-3510
		West, Merle: (418) 942-1985
		West, Michele: (446) 836-3068
		West, Norma: (309) 152-6389

		Again? (y/n): [n]
		Goodbye
*/