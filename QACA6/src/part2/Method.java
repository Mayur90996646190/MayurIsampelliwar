package part2;

public class Method {

	public static void test() {
		System.out.println("From test");
	}

	public static void test(int a) {
		System.out.println(a + " From test");
	}

	public static void test(int a, double b) {
		System.out.println(a + "+" + b + " From test");
	}

	public static void test(int a, double b, String c) {
		System.out.println(a + "+" + b + "+" + c + " From test");
	}

	public static void main(String[] args) {
		Method.test(10, 50.0, "Mayur");
	}
}
