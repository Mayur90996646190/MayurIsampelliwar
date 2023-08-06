package programmingclass;

public class Str2 {
	public static void main(String[] args) {
		String s = "Mechanical Engineering";
		char[] a = new char[s.length()];
		for (int i = 0; i < a.length; i++) {
			a[i] = s.charAt(i);
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		
	}
}
