package programmingclass;

//to print the subset of the String
public class Str30SubSet {
	public static void main(String[] args) {
		String s = "BANGALORE";
		char[] ch = s.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			String s1 = "";
			for (int j = i; j <ch.length; j++) {
				s1 = s1 + ch[j];
				System.out.println(s1);
			}
		}

	}
}
