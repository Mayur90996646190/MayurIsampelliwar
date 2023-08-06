package arraylist;

import java.util.ArrayList;

public class AL3 {
	public static void main(String[] args) {
		ArrayList ls =new ArrayList();
		ls.add(30);
		ls.add(40);
		ls.add(50);
		int key = 50;
		if(ls.contains(50))
		System.out.println("50 is present at  an index of "+ ls.indexOf(50));
		ArrayList ls1 = new ArrayList();
		ls.add(40);
		ls.add(50);
		System.out.println(ls.containsAll(ls1));
		System.out.println(ls);
		ls.remove(Integer.valueOf(50));
		System.out.println(ls);
	}
}
