package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

class Boo
{
	int bid;
	String title;
	double price;
	public Boo(int bid, String title, double price) {
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
public class BookDriver {
	public static void main(String[] args) {
		ArrayList<Boo> ls = new ArrayList<Boo>();
		ls.add(new Boo(101,"Manual Testing",300));
		ls.add(new Boo(102,"java",400));
		ls.add(new Boo(103,"Selenium",500));
		ls.add(new Boo(104,"SQL",200));
		Iterator i = ls.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
