package arraylist1;

import java.util.ArrayList;

public class C2 {
	public static ArrayList toList(Object[] obj)
	{
		ArrayList  ls = new ArrayList();
		for (Object object : obj) {
			ls.add(object);
		}
		return ls;
	}
	public static void main(String[] args) {
		Integer[] s = {10,20,30,40};
		ArrayList ls =toList(s);
		System.out.println(ls);
	}
}