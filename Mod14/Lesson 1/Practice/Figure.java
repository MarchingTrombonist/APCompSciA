public class Figure {
	private int offset;

	public Figure() {
		offset = 0;
	}

	public Figure(int theOffset) {
		offset = theOffset;
	}

	public void setOffset(int newOffset) {
		offset = newOffset;
	}

	public int getOffset() {
		return offset;
	}

	/** Draws the figure at lineNumber lines down from the current line. */
	public void drawAt(int lineNumber) {
		int count;
		for (count = 0; count < lineNumber; count++)
			System.out.println();
		drawHere();
	}

	/** Draws the figure at the current line. */
	public void drawHere() {
		int count;
		for (count = 0; count < offset; count++)
			System.out.print(' ');
		System.out.println('*');
	}
}
