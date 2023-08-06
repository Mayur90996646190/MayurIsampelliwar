package arraylist;

import java.util.ArrayList;

public class AL6 {
public static void main(String[] args) {
	ArrayList ls = new ArrayList();
	ls.add("Sheela");
	ls.add("Leela");
	ls.add("laila");
	String s = (String)ls.get(ls.size()-1);
	
	System.out.println(s);
}
}
