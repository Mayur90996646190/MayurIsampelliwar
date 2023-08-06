package string;

public class S5 {
	public static void main(String[] args) {
		String str = "Mayur";
		//toCharArray method
		char[] a =str.toCharArray();
		System.out.println(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		//charat method890-=/*
		char ch = str.charAt(1);
		System.out.println(ch);
	}
}
