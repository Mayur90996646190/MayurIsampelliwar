package hashset;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class TS2 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(10);
		set.add(50);
		set.add(20);
		set.add(56);
		set.add(80);
		System.out.println(set);
		Iterator i = set.descendingIterator();
		ArrayList ls = new ArrayList();
		while(i.hasNext())
		{
			ls.add(i.next());
		}
		System.out.println(ls);
		
	}
}
