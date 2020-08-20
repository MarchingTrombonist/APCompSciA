/*
	Program Name:	Mod14AnnoyingArrowsMM
	Author: Mac Mai
	Date:	04/07/2020
	Version:	1.4
	Description:	Makes arrows
	Problems:	Printing the arrowheads
		Solutions:	Printed it in three parts
	What I Learned:	How to use extends
*/

public class Mod14AnnoyingArrowsMM {
	public static void main(String[] args) {
		LeftArrow test = new LeftArrow(12,13);
		test.drawHere();
		RightArrow test2 = new RightArrow(12, 13);
		test2.drawHere();
	}
}

/*
	Sample Output: [User Input]
		      *
		     **
		    * *
		   *  *
		  *   *
		 *    *
		*     *************
		 *    *
		  *   *
		   *  *
		    * *
		     **
		      *
		            *
		            **
		            * *
		            *  *
		            *   *
		            *    *
		*************     *
		            *    *
		            *   *
		            *  *
		            * *
		            **
		            *
*/