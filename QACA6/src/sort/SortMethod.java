package sort;

public class SortMethod {

	public static void main(String[] args) {
		int[] a = { 90, 135, 30, 120, 60 };
		a = sort(a);
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}

	}

	public static int[] sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;

	}

}
