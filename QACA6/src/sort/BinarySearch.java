package sort;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] a = { 10, 40, 60, 20, 5 };
		Arrays.sort(a);
		int key = 40;
		int count = 0;
		int low = 0;
		int high = a.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;

			if (key == a[mid]) {
				count++;
				break;
			} else if (key < a[mid]) {
				high = mid - 1;
			} else
				low = mid + 1;
		}
		if (count == 1)
			System.out.println(key + " is present in the array");
		else
			System.out.println(key + " is not present in the array");
	}
}
