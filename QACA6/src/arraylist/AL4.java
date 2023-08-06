package arraylist;

import java.util.ArrayList;

public class AL4 {
	public static void main(String[] args) {
		ArrayList ls = new ArrayList();
		ls.add('A');
		ls.add('B');
		ls.add('C');
		ls.add('D');
		ls.remove(Character.valueOf('B'));
		System.out.println(ls);
	}
}
