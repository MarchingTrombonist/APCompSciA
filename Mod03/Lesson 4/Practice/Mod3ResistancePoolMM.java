/*
	Program Name:	Mod3ResistancePoolMM
	Author:	Mac Mai
	Date:	09/16/2019
	Version:	1.1
	Description:	Calculates the area between two circles
	Problems:	I didn't realize that I didn't need to import java.util.Math, so I kept getting an error
		Solutions:	I removed the import line
	What I Learned:	How to use more math functions
*/

public class Mod3ResistancePoolMM {
	public static void main(String[] args) {
		// Declares vars
		double poolDia, islandDia, poolRad, islandRad, poolArea, islandArea, tiledArea;
		// Defines diameters
		poolDia = 8.32;
		islandDia = 1.91;
		// Defines radii
		poolRad = poolDia / 2;
		islandRad = islandDia / 2;
		// Calculates areas
		poolArea = Math.PI * Math.pow(poolRad, 2);
		islandArea = Math.PI * Math.pow(islandRad, 2);
		tiledArea = poolArea - islandArea;
		// Prints statement
		System.out.println("A resistance pool with a diameter of " + poolDia
				+ " meters that contains a circular island with a diamteter of " + islandDia + " meters has " + tiledArea
				+ " square meters that needs tile.");
	}
}

/*
	Sample Output: [User Input]
		A resistance pool with a diameter of 8.32 meters that contains a circular island with a diamteter of 1.91 meters has 51.5019347860733 square meters that needs tile.
*/