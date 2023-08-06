package RevisionClass;

import java.util.Scanner;

public class SunnyNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Number");
		int num = sc.nextInt();
		int count = 0;
		for(int i=0; i<num; i++)
		{
			if(i*i==num+1)
			{
				count++;
				break;
			}
		}
		if(count>0)
			System.out.println(num + " is a Sunny Number");
		else
			System.out.println(num + " is not a Sunny Number");
	}
}
