package programmingclass;

import java.util.Scanner;

public class Addelmenttiindex {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the elment of an array");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the index");
		int index = sc.nextInt();
		System.out.println("Enter the elment");
		int element = sc.nextInt();
		int[] res = add(a, element, index);
		for (int i = 0; i < a.length; i++) {
			System.out.println(res[i]);
		}
	}
	
	public static int[] add(int[] a,int element, int index)
	{
		if(index <0 || index >a.length)
		{
			System.out.println("Enter the index with in range");
			return a;
		}
		int[] res = new int[a.length +1];
		res[index] = element;
		for (int i = 0; i < res.length; i++) {
			if(i<index)
				res[i] = a[i];
			else
				res[i+1] = a[i];
		}
		return res;
		
	}
}
