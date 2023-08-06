package arraylist;

import java.util.ArrayList;

public class AL5 {
	public static void main(String[] args) {
		ArrayList ls = new ArrayList();
		ArrayList ls1 = new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls1.add(10);
		ls1.add(20);
		ls1.add(50);
		ls1.add(60);
		//ls.removeAll(ls1);
		ls.retainAll(ls1);
		System.out.println(ls);
		ls.clear();
		System.out.println(ls);
	}
}
