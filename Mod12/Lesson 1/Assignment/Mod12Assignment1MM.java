/*
	Program Name:	Mod12Assignment1MM
	Author: Mac Mai
	Date:	03/10/2020
	Version:	1.1
	Description:	Prints array and sums
	Problems:	No problems
		Solutions:	N/A
	What I Learned:	How to print arrays
*/

import java.io.*;

public class Mod12Assignment1MM {
	public static void main(String[] args) {
    int[][] data = {
			{3, 2, 5},
      {1, 4, 4, 8, 13},
			{9, 1, 0, 2},
      {0, 2, 6, 3, -1, -8}
		};

    // declare the sum
    double sum;
    
    // compute the sums for each row
    for (int row = 0; row < data.length; row++) {
      // initialize the sum
			sum = 0;
      // compute the sum for this row
      for (int col = 0; col < data[row].length; col++) {
        sum += data[row][col];
      }
      
      // write the sum for this row
      System.out.println(sum);
    }
    
		// Finds longest row
		int longest = 0;
		for (int[] row:data) {
			if (row.length > longest) {
				longest = row.length;
			}
		}


		for (int col = 0; col < longest; col++) {
      // initialize the sum
			sum = 0;
      // compute the sum for this column
      for (int row = 0; row < data.length; row++) {
				// if there's no cell then it's 0
				try {
					sum += data[row][col];
				} catch (Exception nullPException) {
					sum += 0;
				}
      }
      
      // write the sum for this column
      System.out.println(sum);
    }
  }
}

/*
	Sample Output: [User Input]
		10.0
		30.0
		12.0
		2.0
		13.0
		9.0
		15.0
		13.0
		12.0
		-8.0
*/