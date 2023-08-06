package Array;

import java.util.Iterator;
import java.util.Scanner;

public class A2 {
	public static void main(String[] args) {
		int[] a = new int[3];
		Scanner sc = new Scanner(System.in);
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
			System.out.println("Enter the array index value");
			a[j] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		
	}
}
