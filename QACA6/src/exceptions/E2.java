package exceptions;

import java.util.Scanner;

public class E2 {
	public static void main(String[] args) {
		System.out.println("welcome to division application");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value1");
			int num1 = sc.nextInt();
			System.out.println("Enter the value2");
			int num2 = sc.nextInt();
			int res = num1/num2;
			System.out.println("Result:"+res);
			
		
		System.out.println("sorry for inconvinence, zero is not allowed in divisor");
		System.out.println("thank you for using the application");
		
		
		
	}
}
