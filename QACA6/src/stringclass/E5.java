package stringclass;

public class E5 {
	public static void dinga() {
		try {

			System.out.println("Dinga Begins");
			dingi();
			System.out.println("Dinga ends");
		}

		catch (ArithmeticException e) {
			System.out.println("From catch ArithmaticException Occurs");

		}
	}

	public static void main(String[] args) {
		System.out.println("main Begin");
		dinga();
		System.out.println("main Ends");

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
