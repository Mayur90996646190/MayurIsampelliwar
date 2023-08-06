package Array;

import java.util.Arrays;

public class HumanDriver {
	public static void main(String[] args) {
		Human[] h = new Human[4];
		h[0] = new Human(5.5,"smith",96);
		h[1] = new Human(5.8,"miller",71);
		h[2] = new Human(5.9,"king",45);
		h[3] = new Human(4.9, "Devid",76);
		Arrays.sort(h,new SortByHeight());
		for (int i = 0; i < h.length; i++) {
			System.out.println(h[i]);
		}
		System.out.println();
		System.out.println();
		Arrays.sort(h,new SortByWeight());
		for (int i = 0; i < h.length; i++) {
			System.out.println(h[i]);
		}
		
		System.out.println();
		System.out.println();
		Arrays.sort(h,new SortByName());
		for (int i = 0; i < h.length; i++) {
			System.out.println(h[i]);
		}
		
		
	}
}
