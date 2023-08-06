package part3;

import java.util.ArrayList;
import java.util.Iterator;

public class AL8 {
	public static void main(String[] args) {

		ArrayList ls = new ArrayList();

		ls.add(new Laptop(101, "HP", 59999.0));
		ls.add(new Laptop(102, "Dell", 49999.0));
		ls.add(new Laptop(103, "Lenovo", 69999.0));
		ls.add(new Laptop(104, "Asus", 39999.0));
		Iterator i = ls.iterator();
		while (i.hasNext()) {
			Laptop l = (Laptop) i.next();
			if (l.price == 59999.0) {
				ls.remove(l);
			}
		}
		System.out.println("After removal:" + ls);

	}

}
