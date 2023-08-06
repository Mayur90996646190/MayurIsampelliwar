package part3;

import java.util.ArrayList;

public class AL4 {

	public static int returnprime(int m, int n) {
		int num;
		for (num = m; num < n; num++) {
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
		return num;
	}

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		returnprime(1, 100);

	}

}
