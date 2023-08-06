package dailypractise;

import java.util.Iterator;
import java.util.Scanner;

public class Prac {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the elements of an arrray");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the n value for nth largest");
		int n = sc.nextInt();
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if(a[j]>a[i])
				{
					count++;
				}
			}
			if(count==n-1)
			{
				System.out.println(a[i] + " is a " + n+ " largest value present in the arrray");
			}
		}
	}
}
