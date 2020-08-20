//Television class
public class Television {
	// Instance variables
	private boolean power;
	private int channel;
	private int volume;

	// Constructs new Television
	public Television(boolean p, int c, int v) {
		power = p;
		channel = c;
		volume = v;
	}

	// Binary on/off
	public void powerButton() {
		power = !power;
	}

	// Sets channel
	public void setChannel(int c) {
		if (c >= 1 && c <= 5) {
			channel = c;
		}
	}

	// Changes volume
	public void changeVolume(int v) {
		// Guarantees the volume is only changing by 1 and doesn't go past 0 or 10
		if (Math.abs(v) > 1) {
			return;
		} else if (volume + v < 0) {
			return;
		} else if (volume + v > 10) {
			return;
		} else {
			volume += v;
		}
	}

	// Getters

	public String getPower() {
		if (power) {
			return "on.";
		} else {
			return "off.";
		}
	}

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}
}