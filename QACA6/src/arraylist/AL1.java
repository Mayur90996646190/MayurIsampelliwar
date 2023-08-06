package arraylist;

import java.util.ArrayList;

class Book
{
	
}
class Marker
{
	
}
class Student
{
	
}
public class AL1 {
	public static void main(String[] args) {
		Book b1 = new Book();
		Student s = new Student();
		Marker m = new Marker();
		ArrayList ls = new ArrayList();
		ls.add(10);
		ls.add(10.0);
		ls.add('A');
		ls.add(true);
		ls.add(m);
		ls.add(s);
		ls.add(b1);
		System.out.println(ls);
		
	}
}
