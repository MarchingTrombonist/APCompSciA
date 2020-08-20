/*
	Program Name:	Mod11ArrayListPracticeMM
	Author: Mac Mai
	Date:	03/03/2020
	Version:	1.1
	Description:	Does ArrayLists
	Problems:	No problems
		Solutions:	N/A
	What I Learned:	How to use ArrayLists
*/

// Imports
import java.io.*;
import java.util.*;

public class Mod11ArrayListPracticeMM {
	public static void main(String[] args) {
		// Creates ArrayList and List
		ArrayList aryLst1 = new ArrayList();
		System.out.println(aryLst1);
		List aryLst2 = new ArrayList();
		System.out.println(aryLst2);
		
		// Parameters
		ArrayList<String> aryLstStr = new ArrayList<String>();
		System.out.println(aryLstStr);
		List<Integer> aryLst = new ArrayList<Integer>();
		System.out.println(aryLst);

		// Methods
		aryLst.add(13);
		System.out.println(aryLst);
		aryLst.add(12);
		System.out.println(aryLst);
		aryLst.add(11);
		System.out.println(aryLst);
		aryLst.add(3,13);
		System.out.println(aryLst);
		int q = aryLst.get(3);
		System.out.println(aryLst);
		int q2 = aryLst.remove(3);
		System.out.println(aryLst);

		// Iterators	
		List lst1 = new ArrayList();
		System.out.println(lst1);
		Iterator itr1 = lst1.iterator();
		System.out.println(lst1);
		List lst2 = new ArrayList();
		System.out.println(lst2);
		ListIterator itr2 = lst2.listIterator();
		System.out.println(lst2);

		// Iterators
		List lst = new ArrayList();
		System.out.println(lst);
		lst.add(0);
		System.out.println(lst);
		lst.add(1);
		System.out.println(lst);
		lst.add(2);
		System.out.println(lst);

		ListIterator itr = lst.listIterator();

		for (itr.next(); itr.hasNext(); itr.next()) {
			System.out.println(1);
		}

		// Prints
		ArrayList<String> aryLst3 = new ArrayList<String>();
		System.out.println(aryLst3);
		aryLst3.add("Hello");
		System.out.println(aryLst3);
		aryLst3.add("Goodbye");
		System.out.println(aryLst3);
		Iterator itrStr = aryLst3.iterator();
		String s = (String)itrStr.next();
		System.out.println(s);

		// Prints
		ArrayList<String> aryLst4 = new ArrayList<String>();
		System.out.println(aryLst4);
		aryLst4.add("Hello");
		System.out.println(aryLst4);
		aryLst4.add("Goodbye");
		System.out.println(aryLst4);
		Iterator<String> itrStr2 = aryLst4.iterator();
		String s2 = itrStr2.next();
		System.out.println(s2);
	}
}

/*
	Sample Output: [User Input]
		[]
		[]
		[]
		[]
		[13]
		[13, 12]
		[13, 12, 11]
		[13, 12, 11, 13]
		[13, 12, 11, 13]
		[13, 12, 11]
		[]
		[]
		[]
		[]
		[]
		[0]
		[0, 1]
		[0, 1, 2]
		1
		1
		[]
		[Hello]
		[Hello, Goodbye]
		Hello
		[]
		[Hello]
		[Hello, Goodbye]
		Hello
*/