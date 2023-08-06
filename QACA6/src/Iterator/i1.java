package Iterator;

import java.util.ArrayList;

public class i1 {
	public static void main(String[] args) {
		ArrayList ls = new ArrayList();
		ls.add("leela");
		ls.add("sheela");
		ls.add("Urmila");
		ls.add("Urmila");
		System.out.println(ls);
		System.out.println(ls.get(0));
		System.out.println(ls.get(1));
		String s = (String)ls.get(0);
		System.out.println(s);
		
	}
	
}
