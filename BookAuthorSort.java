package my_project;

import java.util.Comparator;

public class BookAuthorSort implements Comparator<Book> {
	@Override
	public int compare(Book A1, Book A2) {
		int result = A1.getAuthor().compareTo(A2.getAuthor());
		return result;
		
	}

}
