public class CharCount {
	// Instance variables
	private String input;
	private int vowels;
	private int consonants;

	// Default
	public CharCount() {
		input = null;
	}

	// Normal
	public CharCount(String in) {
		input = in;
	}

	// Tests if vowel
	public boolean isVowel(char ch) {
		ch = Character.toUpperCase(ch);
		return Character.isLetter(ch) && (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
	}

	// Tests if consonant
	public boolean isConsonant(char ch) {
		ch = Character.toUpperCase(ch);
		return Character.isLetter(ch) && !(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
	}

	// Counts vowels
	public int countVowels() {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (isVowel(input.charAt(i))) {
				count++;
			}
		}
		return count;
	}

	// Counts consonants
	public int countConsonants() {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (isConsonant(input.charAt(i))) {
				count++;
			}
		}
		return count;
	}

	// Getters
	public String getInput() {
		return input;
	}
}