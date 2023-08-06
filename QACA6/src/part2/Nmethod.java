package part2;

public class Nmethod {

	public void test() {
		System.out.println("From test");
	}

	public void test(int a) {
		System.out.println(a + " From test");
	}

	public void test(int a, double b) {
		System.out.println(a + "+" + b + " From test");
	}

	public void test(int a, double b, String c) {
		System.out.println(a + "+" + b + "+" + c + " From test");
	}

	public static void main(String[] args) {
		Nmethod obj = new Nmethod();
		obj.test(10, 50.0);
	}
}
