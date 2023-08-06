package programmingclass;

public class ReverseString {
	public static void main(String[] args) {
		String s = "Hello";
		String s1 = "";
		for (int i =s.length()-1; i>=0; i--) {
			char ch=s.charAt(i);
			s1 = s1+ch;
		}
		System.out.println(s1);
	}
}
