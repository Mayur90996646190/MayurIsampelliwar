package hashmap;

import java.util.HashMap;

public class HM1 {
	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<>();
		map.put(101,"smith");
		map.put(102, "miller");
		map.put(103,"Adams");
		map.put(104, "king");
		map.put(null, null);
		System.out.println(map.size());
		System.out.println(map);
		String m = (String)map.remove(101);
		System.out.println(m);
		System.out.println(map.remove(101));
	}
}
