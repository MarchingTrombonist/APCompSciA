public class Box extends Figure {
	private int height;
	private int width;

	public Box() {
		super();
		height = 0;
		width = 0;
	}

	public void reset(int newOffset, int newHeight, int newWidth) {
		setOffset(newOffset);
		height = newHeight;
		width = newWidth;
	}
	// Draws the figure at the current line

	public void drawHere() {
		drawHorizontalLine();
		drawSides();
		drawHorizontalLine();
	}

	private void drawHorizontalLine() {
		spaces(getOffset());
		int count;
		for (count = 0; count < width; count++)
			System.out.print('-');
		System.out.println();
	}

	private void drawSides() {
		int count;
		for (count = 0; count < (height - 2); count++)
			drawOneLineOfSides();
	}

	private void drawOneLineOfSides() {
		spaces(getOffset());
		System.out.print('|');
	}

	// sets the indicated number of spaces
	private static void spaces(int number)
	// this method was made static because it does not need a calling object. The
	// class
	// would work fine if spaces were not made static but it is clearer if you make
	// spaces
	// static
	{
		int count;
		for (count = 0; count < number; count++)
			System.out.print(' ');
	}
}