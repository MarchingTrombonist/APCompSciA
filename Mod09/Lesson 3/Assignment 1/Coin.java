//Imports
import java.util.*;

//Coin class
public class Coin {
	// Instance
	private boolean heads;
	private Random random = new Random();

	// Creates unflipped coin
	public Coin() {
		heads = true;
	}

	// Gets flip as boolean
	public boolean getFlip() {
		return heads;
	}

	// Gets flip as String
	public String getFlipString() {
		if (heads) {
			return "heads";
		} else {
			return "tails";
		}
	}

	// Flips coin
	public void setFlip() {
		heads = random.nextBoolean();
	}
}