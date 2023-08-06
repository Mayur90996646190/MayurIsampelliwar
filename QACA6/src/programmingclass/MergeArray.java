package programmingclass;

import java.util.Scanner;

public class MergeArray {
	public static void main(String[] args) {
		int[] a = toRead();
		int[] b = toRead();
		int[] res = merge(a,b);
		System.out.println("Merged array element are");
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}
	public static int[] toRead() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the Element of an Array");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		return a;
	}
	public static int[] merge(int[] a, int[] b)
	{
		int[] res = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			res[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			res[a.length+i] = b[i];
		}
		return res;
	}


}
