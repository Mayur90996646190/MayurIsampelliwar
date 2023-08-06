package stringclass;

public class E1 {
	public static void main(String[] args) {
		try {
			System.out.println("Main Begin");
			int a = 10;
			System.out.println(a);
			int b = 0;
			int res = a / b;
			System.out.println("a" + "+" + "b" + "=" + res);
			System.out.println(res);
		} catch (RuntimeException e) {
			System.out.println("Exeception object caught....");
		}
		System.out.println("Main End..........");
	}

}
