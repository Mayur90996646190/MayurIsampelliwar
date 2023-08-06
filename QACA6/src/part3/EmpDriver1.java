package part3;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpDriver1 {

	public static void main(String[] args) {

		System.out.println("Enter the no of employee");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		ArrayList al = new ArrayList(size);

		for (int i = 0; i < size; i++) {
			System.out.println("enter eid");
			int eid = sc.nextInt();

			System.out.println("enter ename");
			String ename = sc.next();

			System.out.println("enter sal");
			double sal = sc.nextDouble();
			Employee e1 = new Employee(ename, sal);
			al.add(eid);
			al.add(ename);
			al.add(sal);

		}
		System.out.println(al);

	}

}
