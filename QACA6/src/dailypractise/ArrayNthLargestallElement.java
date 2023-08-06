package dailypractise;

import java.util.Scanner;
//WAJP to find nth largest element without using sort method 
public class ArrayNthLargestallElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the Elements of an array");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the nth largest element integer");

		
		for (int n = 1; n <=a.length; n++) {
			for (int i = 0; i < a.length; i++) {
				int count = 0;
				for (int j = 0; j < a.length; j++) {
					if (a[j] > a[i]) // (a[j]<a[i]) for smallest
					{
						count++;
					}
				}
				if (count == n - 1) {
					System.out.println(a[i] + " is " + n + " th Elemet largest smallest/largest of array");
					break;
				}
			}
		}
	}
}
