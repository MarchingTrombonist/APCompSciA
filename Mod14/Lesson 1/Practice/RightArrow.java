public class RightArrow extends Figure {
	private int tailLength;
	private int baseWidth;

	public RightArrow(int length, int width) {
		// Checks if width is odd
		if (width % 2 == 0) {
			System.out.println("Invalid width; width must be odd");
			System.exit(0);
		}
		tailLength = length;
		baseWidth = width;
	}

	public void drawHere() {
		// Draws top half, middle line, bottom half
		top();
		drawHorizontalLine();
		bottom();
	}

	// Draws middle line
	private void drawHorizontalLine() {
		int w = (baseWidth - 1) / 2;
		int count;
		for (count = 0; count < tailLength; count++) {
			System.out.print('*');
		}
		spaces(0);
		spaces(w - 1);
		System.out.println();
	}

	// Draws top half
	private void top() {
		int w = (baseWidth - 1) / 2;
		spaces(tailLength);
		System.out.println();
		for (int i = 1; i <= w - 1; i++) {
			spaces(tailLength);
			spaces(i - 1);
			System.out.println();
		}
	}

	// Draws bottom half
	private void bottom() {
		int w = (baseWidth - 1) / 2;
		for (int i = w - 1; i >= 1; i--) {
			spaces(tailLength);
			spaces(i - 1);
			System.out.println();
		}
		spaces(tailLength);
		System.out.println();
	}

	// Prints spaces followed by a *
	private static void spaces(int number) {
		int count;
		for (count = 0; count < number; count++) {
			System.out.print(' ');
		}
		System.out.print('*');
	}
}