/*
	Program Name:	Mod12Assignment2MM
	Author: Mac Mai
	Date:	03/10/2020
	Version:	1.1
	Description:	Prints max/min of array
	Problems:	No problems
		Solutions:	N/A
	What I Learned:	How to find the max and min
*/

import java.io.*;

public class Mod12Assignment2MM {
	public static void main(String[] args) {
    int[][] data = {
			{3, 2, 5},
      {1, 4, 4, 8, 13},
			{9, 1, 0, 2},
      {0, 2, 6, 3, -1, -8}
		};

    // declare the min/max
    double max = data[0][0];
		double min = data[0][0];
    
		// Finds min and max of whole array
		for (int row = 0; row < data.length; row++) {
      for (int col = 0; col < data[row].length; col++) {
        if (max < data[row][col]) {
					max = data[row][col];
				}
				if (min > data[row][col]) {
					min = data[row][col];
				}
      }
		}

		 // prints
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);


		// Finds min and max of each row
		for (int row = 0; row < data.length; row++) {
			max = data[row][0];
			min = data[row][0];
      for (int col = 0; col < data[row].length; col++) {
        if (max < data[row][col]) {
					max = data[row][col];
				}
				if (min > data[row][col]) {
					min = data[row][col];
				}
      }

			// Prints
			System.out.println("Max: " + max);
			System.out.println("Min: " + min);
    }
  }
}

/*
	Sample Output: [User Input]
		Max: 13.0
		Min: -8.0
		Max: 5.0
		Min: 2.0
		Max: 13.0
		Min: 1.0
		Max: 9.0
		Min: 0.0
		Max: 6.0
		Min: -8.0
*/