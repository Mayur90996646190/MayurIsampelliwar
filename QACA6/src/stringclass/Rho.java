package stringclass;

public class Rho {
	public static void main(String[] args) {
		int n = 4;

		for (int i = 0; i < n; i++) {
			char ch = 'A';
			for (int j = 0; j < n; j++) {
				if (i + j >= n - 1) {
					System.out.print(ch++ + " ");
				} else
					System.out.print("  ");

			}
			char k = (char) (ch - 2);
			for (int j = 1; j < n; j++) {
				if (i >= j) {
					System.out.print(k-- + " ");
				}
			}
			System.out.println();
		}

	}

}
