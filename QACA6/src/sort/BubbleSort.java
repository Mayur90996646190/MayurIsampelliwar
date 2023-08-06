package sort;

public class BubbleSort {
	public static void main(String[] args) {
		int[] a = { 20, 30, 10, 50, 25, 40 };

		System.out.println("Before sorting Array ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println("After sorting the array");
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}

	}

}
