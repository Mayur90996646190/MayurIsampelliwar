package stringclass;

import java.util.Scanner;

public class E2 {
	public static void main(String[] args) {
		System.out.println("welcome to division application");
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the value 1:");
			int num1 = s.nextInt();
			System.out.println("Enter the value 2:");
			int num2 = s.nextInt();
			int res = num1 / num2;
			System.out.println("Result:" + res);

		} catch (ArithmeticException e) {
			System.out.println("sorry for incovenience zero is not allowed in divisor....");
		}
		System.out.println("thank you for using the application");
	}

}
