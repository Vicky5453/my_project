package my_project;

public class Book {

	private int price;
	private String name;
	private String Author;

	public Book(int price, String name, String Author) {
		this.price = price;
		this.name = name;
		this.Author = Author;
	}

	void ShowBook() {
		System.out.println("BookName:" + name + ", " + "BookAuthor:" + Author + ", " + "BookPrice:" + price);
	}

	@Override
	public String toString() {
		return ("BookName:" + name + ", " + "BookAuthor:" + Author + ", " + "BookPrice:" + price);
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

}
