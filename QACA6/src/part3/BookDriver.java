package part3;

import java.util.ArrayList;
import java.util.ListIterator;

public class BookDriver {
	public static void main(String[] args) {
		ArrayList ls = new ArrayList();
		ls.add(new Book1(101, "java", 150.0));
		ls.add(new Book1(102, "Manual Testing", 250.0));
		ls.add(new Book1(103, "SQL", 350));
		ls.add(new Book1(104, "selenium", 450));

		ListIterator i = ls.listIterator();
		while (i.hasNext()) {
			Book1 l = (Book1) i.next();
			if (l.title == "java") {
				i.remove();
			}
			if (l.price == 250) {
				i.add(new Book1(105, "mayur", 5000));
			}
			if (l.bid == 103) {
				l.bid = 108;
			}

		}
		System.out.println("After add:" + ls);
	}

}
