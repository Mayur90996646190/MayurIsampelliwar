package part3;

public class C1 {

	public static void returnprime(int m, int n) {
		for (int num = m; num < n; num++) {
			int count = 0;
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					count++;
					break;
				}

			}
			if (count == 0) {
				System.out.println(num);
			}
		}
	}

	public static void main(String[] args) {
		// ArrayList al = new ArrayList();
		returnprime(10, 100);
	}

}
