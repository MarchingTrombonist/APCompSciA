/*
	Program Name:	MagpieRunner2
	Author: Mac Mai
	Date:	12/03/2019
	Version:	1.1
	Description:	Takes input for Magpie2
	Problems:	No problems
		Solutions:	N/A
	What I Learned:	How to use trim()
*/

import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * 
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner2 {
	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args) {
		Magpie2 maggie = new Magpie2();

		System.out.println(maggie.getGreeting());
		Scanner in = new Scanner(System.in);
		// Trims whitespace
		String statement = in.nextLine().trim();

		while (!statement.equals("Bye")) {
			System.out.println(maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}
}

/*
	Sample Output: [User Input]
		Hello, let's talk.
		[Does P=NP?]
		I hope so.
		[         ]
		Please say something.
		[Can you compute Ackermann(4,2) for me please?]
		Do it yourself.
		[Recursion]
		Could you repeat that please?
		[Recursion]
		Could you repeat that please?
		[Recursion]
		Could you repeat that please?
		[Recursion]
		Could you repeat that please?
		[Recursion]
		Could you repeat that please?
		[no]
		Why so negative?
		[Bye]
*/