public class Mod13PictureLabAssignmentNineMM {
	public static void main(String args) {
		/*
			// Method to make collage
			public void myCollage() {
				Picture flower1 = new Picture("pixLab/images/flower1.jpg");
				Picture flower2 = new Picture("pixLab/images/flower2.jpg");
				this.copy2(flower1,0,100, 0, 100);
				int mirrorPoint = 98;
				Pixel rightPixel = null;
				Pixel leftPixel = null;
				Pixel[][] pixels = this.getPixels2D();   
				for (int row = 0; row < 98; row++)
				{
					for (int col = 0; col < 88; col++)
					{
						rightPixel = pixels[row][col];      
						leftPixel = pixels[mirrorPoint - row + mirrorPoint][col];
						leftPixel.setColor(rightPixel.getColor());
					}
				}
				Picture flowerNoBlue = new Picture(flower2);
				flowerNoBlue.zeroBlue();
				this.copy2(flowerNoBlue,300,350,80,500);
				
				Picture flowermirror = new Picture(flower2);
				flowermirror.mirrorVertical();
				this.copy2(flowermirror, 100, 300, 80, 300);
				
				this.write("pixLab/images/collage.jpg");
				this.explore();
			}
			
			
			/** Method to show large changes in color 
				* @param edgeDist the distance for finding edges
				*/
		/*
			public void edgeDetection(int edgeDist) {
				Pixel leftPixel = null;
				Pixel rightPixel = null;
				Pixel topPixel = null;
				Pixel bottomPixel = null;
				
				Pixel[][] pixels = this.getPixels2D();
				for (int row = 0; row < pixels.length - 1; row++) {
					for (int col = 0; col < pixels[0].length-1; col++) {
						leftPixel = pixels[row][col];
						rightPixel = pixels[row][col+1];
						topPixel = pixels[row][col];
						bottomPixel = pixels[row + 1][col];
						if (leftPixel.colorDistance(rightPixel.getColor()) > edgeDist || topPixel.colorDistance(bottomPixel.getColor()) > edgeDist) {
							leftPixel.setColor(Color.BLACK);
						} else {
							leftPixel.setColor(Color.WHITE);
						}
					}
				}
			}

			// Method to test myCollage
			public static void testMyCollage()
			{
				Picture beach = new Picture("pixLab/images/beach.jpg");
				beach.myCollage();
			}

			/** Method to test edgeDetection *//*
			public static void testEdgeDetection() {
				Picture swan = new Picture("pixLab/images/swan.jpg");
				swan.edgeDetection(10);
				swan.explore();
			}
		*/
	}
}