package part3;

import java.util.ArrayList;

public class AL2 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				al.add(i);
			}
		}
		System.out.println(al);
	}

}
