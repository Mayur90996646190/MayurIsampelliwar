package part3;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpDriver {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee("john", 101);
		Employee e2 = new Employee("smith", 101);
		Employee e3 = new Employee("adams", 101);
		Employee e4 = new Employee("miller", 101);
		Employee e5 = new Employee("jacob", 101);
		al.add(e1.ename);
		al.add(e1.eid);
		al.add(e2.ename);
		al.add(e2.eid);
		al.add(e3.ename);
		al.add(e3.eid);
		al.add(e4.ename);
		al.add(e4.eid);
		al.add(e5.ename);
		al.add(e5.eid);
		for (int i = 0; i < 5; i++) {
			System.out.println("name and eid");
			int eid = sc.nextInt();
			System.out.println("enter the name of emp");
			String ename = sc.next();
		}

		System.out.println(al);

	}

}
