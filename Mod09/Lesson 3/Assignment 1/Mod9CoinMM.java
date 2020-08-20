/*
	Program Name:	Mod9CoinMM
	Author: Mac Mai
	Date:	01/14/2020
	Version:	1.3
	Description:	Flips 3 coins
	Problems:	Testing if all three coins were the same
		Solutions:	
	What I Learned:	How to use methods
*/

public class Mod9CoinMM {
	public static void main(String[] args) {
		// Creates 3 coins
		Coin coin1 = new Coin();
		Coin coin2 = new Coin();
		Coin coin3 = new Coin();

		// Counts flips
		int flips = 0;

		// Loops until all 3 match
		do {
			coin1.setFlip();
			coin2.setFlip();
			coin3.setFlip();
			flips += 1;
			System.out.printf("coin 1 is on %s, coin 2 is on %s, coin 3 is on %s%n", coin1.getFlipString(), coin2.getFlipString(), coin3.getFlipString());
		} while (!((coin1.getFlip() == coin2.getFlip()) && (coin2.getFlip() == coin3.getFlip())));
		System.out.println("The coins were flipped a total of " + flips + " times.");
	}
}

/*
	Sample Output: [User Input]
		coin 1 is on tails, coin 2 is on heads, coin 3 is on heads
		coin 1 is on heads, coin 2 is on heads, coin 3 is on heads
		The coins were flipped a total of 2 times.

		coin 1 is on tails, coin 2 is on tails, coin 3 is on tails
		The coins were flipped a total of 1 times.
*/