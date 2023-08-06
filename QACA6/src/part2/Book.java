package part2;

public class Book {
	int bid;
	String title;
	String author;

	Book() {
	}

	public Book(int bid, String title, String author) {
		super();
		this.bid = bid;
		this.title = title;
		this.author = author;
	}

	public static Book addBook(int bid, String title, String author) {
		return new Book(bid, title, author);
	}

}
