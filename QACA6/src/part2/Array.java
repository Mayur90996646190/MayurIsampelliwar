package part2;

import java.util.*;

public class Array {
	public static void main(String[] args) {
		int[] a = { 29, 12, 10, 41, 35 };
		System.out.println("Element of array before sorting");
		for (int j = 0; j < a.length; j++) {
			for (int i = 0; i < a.length - 1; i++) {
				if (a[i] > a[i + 1]) {
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
