package equals;
class Book
{
	String name;
	int bid;
	double price;
	Book(){}
	Book(String name,int bid, double price)
	{
		this.name=name;
		this.bid=bid;
		this.price = price;
	}
	public boolean equals(Object obj)
	{
		Book temp = (Book)obj;
		return this.bid==temp.bid && this.name == temp.name
				&& this.price == temp.price;
	}
	public int hashCode()
	{
		int hc = bid;
		hc = hc + (int)price;
		hc = hc + name.hashCode();
		return hc;
	}
}
public class BookDriver {
	public static void main(String[] args) {
		Book b1 = new Book("You Can Win",105,350.00);
		Book b2 = new Book("You Can Win",105,350.00);
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b1.equals(b2));
		System.out.println(b1.hashCode()==b2.hashCode());
	}
	
}
