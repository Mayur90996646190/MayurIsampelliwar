package exceptions;

import java.util.Scanner;

public class E5 {
	public static void main(String[] args) throws NegativeSalaryException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the eid ");
		int eid = sc.nextInt();
		System.out.println("Enter the Employee name");
		String name = sc.next();
		System.out.println("Enter the Employee salary");
		double sal = sc.nextDouble();
		Employee e1 = new Employee(eid, name,sal);
		System.out.println(e1);
		
		
		System.out.println("Enter the eid ");
		int eid1 = sc.nextInt();
		System.out.println("Enter the Employee name");
		String name1 = sc.next();
		System.out.println("Enter the Employee salary");
		double sal1 = sc.nextDouble();
		Employee e2 = new Employee(eid1, name1,sal1);
		System.out.println(e2);
		
	}

}
