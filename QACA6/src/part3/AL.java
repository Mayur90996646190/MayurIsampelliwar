package part3;

import java.util.ArrayList;

public class AL {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		//
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println(al.isEmpty());
		System.out.println(al);
		System.out.println(al.add(60));
		System.out.println(al);

	}

}
