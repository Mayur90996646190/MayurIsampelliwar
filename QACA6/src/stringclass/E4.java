package stringclass;

public class E4 {
	public static void dinga() {
		System.out.println("Dinga Begins");
		dingi();
		System.out.println("Dinga ends");
	}

	public static void main(String[] args) {
		try {
			System.out.println("main Begin");
			dinga();
			System.out.println("main Ends");
		} catch (ArithmeticException e) {
			System.out.println("From catch ArithmaticException Occurs");

		}
	}

	public static void dingi() {

		System.out.println("Dingi Begins");
		int a = 10;
		int b = 0;
		int res = a / b;
		System.out.println(a + "/" + b + "=" + res);
		System.out.println("Dingi Ends");

	}

}
