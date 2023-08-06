package string;

public class S {
	public static void main(String[] args) {
		String s = "Mayur";
		char[] a = new char[s.length()];
		for(int i=0; i<s.length();i++)
		{
			a[i] = s.charAt(i);
		}
		System.out.println(a);
	}
}
