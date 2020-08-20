/*
	Program Name:	Magpie2
	Author: Mac Mai
	Date:	12/03/2019
	Version:	1.1
	Description:	Basic chatbot
	Problems:	No problems
		Solutions:	N/A
	What I Learned:	How to add responses
*/

/*
	New Keywords/Responses
		P=NP
			"I hope so"
		Chomsky
			"Colorless green ideas sleep furiously"
		Bug
			"Did you try Googling it?"
		Recursion
			"Could you repeat that please?"
		Ackermann(4,2)
			"Do it yourself"
*/

/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2 {
	/**
	 * Get a default greeting
	 * 
	 * @return a greeting
	 */
	public String getGreeting() {
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement) {
		String response = "";
		if (statement.indexOf("no") >= 0) {
			response = "Why so negative?";
		} else if (statement.indexOf("mother") >= 0 || statement.indexOf("father") >= 0 || statement.indexOf("sister") >= 0	|| statement.indexOf("brother") >= 0) {
			response = "Tell me more about your family.";
		} else if (statement.indexOf("P=NP") >= 0) {
			response = "I hope so.";
		} else if (statement.indexOf("Chomsky") >= 0) {
			response = "Colorless green ideas sleep furiously.";
		} else if (statement.indexOf("Bug") >= 0) {
			response = "Did you try Googling it?";
		} else if (statement.indexOf("Recursion") >= 0) {
			response = "Could you repeat that please?";
		} else if (statement.indexOf("Ackermann(4,2)") >= 0) {
			response = "Do it yourself.";
		} else if (statement.length() == 0) {
			response = "Please say something.";
		} else {
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * 
	 * @return a non-committal string
	 */
	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0) {
			response = "Interesting, tell me more.";
		} else if (whichResponse == 1) {
			response = "Hmmm.";
		} else if (whichResponse == 2) {
			response = "Do you really think so?";
		} else if (whichResponse == 3) {
			response = "You don't say.";
		}

		return response;
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