package hashset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TS1 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(10);
		set.add(30);
		set.add(20);
		set.add(40);
		System.out.println(set);
		NavigableSet s = set.descendingSet();
		System.out.println(s);
	}
		
}
