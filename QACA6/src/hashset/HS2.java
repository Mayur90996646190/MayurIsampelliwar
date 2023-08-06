package hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HS2 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(50);
		set.add(60);
		set.add(30);
		set.add(40);
		System.out.println(set);
		ArrayList ls = new ArrayList(set);
		Collections.sort(ls);
		System.out.println(ls);
		Collections.reverse(ls);
		System.out.println(ls);
	}
}
