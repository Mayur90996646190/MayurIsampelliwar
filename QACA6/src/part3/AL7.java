package part3;

import java.util.ArrayList;

public class AL7 {
	public static void main(String[] args) {
		ArrayList<Pen> ls = new ArrayList<>();
		ls.add(new Pen(101, "ClassMate", 10.0));
		ls.add(new Pen(102, "Linc", 20.0));
		ls.add(new Pen(103, "Reynolds", 30.0));
		ls.add(new Pen(104, "Nataraj", 40.0));
		System.out.println(ls);

		/*
		 * for (int i = 0; i < ls.size(); i++) { Pen p =(Pen)ls.get(i);
		 * System.out.println(p.price*1.2); }
		 */
		// to remove an object whose brans name Linc
		for (int i = 0; i < ls.size(); i++) {
			Pen p = ls.get(i);
			// if(p.brand.equals("Linc"))
			if (p.brand.equalsIgnoreCase("LiNc")) {
				ls.remove(p);
			}

		}
		System.out.println("After removal: " + ls);

	}
}
