package hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class HM4 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(1,"Idli");
		map.put(2, "Dosa");
		map.put(3, "Poori");
		map.put(4, "Pongal");
		System.out.println("South india BreakFast" +map);
		HashMap map1 = new HashMap();
		map1.put(5, "Chole Batture");
		map1.put(6, "AlooParatha");
		map1.put(7, "Dhokla");
		map1.put(8, "VadaPhav");
		System.out.println("North india BreakFast" + map1);
		map.putAll(map1);
		System.out.println(map);
		System.out.println(map.containsKey(2));
		System.out.println(map1.containsKey(2));
		System.out.println(map1.containsKey(8));
	}
}
