public class LeftArrow extends Figure {
	private int tailLength;
	private int baseWidth;

	public LeftArrow(int length, int width) {
		// Checks if width is odd
		if (width % 2 == 0) {
			System.out.println("Invalid width; width must be odd");System.exit(0);
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
		spaces(0);
		spaces(w - 1);
		int count;
		for (count = 0; count < tailLength; count++) {
			System.out.print('*');
		}
		System.out.println();
	}

	// Draws top half
	private void top() {
		int w = (baseWidth - 1) / 2;
		spaces(w);
		System.out.println();
		for (int i = 1; i <= w - 1; i++) {
			spaces(w - i);
			spaces(i - 1);
			System.out.println();
		}
	}

	// Draws bottom half
	private void bottom() {
		int w = (baseWidth - 1) / 2;
		for (int i = w - 1; i >= 1; i--) {
			spaces(w - i);
			spaces(i - 1);
			System.out.println();
		}
		spaces(w);
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