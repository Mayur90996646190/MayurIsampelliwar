package Array;

import java.util.Scanner;

public class SquareRoot {
	public static void main(String[] args) {
		System.out.println("enter the num");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		for(int i=0; i<num; i++)
		{
			if(i*i == num)
			{
				System.out.println(i);
				count++;
			}
		}
		if(count==1)
			System.out.println("perfect square");
		else
			System.out.println("not a perfect square");
			
	}
}
