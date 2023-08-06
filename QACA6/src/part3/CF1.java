package part3;

import java.util.ArrayList;

public class CF1 {
	public static void main(String[] args) {
		ArrayList te = new ArrayList();
		te.add("smith");
		te.add("adams");
		te.add("john");
		System.out.println(te + " TE list");
		ArrayList de = new ArrayList();
		de.add("Miller");
		de.add("king");
		de.add("jacob");
		System.out.println(de + " DE list");
		de.addAll(2, te);
		System.out.println(de);

	}

}
