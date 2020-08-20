/*
	Program Name:	Mod5DeMorganMM
	Author: Mac Mai
	Date:	10/15/2019
	Version:	1.1
	Description:	Proves DeMorgan's law
	Problems:	I missed an '!'
		Solutions:	I added it in
	What I Learned:	What DeMorgan's law is and how it works
*/

public class Mod5DeMorganMM {
	public static void main(String[] args) {

		boolean overl2YearsOld = true;
		boolean over4FeetTall = true;

		// Anyone can ride a Roller Coaster if they are over 12 years old or if they are
		// taller than 4 feet
		boolean canRideRollerCoaster = overl2YearsOld || over4FeetTall;

		// Truth table for canRideRollerCoaster
		System.out.printf("%25s%25s%25s\n", "over12yearsOld", "over4FeetTall", "canRideRollerCoaster");
		System.out.printf("%20b%25b%25b\n", overl2YearsOld, over4FeetTall, overl2YearsOld || over4FeetTall);
		System.out.printf("%20b%25b%25b\n", overl2YearsOld, !over4FeetTall, overl2YearsOld || !over4FeetTall);
		System.out.printf("%20b%25b%25b\n", !overl2YearsOld, over4FeetTall, !overl2YearsOld || over4FeetTall);
		System.out.printf("%20b%25b%25b\n\n", !overl2YearsOld, !over4FeetTall, !overl2YearsOld || !over4FeetTall);

		// DeMorgan's Law states that !(a || b) is equivalent to (!a && !b)
		// In our example above, the truth table for !(a || b) is the
		// Truth table for cannotRideRollerCoaster
		boolean cannotRideRollerCoaster = !(overl2YearsOld || over4FeetTall);

		System.out.printf("%25s%25s%28s\n", "over12yearsOld", "over4FeetTall", "cannotRideRollerCoaster");
		System.out.printf("%20b%25b%25b\n", overl2YearsOld, over4FeetTall, !(overl2YearsOld || over4FeetTall));
		System.out.printf("%20b%25b%25b\n", overl2YearsOld, !over4FeetTall, !(overl2YearsOld || !over4FeetTall));
		System.out.printf("%20b%25b%25b\n", !overl2YearsOld, over4FeetTall, !(!overl2YearsOld || over4FeetTall));
		System.out.printf("%20b%25b%25b\n\n", !overl2YearsOld, !over4FeetTall, !(!overl2YearsOld || !over4FeetTall));

		// Your assignment is to show that the truth table for DeMorgan's version is
		// equivalent

		// your code goes here
		cannotRideRollerCoaster = (!overl2YearsOld && !over4FeetTall);

		// Truth table DeMorgan's way
		System.out.printf("%25s%25s%28s\n", "over12yearsOld", "over4FeetTall", "cannotRideRollerCoaster");
		System.out.printf("%20b%25b%25b\n", overl2YearsOld, over4FeetTall, (!overl2YearsOld && !over4FeetTall));
		System.out.printf("%20b%25b%25b\n", overl2YearsOld, !over4FeetTall, (!overl2YearsOld && over4FeetTall));
		System.out.printf("%20b%25b%25b\n", !overl2YearsOld, over4FeetTall, (overl2YearsOld && !over4FeetTall));
		System.out.printf("%20b%25b%25b\n\n", !overl2YearsOld, !over4FeetTall, (overl2YearsOld && over4FeetTall));
	}
}

/*
	Sample Output: [User Input]
		over12yearsOld            over4FeetTall     canRideRollerCoaster
				 true                     true                 		 true
				 true                    false                 		 true
				false                     true                 		 true
				false                    false                 		false
		over12yearsOld            over4FeetTall     cannotRideRollerCoaster
				 true                     true                    false
				 true                    false                    false
				false                     true                    false
				false                    false                     true
		over12yearsOld            over4FeetTall     cannotRideRollerCoaster
			   true                     true                    false
			   true                    false                    false
			  false                     true                    false
			  false                    false                     true
*/