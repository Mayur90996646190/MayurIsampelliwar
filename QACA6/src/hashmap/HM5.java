package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HM5 {
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap();
		map.put("Virat", "Anushka");
		map.put("Akshay", "Twinkle");
		map.put("Ranvir", "Deepika");
		map.put("Ranbir","Alia");
		Set entries=map.entrySet();
		for(Object obj : entries)
		{
			System.out.println(obj);
		}
		Iterator i = entries.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		Set s1 = map.keySet();
		Iterator i1 = s1.iterator();
		while(i1.hasNext())
		{	String s = (String)i1.next();
			System.out.println(map.get(s));
		}
		
	}
}
