package exceptions1;

import java.util.Scanner;

public class E2 {
	public static void main(String[] args) {
		System.out.println("Welcome to my application");
		Scanner sc  = new Scanner(System.in);
		try {
		System.out.println("Enter the value of a");
		int a = sc.nextInt();
		System.out.println("Enter the value of b");
		int b = sc.nextInt();
		int c = a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception is handled");
		}
		System.out.println("Thank you for using an application");
		
	}
}
