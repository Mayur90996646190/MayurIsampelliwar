package Array;

import java.util.Scanner;

public class A3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter the size of an  array");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the array value :"+i);
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			sum = sum+a[i];
		}
		System.out.println(sum);
	}
}
