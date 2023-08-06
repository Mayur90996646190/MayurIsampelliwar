package objectclass;

import java.util.Arrays;

public class HumanDriver {
	public static void main(String[] args) {
		Human[] h= new Human[4];
		h[0] = new Human(5.2, "Smith", 80);
		h[1] = new Human(5.4, "king", 90);
		h[2] = new Human(6.6, "gmitha", 85);
		h[3] = new Human(5.6, "Mayur", 45);
		Arrays.sort(h,new SortByName());
		for (int i = 0; i < h.length; i++) {
			System.out.println(h[i]);
		}
		
	}
}
