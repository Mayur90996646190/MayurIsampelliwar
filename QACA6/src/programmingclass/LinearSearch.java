package programmingclass;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		int[] a = {10,60,90,70,50,65};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to be searched in the array");
		int key = sc.nextInt();
		
		int count=0;
		for (int i = 0; i<a.length; i++) {
			if(key==a[i])
			{
				count++;
				break;
			}
		}
		if(count==1)
		{
			System.out.println(key + " is present in the array");
		}
		else
			System.out.println(key + " is not present in the array");
	}
}
