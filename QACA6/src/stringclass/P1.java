package stringclass;

public class P1 {
	public static void main(String[] args) {
		int n = 4;
		int l = 1;
		int k;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				if (i >= j) {
					System.out.print(l++ + " ");
				} else
					System.out.print("  ");
			}
			k = l - 1;
			for (int j = 0; j < n; j++) {
				if (i >= j) {
					System.out.print(k-- + " ");
				}
			}
			System.out.println();

		}

	}

}
