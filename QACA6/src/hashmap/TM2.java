package hashmap;

import java.util.TreeMap;

class Book
{
	String title;
	Book(){}
	public Book(String title) {
		super();
		this.title = title;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + "]";
	}
	
}

class Author implements Comparable
{
	String name;

	public Author(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + "]";
	}
	public int compareTo(Object obj)
	{
		Author temp = (Author)obj;
		return this.name.compareTo(temp.name);
	}
}
public class TM2 {
	public static void main(String[] args) {
		TreeMap map = new TreeMap();
		map.put(new Author("PQR"),new Book("Manual"));
		map.put(new Author("ABC"), new Book("SQL"));
		map.put(new Author("XYZ"),new Book("java"));
		map.put(new Author("LMN"), new Book("Selenium"));
		System.out.println(map);//treemap implecitly sort but value must be comparable
	}
}
