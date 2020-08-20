import java.util.*;

//Basketball Class
public class Basketball {
	// Instance vars
	private String name1;
	private int score1;
	private int rand1;
	private String name2;
	private int score2;
	private int rand2;
	private int maxScore;

	// Random
	private Random rand = new Random();

	// Constructor
	public Basketball() {
		name1 = "";
		score1 = 0;
		rand1 = 0;
		name2 = "";
		score2 = 0;
		rand2 = 0;
		maxScore = 0;
	}

	// Scores points and returns how many points were scored
	public int scorePoints1() {
		rand1 = rand.nextInt(3) + 1;
		score1 += rand1;
		return rand1;
	}

	public int scorePoints2() {
		rand2 = rand.nextInt(3) + 1;
		score2 += rand2;
		return rand2;
	}

	// Returns status of the game
	public String gameStatus() {
		if (score1 > score2) {
			if (score1 >= maxScore) {
				return name1 + " is the winner.";
			} else {
				return name1 + " is winning.";
			}
		} else if (score2 > score1) {
			if (score2 >= maxScore) {
				return name2 + " is the winner.";
			} else {
				return name2 + " is winning.";
			}
		} else {
			if (score1 >= maxScore) {
				return "The game ends in a tie.";
			} else {
				return "Teams are tied.";
			}
		}
	}

	// Returns if game is done
	public boolean getGameDone() {
		return ((score1 >= maxScore) || (score2 >= maxScore));
	}

	// Setters
	public void setName1(String n) {
		name1 = n;
	}

	public void setName2(String n) {
		name2 = n;
	}

	public void setMaxScore(int ms) {
		maxScore = ms;
	}

	// Getters
	public String getName1() {
		return name1;
	}

	public String getName2() {
		return name2;
	}

	public int getPoints1() {
		return score1;
	}

	public int getPoints2() {
		return score2;
	}
}