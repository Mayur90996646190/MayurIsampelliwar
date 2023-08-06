package programmingclass;

public class Str26 {
	public static void main(String[] args) {
		String s1 = "Mayur";
		String s2 = "Isampalliwar";
		s1 = s1 +s2;
	//	System.out.println(s1);
		s2 = s1.substring(0,s1.length()- s2.length());
		s1=s1.substring(s2.length());
		System.out.println(s1);
		System.out.println(s2);
		
	}
}
