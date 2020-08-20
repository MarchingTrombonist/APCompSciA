/*
	Program Name:	Mod3NameThatCelebrityMM
	Author:	Mac Mai
	Date:	09/17/2019
	Version:	1.1
	Description:	Prints names in all lowercase minus the first 2 and last 3 letters
	Problems:	I didn't have quotes around the escape characters
		Solutions:	I added quotes
	What I Learned:	How to use escape characters and String methods at the same time
*/

public class Mod3NameThatCelebrityMM {
	public static void main(String[] args) {
		// Declares/Defines Strings
		String s1 = "Taylor Swift";
		String s2 = "John Boyega";
		String s3 = "Emma Stone";
		// Prints in lowercase and removes the first two and last three letters
		print(s1 + ">>>" + s1.toLowerCase().substring(2, s1.length() - 3) + "\n" + s2 + ">>>"
				+ s2.toLowerCase().substring(2, s2.length() - 3) + "\n" + s3 + ">>>"
				+ s3.toLowerCase().substring(2, s3.length() - 3));
	}

	// Makes print shorter
	public static void print(String x) {
		System.out.println(x);
	}
}

/*
	Sample Output: [User Input]
		Taylor Swift>>>ylor sw
		John Boyega>>>hn boy
		Emma Stone>>>ma st
*/