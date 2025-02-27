import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture {
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture() {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName) {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width) {
    // let the parent class handle this width and height
  	super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture) {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image) {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString() {
    String output = "Picture, filename " + getFileName() + " height " + getHeight() + " width " + getWidth();
    return output;
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue() {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setBlue(0);
			}
		}
  }

	// Method to set red and green to 0
	public void keepOnlyBlue() {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setRed(0);
				pixelObj.setGreen(0);
			}
		}
  }

	// Method to negate an image
	public void negate() {
		Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setRed(255 - pixelObj.getRed());
				pixelObj.setGreen(255 - pixelObj.getGreen());
				pixelObj.setBlue(255 - pixelObj.getBlue());
			}
		}
	}

	// Method to make an image grayscale
	public void grayscale() {
		Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				int gray = (pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue()) / 3;
				pixelObj.setRed(gray);
				pixelObj.setGreen(gray);
				pixelObj.setBlue(gray);
			}
		}
	}

	// Method to fix underwater pictures
	public void fixUnderwater() {
		Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setGreen(pixelObj.getGreen() - 100);
				pixelObj.setBlue(pixelObj.getBlue() - 100);
				pixelObj.setRed(pixelObj.getRed() + 25);
			}
		}
	}
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < width / 2; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][width - 1 - col];
				rightPixel.setColor(leftPixel.getColor());
			}
    } 
  }

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
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple() {
		int mirrorPoint = 276;
		Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();

    // loop through the rows
    for (int row = 27; row < 97; row++) {
			// loop from 13 to just before the mirror point
			for (int col = 13; col < mirrorPoint; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
				rightPixel.setColor(leftPixel.getColor());
				count++;
			}
		}
		System.out.println(count);
  }

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
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, int startRow, int startCol) {
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length && toRow < toPixels.length; fromRow++, toRow++) {
			for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length && toCol < toPixels[0].length; fromCol++, toCol++) {
				fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

	// Method to copy pieces
	  public void copy2(Picture fromPic, int startRow, int startCol, int endRow, int endCol) {
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length && toRow < endRow; fromRow++, toRow++) {
			for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length && toCol < endCol; fromCol++, toCol++) {
				fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  /** Method to create a collage of several pictures */
  public void createCollage() {
    Picture flower1 = new Picture("pixLab/images/flower1.jpg");
    Picture flower2 = new Picture("pixLab/images/flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("pixLab/images/collage.jpg");
  }

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
  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) {
		Picture beach = new Picture("pixLab/images/beach.jpg");
		beach.explore();
		beach.zeroBlue();
		beach.explore();
	}
  
} // this } is the end of class Picture, put all new methods before this
