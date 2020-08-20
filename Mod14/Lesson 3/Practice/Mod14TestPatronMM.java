/*
	Program Name:	Mod14TestPatronMM
	Author: Mac Mai
	Date:	04/09/2020
	Version:	1.5
	Description: Library	
	Problems:	Trying to watch a video with barely readable pixelated code
		Solutions:	Watching the four videos over and over again to find the one line of code I missed
	What I Learned:	How to use extends and super
*/

import java.util.Calendar;

public class Mod14TestPatronMM {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		Patron patron1 = new Patron();
		
		Media book1 = new Book();
		Media movie1 = new Movie();
		Media audioBook1 = new AudioBook();

		book1.setTitle("Title1");
		((Book) book1).setAuthor("Author1");

		movie1.setTitle("Title1");
		((Movie) movie1).setYear(2001);

		audioBook1.setTitle("Title1");
		((AudioBook) audioBook1).setNarr("Narrator1");
		((AudioBook) audioBook1).setYear(2001);

		Media book2 = new Book("Title2", "Author2", today);
		Media movie2 = new Movie("Title2", 2002, today);
		Media audioBook2 = new AudioBook("Title2", "Narrator2", 2002, today);

		System.out.println(book1);
		System.out.println(movie1);
		System.out.println(audioBook1);
		System.out.println(book2);
		System.out.println(movie2);
		System.out.println(audioBook2);
	}
}

/*
	Sample Output: [User Input]
		The specs of this book are: 
				Title: Title1
				Author: Author1
				Return date: Fri May 01 00:03:59 UTC 2020
		The specs of this movie are: 
				Title: Title1
				Year released: 2001
				Return date: Fri Apr 17 00:03:59 UTC 2020
		The specs of this audiobook are: 
				Title: Title1
				Narrator : Narrator1
				Year: 2001
				Return date: Fri Apr 24 00:03:59 UTC 2020
		The specs of this book are: 
				Title: Title2
				Author: Author2
				Return date: Fri May 01 00:03:59 UTC 2020
		The specs of this movie are: 
				Title: Title2
				Year released: 2002
				Return date: Fri Apr 17 00:03:59 UTC 2020
		The specs of this audiobook are: 
				Title: Title2
				Narrator : Narrator2
				Year: 2002
				Return date: Fri Apr 24 00:03:59 UTC 2020
*/