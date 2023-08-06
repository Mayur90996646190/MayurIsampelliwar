package equals;

import java.util.Iterator;

public class Clone {
	public static void main(String[] args) {
		int[] a = {10,20,3,0,40,50};
		int[] o = a.clone();
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		for (int i = 0; i < o.length; i++) {
			System.out.println(o[i]);
		}
	}
}
