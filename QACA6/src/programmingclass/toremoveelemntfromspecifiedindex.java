package programmingclass;

import java.util.Scanner;

public class toremoveelemntfromspecifiedindex {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		System.out.println("Enter the elment of array");
		int[] a = new int[size]; 
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the index");
		int index =sc.nextInt();
		int[] res = remove(a, index);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
		
	}
	public static int[] remove(int[] a, int index)
	{	int[] res = new int[a.length-1];
		for (int i = 0; i < res.length; i++) {
			if(index>a.length || index<0)
			{
				System.out.println("enter the index with in range");
			}
			if(i<index)
			{
				res[i] = a[i];
			}
			else
				res[i] = a[i+1];
		}
		return res;
	}
}
