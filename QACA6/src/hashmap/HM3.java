package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HM3 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("Laila", "Majnu");
		map.put("Juliet", "Romeo");
		map.put("Mumtaz", "ShahJhah");
		map.put("Paro", "Devdas");
		System.out.println(map);
		System.out.println(map.get("Mumtaz"));
		System.out.println(map.get("Devdas"));
		Set entries = map.entrySet();
		
		Iterator i =entries.iterator() ;
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		Set s =map.keySet();
		System.out.println(s);
	}
}
