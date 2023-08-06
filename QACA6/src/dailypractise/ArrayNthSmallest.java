package dailypractise;

import java.util.Scanner;
//WAJP to find nth smallest element without using sort method 
public class ArrayNthSmallest {
	public static void main(String[] args) {
		System.out.println("Enter the size of an array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the nth element index");
		int n = sc.nextInt();
		for (int i = 0; i < a.length; i++) {
			int count=0;
			for (int j = 0; j < a.length; j++) {
				if(a[j]<a[i])
				{
					count++;
				}
			}
			if(count==n-1)
			{
				System.out.println(a[i] +" is a " + n +"th smallest element");
			}
		}
	}
}
