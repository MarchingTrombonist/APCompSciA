public class Mod13PictureLabAssignmentSevenMM {
	public static void main(String[] args) {
		/*
			// Method that mirrors right to left
			public void mirrorVerticalRightToLeft() {
				Pixel[][] pixels = this.getPixels2D();
				Pixel leftPixel = null;
				Pixel rightPixel = null;
				int width = pixels[0].length;
				for (int row = 0; row < pixels.length; row++) {
					for (int col = 0; col < width / 2; col++) {
						leftPixel = pixels[row][col];
						rightPixel = pixels[row][width - 1 - col];
						leftPixel.setColor(rightPixel.getColor());
					}
				} 
			}

			// Method that mirrors top to bottom
			public void mirrorHorizontal() {
				Pixel[][] pixels = this.getPixels2D();
				Pixel topPixel = null;
				Pixel bottomPixel = null;
				int width = pixels[0].length;
				int height = pixels.length;
				for (int row = 0; row < height / 2; row++) {
					for (int col = 0; col < width; col++) {
						topPixel = pixels[row][col];
						bottomPixel = pixels[height - 1 - row][col];
						bottomPixel.setColor(topPixel.getColor());
					}
				} 
			}

			// Method that mirrors bottom to top
			public void mirrorHorizontalBotToTop() {
				Pixel[][] pixels = this.getPixels2D();
				Pixel topPixel = null;
				Pixel bottomPixel = null;
				int width = pixels[0].length;
				int height = pixels.length;
				for (int row = 0; row < height / 2; row++) {
					for (int col = 0; col < width; col++) {
						topPixel = pixels[row][col];
						bottomPixel = pixels[height - 1 - row][col];
						topPixel.setColor(bottomPixel.getColor());
					}
				} 
			}

			// Method that mirrors diagonally
			// The coding gods must be pleased with me because this worked the first time I ran it
			public void mirrorDiagonal() {
				Pixel[][] pixels = this.getPixels2D();
				Pixel botLeftPixel = null;
				Pixel topRightPixel = null;
				int width = pixels[0].length;
				int height = pixels.length;

				// Makes a square
				if (height <= width) {
					width = height;
				} else {
					height = width;
				}

				// Switches pixels
				for (int row = 0; row < height; row++) {
					for (int col = 0; col < width; col++) {
						botLeftPixel = pixels[col][row];
						topRightPixel = pixels[row][col];
						if (col > row) {
							topRightPixel.setColor(botLeftPixel.getColor());
						}
					}
				}
			}



			// Method to test mirrorVerticalRightToLeft
			public static void testMirrorVerticalRightToLeft() {
				Picture caterpillar = new Picture("pixLab/images/caterpillar.jpg");
				caterpillar.mirrorVerticalRightToLeft();
				caterpillar.explore();
			}

			// Method to test mirrorHorizontal
			public static void testMirrorHorizontal() {
				Picture caterpillar = new Picture("pixLab/images/caterpillar.jpg");
				caterpillar.mirrorHorizontal();
				caterpillar.explore();
			}

			// Method to test mirrorHorizontalBotToTop
			public static void testMirrorHorizontalBotToTop() {
				Picture caterpillar = new Picture("pixLab/images/caterpillar.jpg");
				caterpillar.mirrorHorizontalBotToTop();
				caterpillar.explore();
			}

			// Method to test mirrorDiagonal
			public static void testMirrorDiagonal() {
				Picture beach = new Picture("pixLab/images/beach.jpg");
				beach.mirrorDiagonal();
				beach.explore();
			}
		*/
	}
}