package programmingclass;

public class Str23 {
	public static void main(String[] args) {
		String s = "123a";
		try {
			int a = Integer.parseInt(s);
			System.out.println("String contains all digits");
		} catch (RuntimeException e) {
			System.out.println("String not contains all digits");
		}
	}
}
