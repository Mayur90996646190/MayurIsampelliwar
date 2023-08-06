package hashmap;

import java.util.HashMap;

public class HM2 {
	public static void main(String[] args) {
		HashMap<Integer,String> map1 = new HashMap<>();
		map1.put(1, "Idli");
		map1.put(2, "Dosa");
		map1.put(3, "Poori");
		map1.put(4,"Pongal");
		
		System.out.println("South menu" + map1);
		//map1.containsValue("Idli");
		System.out.println(map1.containsValue("Idli"));
		
		String value = map1.remove(2);
		System.out.println(value);
		
		map1.clear();
		System.out.println(map1);
	}
}
