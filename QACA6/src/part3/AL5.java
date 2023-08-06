package part3;

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
		System.out.println(ls);
		System.out.println(ls1);

		ls.removeAll(ls1);
		System.out.println(ls);
	}

}
