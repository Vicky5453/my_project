package my_project;

import java.util.Comparator;

public class BookNameSort implements Comparator<Book> {

	@Override
	public int compare(Book b1, Book b2) {
		int result = b1.getName().compareTo(b2.getName());
		return result;
	}

}
