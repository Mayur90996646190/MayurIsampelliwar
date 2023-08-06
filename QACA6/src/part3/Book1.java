package part3;

public class Book1 {
	int bid;
	String title;
	double price;

	public Book1(int bid, String title, double price) {
		super();
		this.bid = bid;
		this.title = title;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book1 [bid=" + bid + ", title=" + title + ", price=" + price + "]";
	}

}
