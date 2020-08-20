/*
	Program Name:	Mod9TelevisionMM
	Author: Mac Mai
	Date:	01/16/2020
	Version:	1.4
	Description:	Creates tv
	Problems:	Printed in object class
		Solutions:	Moved printing to test class
	What I Learned:	How to use methods
*/

public class Mod9TelevisionMM {
	public static void main(String[] args) {
		// Creates Television
		Television tv = new Television(false, 1, 5);
		// Changes states
		tv.powerButton();
		tv.changeVolume(1);
		tv.changeVolume(-1);
		tv.setChannel(5);
		tv.powerButton();

		// Prints
		System.out.println("TV is now " + tv.getPower());

		System.out.println("Now tuned into Channel " + tv.getChannel() + ".");

		System.out.println("Volume is now at " + tv.getVolume() + "/10.");
	}
}

/*
	Sample Output: [User Input]
		TV is currently off, tuned in to Channel 1, and the volume is 5/10
		TV is now on.
		Volume is now at 6/10.
		Volume is now at 5/10.
		Now tuned in to Channel 5.
		TV is now off.
*/