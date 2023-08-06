package hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HS1 {
	public static void main(String[] args) {
		HashSet s = new HashSet();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(null);
		Iterator i = s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
	}
}
