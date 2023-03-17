package my_project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BookClass {
	ArrayList<Book> book = new ArrayList<Book>();

	public static void main(String[] args) {
		BookClass sk = new BookClass();
		sk.Showbooks();
		System.out.println("1,Sort by price.");
		System.out.println("2,Sort by author.");
		System.out.println("3,Sort by price range.");
		System.out.println("4,Search by Book");
		System.out.println("5,back to find");
		System.out.println("__________________");
		System.out.println("Please Select an Option");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		switch (option) {
		case 1:
			sk.sortbyprice();
			// sk.Showbooks();
			System.out.println("1,Sort by price.");
			System.out.println("2,Sort by author.");
			System.out.println("3,Sort by pricerange.");
			System.out.println("4,Search by Book");
			System.out.println("5,back to find");
			System.out.println("__________________");
			System.out.println("Please Select an Option");
			Scanner sc1 = new Scanner(System.in);
			int option1 = sc1.nextInt();
			switch (option1) {
			case 1:
				sk.sortbyprice();

				break;
			case 2:
				sk.sortbyAuthor();
				break;
			case 3:
				sk.sortbypricerange();
				break;
			case 4:
				sk.searchBook();
				break;
			}
			break;
		case 2:
			sk.sortbyAuthor();
			// sk.Showbooks();
			System.out.println("1,Sort by price.");
			System.out.println("2,Sort by author.");
			System.out.println("3,Sort by pricerange.");
			System.out.println("4,Search by Book");
			System.out.println("5,back to find");
			System.out.println("__________________");
			System.out.println("Please Select an Option");
			Scanner sc2 = new Scanner(System.in);
			int option2 = sc2.nextInt();
			switch (option2) {
			case 1:
				sk.sortbyprice();
				break;
			case 2:
				sk.sortbyAuthor();
				break;
			case 3:
				sk.sortbypricerange();
				break;
			case 4:
				sk.searchBook();
				break;
			}
			break;
		case 3:
			sk.sortbypricerange();
			// sk.Showbooks();
			System.out.println("1,Sort by price.");
			System.out.println("2,Sort by author.");
			System.out.println("3,Sort by pricerange.");
			System.out.println("4,Search by Book");
			System.out.println("5,back to find");
			System.out.println("__________________");
			System.out.println("Please Select an Option");
			Scanner sc3 = new Scanner(System.in);
			int option3 = sc3.nextInt();
			switch (option3) {
			case 1:
				sk.sortbyprice();
				break;
			case 2:
				sk.sortbyAuthor();
				break;
			case 3:
				sk.sortbypricerange();
				break;
			case 4:
				sk.searchBook();
				break;
			}
			break;
		case 4:
			sk.searchBook();
			// sk.Showbooks();
			System.out.println("1,Sort by price.");
			System.out.println("2,Sort by author.");
			System.out.println("3,Sort by pricerange.");
			System.out.println("4,Search by Book");
			System.out.println("5,back to find");
			System.out.println("__________________");
			System.out.println("Please Select an Option");
			Scanner sc4 = new Scanner(System.in);
			int option4 = sc4.nextInt();
			switch (option4) {
			case 1:
				sk.sortbyprice();
				break;
			case 2:
				sk.sortbyAuthor();
				break;
			case 3:
				sk.sortbypricerange();
				break;
			case 4:
				sk.searchBook();
				break;
			}
			break;
		}
	}

	private void searchBook() {
		System.out.println("Enter book Name");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		for (int i = 0; i < book.size(); i++) {
			String bookname = book.get(i).getName();
			if (bookname.equalsIgnoreCase(name)) {
				System.out.println(book.get(i));
			}
		}

	}

	private void sortbypricerange() {
		PriceSort price = new PriceSort();
		System.out.println("Given your price range");
		System.out.println(" Enter Minimum price:");
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		System.out.println("Enter Maximum price:");
		int max = sc.nextInt();
		for (int i = 0; i < book.size(); i++) {
			int price1 = book.get(i).getPrice();
			if (price1 >= min && price1 <= max) {
				System.out.println(book.get(i));
			}
		}

	}

	private void sortbyAuthor() {
		System.out.println("Enter author name:");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		for (int i = 0; i < book.size(); i++) {
			String bookname = book.get(i).getAuthor();
			if (bookname.equalsIgnoreCase(name))
				;
			System.out.println(book.get(i));
		}
	}

	private void sortbyprice() {
		PriceSort price = new PriceSort();
		Collections.sort(book, price);
		for (Book books : book) {
			System.out.println(books);
		}

	}

	private void Showbooks() {
		book.add(new Book(50, "Thenaliraman", "balaji"));
		book.add(new Book(60, "beerbal", "Abinesh"));
		book.add(new Book(150, "ponniyin selvan", "naveen"));
		book.add(new Book(150, "parthipan kanavu", "naveen"));
		book.add(new Book(100, "novel", "bhuvanesh"));
		book.add(new Book(200, "novel", "vignesh"));
		book.add(new Book(300, "novel", "sureshkumar"));
		book.add(new Book(150, "horror", "suresh"));
		book.add(new Book(400, "horror", "kumar"));
		book.add(new Book(400, "horror", "romeo"));
		book.add(new Book(500, "science", "venkat"));
		book.add(new Book(500, "science", "prabu"));
		System.out.println("My Store Books");
		System.out.println("__________________");
		BookNameSort namesort = new BookNameSort();
		System.out.println("List of Books Available Here:");
		Collections.sort(book, namesort);
		for (Book book : book) {
			System.out.println(book);
		}
	}

}
