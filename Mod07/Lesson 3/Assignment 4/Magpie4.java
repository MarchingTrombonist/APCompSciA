/*
	Program Name:	Magpie4
	Author: Mac Mai
	Date:	12/05/2019
	Version:	1.3
	Description:	Transforms statements
	Problems:	Stacking else ifs correctly
		Solutions:	I changed it until it worked
	What I Learned:	How to search strings and transform them
*/

/**
 * A program to carry on conversations with a human user.
 * This version:
 *<ul><li>
 * 		Uses advanced search for keywords 
 *</li><li>
 * 		Will transform statements as well as react to keywords
 *</li></ul>
 * @author Laurie White
 * @version April 2012
 *
 */
public class Magpie4 {
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
		statement = statement.trim();
		String response = "";
		if (statement.length() == 0) {
			response = "Say something, please.";
		}

		else if (findKeyword(statement, "no") >= 0) {
			response = "Why so negative?";
		} else if (findKeyword(statement, "mother") >= 0 || findKeyword(statement, "father") >= 0 || findKeyword(statement, "sister") >= 0 || findKeyword(statement, "brother") >= 0) {
			response = "Tell me more about your family.";
		}

		// Responses which require transformations
		else if (findKeyword(statement, "I want to", 0) >= 0) {
			response = transformIWantToStatement(statement);
		}

		else if (findKeyword(statement, "I want", 0) >= 0) {
			response = transformIWantStatement(statement);
		}

		else if (findKeyword(statement, "Can you", 0) >= 0) {
			response = transformCanYouStatement(statement);
		}

		else if (findKeyword(statement, "What is the answer to", 0) >= 0) {
			response = transformWhatAnswerStatement(statement);
		}

