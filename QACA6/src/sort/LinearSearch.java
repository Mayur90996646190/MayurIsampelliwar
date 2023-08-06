package sort;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		int count = 0;
		System.out.println("Enter the size of array");
		try (Scanner sc = new Scanner(System.in)) {
			int size = sc.nextInt();
			int[] a = new int[size];

			for (int i = 0; i < a.length; i++) {
				System.out.println("Enter the element of an array");
				a[i] = sc.nextInt();
			}

			System.out.println("Enter the no to be searched");
			int search = sc.nextInt();
			for (int i = 0; i < a.length; i++) {
				if (a[i] == search) {
					count++;
					break;
				}
			}
			if (count == 1) {
				System.out.println(search + " is present in the array");
			} else
				System.out.println(search + " is not present in the array");
		} catch (RuntimeException e) {
			System.out.println("Runtime Exception");
		}

	}

}
