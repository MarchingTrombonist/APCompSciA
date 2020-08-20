/*
	1.	How many times would the body of this nested for loop execute? 
		for (int row = 7; row < 17; row++)
			for (int col = 6; col < 15; col++)
		
		90
	2.	How many times would the body of this nested for loop execute?
		for (int row = 5; row <= 11; row++)
			for (int col = 3; col <= 18; col++)
		
		112
*/

public class Mod13PictureLabAssignmentEightMM {
	public static void main(String args) {
		/*
			// Method to mirror snowman arms
			public void mirrorArms() {
				int mirrorPoint = 201;
				Pixel upPixel = null;
				Pixel downPixel = null;
				Pixel[][] pixels = this.getPixels2D();

				// loop through the rows
				for (int row = 159; row < mirrorPoint; row++) {
					// loop from 13 to just before the mirror point
					for (int col = 100; col < 301; col++) {
						upPixel = pixels[row][col];
						downPixel = pixels[mirrorPoint - row + mirrorPoint][col];
						downPixel.setColor(upPixel.getColor());
					}
				}
			}

			// Method to mirror gulls
			public void mirrorGull() {
				int mirrorPoint = 352;
				Pixel leftPixel = null;
				Pixel rightPixel = null;
				Pixel[][] pixels = this.getPixels2D();

				// loop through the rows
				for (int row = 229; row < 329; row++) {
					// loop from 13 to just before the mirror point
					for (int col = 224; col < mirrorPoint; col++) {
						leftPixel = pixels[row][col];
						rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
						rightPixel.setColor(leftPixel.getColor());
					}
				}
			}
		*/
	}
}