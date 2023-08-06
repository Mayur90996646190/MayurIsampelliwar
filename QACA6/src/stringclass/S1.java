package stringclass;

public class S1 {
	public static void main(String[] args) {
		String str = "Hello";
		String s = new String("Hello");
		System.out.println(s);
		System.out.println(str);
		System.out.println(s == str);
		System.out.println(s.equals(str));
		System.out.println(s.hashCode());
		System.out.println(str.hashCode());
		System.out.println(s.hashCode()==str.hashCode());
	//	System.out.println(s.hashCode().equals(str.hashCode());

	}

}
