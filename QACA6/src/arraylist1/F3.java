package arraylist1;

import java.util.ArrayList;

public class F3 {
	public static void main(String[] args) {
		ArrayList<Integer> ls = new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		System.out.println(ls);

		Object[] obj =ls.toArray();
		for (Object obj1 : obj) {
			System.out.println(obj1);
		}
	}
}
