package my_project;

import java.util.Comparator;

public class PriceSort implements Comparator<Book> {
	@Override
	public int compare(Book p1, Book p2) {
		if (p1.getPrice() < p2.getPrice()) {
			return -1;
		} else if (p1.getPrice() > p2.getPrice()) {
			return 1;
		}
		return 0;
	}

}