		else {
			// Look for a two word (you <something> me)
			// pattern
			int psn = findKeyword(statement, "you", 0);

			if (psn >= 0 && findKeyword(statement, "me", psn) >= 0) {
				response = transformYouMeStatement(statement);
			} else {
				psn = findKeyword(statement, "i", 0);

				if (psn >= 0 && findKeyword(statement, "you", psn) >= 0) {
					response = transformIYouStatement(statement);
				} else {
					psn = findKeyword(statement, "You should", 0);

					if (psn >= 0 && findKeyword(statement, "the", psn) >= 0) {
						response = transformYouShouldStatement(statement);
					} else {
						response = getRandomResponse();
					}
				}
			}
		}
		return response;
	}

	/**
	 * Take a statement with "I want to <something>." and transform it into "What
	 * would it mean to <something>?"
	 * 
	 * @param statement the user statement, assumed to contain "I want to"
	 * @return the transformed statement
	 */
	private String transformIWantToStatement(String statement) {
		// Remove the final period, if there is one
		statement = statement.trim();
		String lastChar = statement.substring(statement.length() - 1);
		if (lastChar.equals(".")) {
			statement = statement.substring(0, statement.length() - 1);
		}
		int psn = findKeyword(statement, "I want to", 0);
		String restOfStatement = statement.substring(psn + 9).trim();
		return "What would it mean to " + restOfStatement + "?";
	}

	/**
	 * Take a statement with "I want <something>." and transform it into "Would you
	 * really be happy if you had <something>?"
	 * 
	 * @param statement the user statement, assumed to contain "I want "
	 * @return the transformed statement
	 */
	private String transformIWantStatement(String statement) {
		// Remove the final period, if there is one
		statement = statement.trim();
		String lastChar = statement.substring(statement.length() - 1);
		if (lastChar.equals(".")) {
			statement = statement.substring(0, statement.length() - 1);
		}
		int psn = findKeyword(statement, "I want", 0);
		String restOfStatement = statement.substring(psn + 6).trim();
		return "Would you really be happy if you had " + restOfStatement + "?";
	}

	/**
	 * Take a statement with "Can you <something>." and transform it into "No, I
	 * cannot <something>. Can you?"
	 * 
	 * @param statement the user statement, assumed to contain "Can you"
	 * @return the transformed statement
	 */
	private String transformCanYouStatement(String statement) {
		// Remove the final period, if there is one
		statement = statement.trim();
		String lastChar = statement.substring(statement.length() - 1);
		if (lastChar.equals("?")) {
			statement = statement.substring(0, statement.length() - 1);
		}
		int psn = findKeyword(statement, "Can you", 0);
		String restOfStatement = statement.substring(psn + 7).trim();
		return "No, I cannot " + restOfStatement + ". Can you?";
	}

	/**
	 * Take a statement with "What is the answer to <something>?" and transform it
	 * into "The answer to <something> is 42."
	 * 
	 * @param statement the user statement, assumed to contain "What is the answer
	 *                  to"
	 * @return the transformed statement
	 */
	private String transformWhatAnswerStatement(String statement) {
		// Remove the final period, if there is one
		statement = statement.trim();
		String lastChar = statement.substring(statement.length() - 1);
		if (lastChar.equals("?")) {
			statement = statement.substring(0, statement.length() - 1);
		}
		int psn = findKeyword(statement, "What is the answer to", 0);
		String restOfStatement = statement.substring(psn + 21).trim();
		return "The answer to " + restOfStatement + " is 42.";
	}

	/**
	 * Take a statement with "you <something> me" and transform it into "What makes
	 * you think that I <something> you?"
	 * 
	 * @param statement the user statement, assumed to contain "you" followed by
	 *                  "me"
	 * @return the transformed statement
	 */
	private String transformYouMeStatement(String statement) {
		// Remove the final period, if there is one
		statement = statement.trim();
		String lastChar = statement.substring(statement.length() - 1);
		if (lastChar.equals(".")) {
			statement = statement.substring(0, statement.length() - 1);
		}

		int psnOfYou = findKeyword(statement, "you", 0);
		int psnOfMe = findKeyword(statement, "me", psnOfYou + 3);

		String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe).trim();
		return "What makes you think that I " + restOfStatement + " you?";
	}

	/**
	 * Take a statement with "I <something> you" and transform it into "Why do you
	 * <something> me?"
	 * 
	 * @param statement the user statement, assumed to contain "I" followed by "you"
	 * @return the transformed statement
	 */
	private String transformIYouStatement(String statement) {
		// Remove the final period, if there is one
		statement = statement.trim();
		String lastChar = statement.substring(statement.length() - 1);
		if (lastChar.equals(".")) {
			statement = statement.substring(0, statement.length() - 1);
		}

		int psnOfI = findKeyword(statement, "I", 0);
		int psnOfYou = findKeyword(statement, "you", psnOfI + 1);

		String restOfStatement = statement.substring(psnOfI + 1, psnOfYou).trim();
		return "Why do you " + restOfStatement + " me?";
	}

	/**
	 * Take a statement with "You should <something> the <something>" and transform
	 * it into "Why should I <something> the <something>?"
	 * 
	 * @param statement the user statement, assumed to contain "You should" followed
	 *                  by "the"
	 * @return the transformed statement
	 */
	private String transformYouShouldStatement(String statement) {
		// Remove the final period, if there is one
		statement = statement.trim();
		String lastChar = statement.substring(statement.length() - 1);
		if (lastChar.equals(".")) {
			statement = statement.substring(0, statement.length() - 1);
		}

		int psnOfYouShould = findKeyword(statement, "You should", 0);
		int psnOfThe = findKeyword(statement, "the", psnOfYouShould + 10);

		String restOfStatement = statement.substring(psnOfYouShould + 10, psnOfThe).trim();

		String restOfStatement2 = statement.substring(psnOfThe + 3, statement.length()).trim();
		return "Why should I " + restOfStatement + " the " + restOfStatement2 + "?";
	}

	/**
	 * Search for one word in phrase. The search is not case sensitive. This method
	 * will check that the given goal is not a substring of a longer string (so, for
	 * example, "I know" does not contain "no").
	 * 
	 * @param statement the string to search
	 * @param goal      the string to search for
	 * @param startPos  the character of the string to begin the search at
	 * @return the index of the first occurrence of goal in statement or -1 if it's
	 *         not found
	 */
	private int findKeyword(String statement, String goal, int startPos) {
		String phrase = statement.trim();
		// The only change to incorporate the startPos is in the line below
		int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);

		// Refinement--make sure the goal isn't part of a word
		while (psn >= 0) {
			// Find the string of length 1 before and after the word
			String before = " ", after = " ";
			if (psn > 0) {
				before = phrase.substring(psn - 1, psn).toLowerCase();
			}
			if (psn + goal.length() < phrase.length()) {
				after = phrase.substring(psn + goal.length(), psn + goal.length() + 1).toLowerCase();
			}

			// If before and after aren't letters, we've found the word
			if (((before.compareTo("a") < 0) || (before.compareTo("z") > 0)) // before is not a letter
					&& ((after.compareTo("a") < 0) || (after.compareTo("z") > 0))) {
				return psn;
			}

			// The last position didn't work, so let's find the next, if there is one.
			psn = phrase.indexOf(goal.toLowerCase(), psn + 1);

		}

		return -1;
	}

	/**
	 * Search for one word in phrase. The search is not case sensitive. This method
	 * will check that the given goal is not a substring of a longer string (so, for
	 * example, "I know" does not contain "no"). The search begins at the beginning
	 * of the string.
	 * 
	 * @param statement the string to search
	 * @param goal      the string to search for
	 * @return the index of the first occurrence of goal in statement or -1 if it's
	 *         not found
	 */
	private int findKeyword(String statement, String goal) {
		return findKeyword(statement, goal, 0);
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
		[     ]
		Say something, please.
		[no]
		Why so negative?
		[test mother test]
		Tell me more about your family.
		[test father test]
		Tell me more about your family.
		[test sister test]
		Tell me more about your family.
		[test brother test]
		Tell me more about your family.
		[I want to test this program.]
		What would it mean to test this program?
		[I want it to succeed this time.]
		Would you really be happy if you had it to succeed this time?
		[I want a success this time.]
		Would you really be happy if you had a success this time?
		[Can you pass these tests?]
		No, I cannot pass these tests. Can you?
		[What is the answer to the ultimate question of life, the universe, and everything?]
		The answer to the ultimate question of life, the universe, and everything is 42.
		[You are not me.]
		What makes you think that I are not you?
		[I have better grammar than you.]
		Why do you have better grammar than me?
		[You should ask the code.]
		Why should I ask the code?
		[Because this test is done. Bye.]
		You don't say.
		[Because this test is done.]
		You don't say.
		[Bye]
*/