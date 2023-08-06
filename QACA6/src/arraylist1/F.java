package arraylist1;

import java.util.ArrayList;

public class F {
	public static void main(String[] args) {
		ArrayList ls = new ArrayList();
		ls.add("Sheela");
		ls.add("leela");
		ls.add("mala");
		ls.add("Urmila");
		for(Object obj : ls)
		{
			System.out.println(obj);
		}
	}
}
