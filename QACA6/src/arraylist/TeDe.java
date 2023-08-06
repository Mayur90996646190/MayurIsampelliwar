package arraylist;

import java.util.ArrayList;

public class TeDe {
	public static void main(String[] args) {
		ArrayList te = new ArrayList();
		
		te.add("smith");
		te.add("Adams");
		te.add("john");
		
		ArrayList de = new ArrayList();
		de.add("miller");
		de.add("king");
		de.add("jacob");
		
	
		de.addAll(1,te);
		System.out.println(de);
		
	}
}
