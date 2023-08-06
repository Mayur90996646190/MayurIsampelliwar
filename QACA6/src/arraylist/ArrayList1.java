package arraylist;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList ls = new ArrayList();
		System.out.println(ls);
		System.out.println(ls.isEmpty());
		System.out.println(ls.size());
		System.out.println(ls.toArray());
		System.out.println(ls.hashCode());
		System.out.println(ls.equals(ls));
		ls.add(30);
		ls.add(40);
		ls.add(50);
		System.out.println();
		System.out.println(ls.size());
		System.out.println(ls.isEmpty());
		System.out.println(ls.toArray());
		System.out.println(ls.hashCode());
		System.out.println(ls.equals(ls));
	}
}
