package programmingclass;

import java.util.Scanner;

public class ToMergeTwoIntegerArrayAlternatively {
	public static void main(String[] args) {
		
		int[] a = ToMergeTwoIntegerArrayAlternatively.toRead();
		
		int[] b = ToMergeTwoIntegerArrayAlternatively.toRead();
		
		int[] c =ToMergeTwoIntegerArrayAlternatively.merge(a, b);
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
	
	public static int[] toRead()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the size");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the element of array");
		for (int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		return a;
		
	}
	
	public static int[] merge(int[] a,int[] b)
	{	
		int size = a.length + b.length;
		int [] c = new int[size];
		int i=0;
		for (int j = 0; j < b.length; ) {
			if(j<a.length)
			{
			c[i] = a[j];
			i++;
			}
			if(j<b.length) {
			c[i] = b[j];
			i++;
			}
			j++;
		}
		return c;
	}
}
