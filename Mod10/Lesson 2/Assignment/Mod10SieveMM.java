/*
	Program Name:	Mod10SieveMM
	Author: Mac Mai
	Date:	02/06/2020
	Version:	1.3
	Description:	Finds primes using the Sieve of Eratosthenes
	Problems:	Printing in 15 columns
		Solutions:	I learned how to code and print matrices
	What I Learned:	How to use arrays
*/

//Imports
import java.util.*;

public class Mod10SieveMM {
	public static void main(String[] args) {
		// Creates array of ints
		int allInts[] = new int[1000];
		// Upper bound on the count of primes
		int maxPrimes = (int) (((30 * Math.log(113) / (113)) * allInts.length) / (Math.log(allInts.length)));
		// Creates array for storing primes
		int primes[] = new int[maxPrimes];
		int test = 0;
		int count = 0;

		// Fills int array
		for (int i = 0; i < allInts.length; i++) {
			allInts[i] = i + 1;
		}

		// Sieves
		for (int i = 0; i < allInts.length; i++) {
			// If the next value in the array isn't 0 or 1, then it goes into the primes
			// array and count increments
			if (allInts[i] == 1 || allInts[i] == 0) {
				allInts[i] = 0;
			} else {
				primes[count] = allInts[i];
				count++;
				test = allInts[i];
				// If the next value in the int array is divisible by the test value, then the
				// value in the int array gets set to 0
				for (int j = i; j < allInts.length; j++) {
					if (allInts[j] % test == 0) {
						allInts[j] = 0;
					}
				}
			}
		}

		// Prints
		// Creates matrix of primes with 15 columns and enough rows
		int printPrimes[][] = new int[primes.length / 15 + 1][15];
		// Fills the matrix
		for (int i = 0; i < printPrimes.length - 1; i++) {
			for (int j = 0; j < 15; j++) {
				printPrimes[i][j] = primes[15 * i + j];
			}
		}
		// Prints the matrix, removing trailing zeroes
		for (int i = 0; i < printPrimes.length; i++) {
			for (int j = 0; j < printPrimes[i].length; j++) {
				if (printPrimes[i][j] != 0) {
					System.out.printf("%-3d ", printPrimes[i][j]);
				}
			}
			System.out.println();
		}
	}
}

/*
	Sample Output: [User Input]
		2   3   5   7   11  13  17  19  23  29  31  37  41  43  47
		53  59  61  67  71  73  79  83  89  97  101 103 107 109 113
		127 131 137 139 149 151 157 163 167 173 179 181 191 193 197
		199 211 223 227 229 233 239 241 251 257 263 269 271 277 281
		283 293 307 311 313 317 331 337 347 349 353 359 367 373 379
		383 389 397 401 409 419 421 431 433 439 443 449 457 461 463
		467 479 487 491 499 503 509 521 523 541 547 557 563 569 571
		577 587 593 599 601 607 613 617 619 631 641 643 647 653 659
		661 673 677 683 691 701 709 719 727 733 739 743 751 757 761
		769 773 787 797 809 811 821 823 827 829 839 853 857 859 863
		877 881 883 887 907 911 919 929 937 941 947 953 967 971 977
		983 991 997
*/