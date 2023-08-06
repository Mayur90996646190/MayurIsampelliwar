package part3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class EmpDriver2 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of employee");
			int size = sc.nextInt();
			ArrayList al = new ArrayList(size);
			for (int i = 0; i < size; i++) {
				System.out.println("Enter the name of Employee");
				String ename = sc.next();
				// int eid = 100;
				System.out.println("Enter the salary of Employee");
				double sal = sc.nextDouble();
				Employee e1 = new Employee(ename, sal);
				al.add(e1.eid);
				al.add(ename);
				al.add(sal);
			}
			System.out.println(al);
		} catch (NegativeSalaryExeception e) {
			System.out.println("Please pass an positive salary");
		} catch (InputMismatchException e) {
			System.out.println("please pass an respective type input");
		} catch (NoSuchElementException e) {
			System.out.println("hi");
		}

	}

}
