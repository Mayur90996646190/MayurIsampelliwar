package arraylist1;

import java.util.ArrayList;
import java.util.ListIterator;

class Book
{
	int bid;
	String title;
	double price;
	public Book(int bid, String title, double price) {
		super();
		this.bid = bid;
		this.title = title;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", title=" + title + ", price=" + price + "]";
	}
	
}
public class BookDriver
{
	public static void main(String[] args) {
		ArrayList ls = new ArrayList();
		ls.add(new Book(101,"manual testing",500));
		ls.add(new Book(102,"SQL",520));
		ls.add(new Book(103,"api",250));
		ls.add(new Book(104,"java",550));
		
		ListIterator<Book> li = ls.listIterator();
		while(li.hasNext())
		{
			Book b = li.next();
			if(b.title.equalsIgnoreCase("java"))
			{
				li.remove();
			}
		}
		while(li.hasPrevious())
		{
			Book b = li.previous();
			if(b.bid == 101)
			{
				li.remove();
			}
		}
		System.out.println(ls);
	
	}
}
