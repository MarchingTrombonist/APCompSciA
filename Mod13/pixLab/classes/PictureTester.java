/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester {
	/** Method to test zeroBlue */
	public static void testZeroBlue() {
		Picture beach = new Picture("pixLab/images/beach.jpg");
		beach.explore();
		beach.zeroBlue();
		beach.explore();
	}

	// Method to test keepOnlyBlue
	public static void testKeepOnlyBlue() {
		Picture beach = new Picture("pixLab/images/beach.jpg");
		beach.keepOnlyBlue();
		beach.explore();
	}

	// Method to test negate
	public static void testNegate() {
		Picture beach = new Picture("pixLab/images/beach.jpg");
		beach.negate();
		beach.explore();
	}

	// Method to test grayscale
	public static void testGrayscale() {
		Picture beach = new Picture("pixLab/images/beach.jpg");
		beach.grayscale();
		beach.explore();
	}

	// Method to test fixUnderwater
	public static void testFixUnderwater() {
		Picture water = new Picture("pixLab/images/water.jpg");
		water.fixUnderwater();
		water.explore();
	}

	/** Method to test mirrorVertical */
	public static void testMirrorVertical() {
		Picture caterpillar = new Picture("pixLab/images/caterpillar.jpg");
		caterpillar.explore();
		caterpillar.mirrorVertical();
		caterpillar.explore();
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

	/** Method to test mirrorTemple */
	public static void testMirrorTemple() {
		Picture temple = new Picture("pixLab/images/temple.jpg");
		temple.explore();
		temple.mirrorTemple();
		temple.explore();
	}

	// Method to test mirrorArms
	public static void testMirrorArms() {
		Picture snowman = new Picture("pixLab/images/snowman.jpg");
		snowman.mirrorArms();
		snowman.explore();
	}

	// Method to test mirrorGull
	public static void testMirrorGull() {
		Picture seagull = new Picture("pixLab/images/seagull.jpg");
		seagull.mirrorGull();
		seagull.explore();
	}

	// Method to test copy2
	public static void testCopy2() {
		Picture beach = new Picture("pixLab/images/beach.jpg");
		beach.copy2(beach, 10, 20, 20, 30);
		beach.explore();
	}

	/** Method to test the collage method */
	public static void testCollage() {
		Picture canvas = new Picture("pixLab/images/640x480.jpg");
		canvas.createCollage();
		canvas.explore();
	}

	// Method to test myCollage
	public static void testMyCollage()
  {
    Picture beach = new Picture("pixLab/images/beach.jpg");
		beach.myCollage();
  }

	/** Method to test edgeDetection */
	public static void testEdgeDetection() {
		Picture swan = new Picture("pixLab/images/swan.jpg");
		swan.edgeDetection(10);
		swan.explore();
	}

	/**
	 * Main method for testing. Every class can have a main method in Java
	 */
	public static void main(String[] args) {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    // testZeroBlue();
    // testKeepOnlyBlue();
    // testKeepOnlyRed();
    // testKeepOnlyGreen();
    // testNegate();
    // testGrayscale();
    // testFixUnderwater();
    // testMirrorVertical();
    // testMirrorVerticalRightToLeft();
		// testMirrorHorizontal();
		// testMirrorHorizontalBotToTop();
    // testMirrorTemple();
    // testMirrorArms();
    // testMirrorGull();
    // testMirrorDiagonal();
    // testCollage();
		testMyCollage();
    // testCopy();
		// testCopy2();
    // testEdgeDetection();
    // testEdgeDetection2();
    // testChromakey();
    // testEncodeAndDecode();
    // testGetCountRedOverValue(250);
    // testSetRedToHalfValueInTopHalf();
    // testClearBlueOverValue(200);
    // testGetAverageForColumn(0);
  }
}