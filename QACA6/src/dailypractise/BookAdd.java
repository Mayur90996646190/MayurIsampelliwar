package dailypractise;
//A method is returning an address
class Book
{
	int bid;
	String name;
	double price;
	Book(int bid , String name,double price)
	{
		this.bid = bid;
		this.name = name;
		this.price = price;
	}
	public static Book addBook(int bid , String name,double price)
	{
		return new Book(bid ,name,price);
	}
	
}

public class BookAdd {
	public static void main(String[] args) {
		Book b = Book.addBook(101,"mayur",56131);
		System.out.println(b.bid);
	}
}
