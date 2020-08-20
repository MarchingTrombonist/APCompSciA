/*
	Program Name:	Mod5TextFileMM
	Author: Mac Mai
	Date:	10/17/2019
	Version:	1.1
	Description:	Reads files
	Problems:	'throws' wasn't working
		Solutions:	I put it in a try catch instead
	What I Learned:	How to read files
*/

//Imports
import java.util.*;
import java.io.*;

public class Mod5TextFileMM {
	public static void main(String[] args) {
		// Catches errors
		try {
			// Creates scanner and reads file
			Scanner sf = new Scanner(new File("Lesson 08/Practice/myData.in"));
			sf.close();

			// Creates scanner and reads file
			Scanner sf2 = new Scanner(new File("Lesson 08/Practice/NumData.in"));

			// Index counter and array
			int maxIndx = -1;
			String text[] = new String[100];

			// Puts the next line into the array
			while (sf2.hasNext()) {
				maxIndx++;
				text[maxIndx] = sf2.nextLine();
				System.out.println(text[maxIndx]);
			}

			// Creates answer and sum
			String answer = "";
			int sum = 0;

			// Adds ints and outputs sum
			for (int j = 0; j <= maxIndx; j++) {
				Scanner sc = new Scanner(text[j]);
				sum = 0;
				answer = "";

				while (sc.hasNext()) {
					int i = sc.nextInt();
					answer += "+" + i;
					sum += i;
				}
				answer += "=" + sum;
				System.out.println(answer);
			}
			sf2.close();
			// Prints if errors
		} catch (IOException e) {
			System.out.println("Something went wrong");
		}
	}
}

/*
	Sample Output: [User Input]
		12 10 3 5
		18 1 5 92 6 8
		2 9 3 22 4 11 7
		+12+10+3+5=30
		+18+1+5+92+6+8=130
		+2+9+3+22+4+11+7=58
*/