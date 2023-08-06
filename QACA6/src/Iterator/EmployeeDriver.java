package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeDriver {
	private static int Employee;
	private static int ArrayList;

	public static void main(String[] args) {
		ArrayList<Employee> ls = new ArrayList<>();
		ArrayList<Employee> ls1 = ls;

		Employee e1 = new Employee(7369, "smith", 800, "Clerk", 0);
		ls.add(e1);
		Employee e2 = new Employee(7499, "Allen", 1600, "Salesman", 300);
		ls.add(e2);
		Employee e3 = new Employee(7521, "Ward", 1250, "Salesman", 500);
		ls.add(e3);
		Employee e4 = new Employee(7566, "Jones", 2975, "Manager", 0);
		ls.add(e4);
		Employee e5 = new Employee(7654, "Martin", 1250, "Salesman", 1400);
		ls.add(e5);
		Employee e6 = new Employee(7698, "Blake", 2850, "Manager", 0);
		ls.add(e6);
		Employee e7 = new Employee(7782, "Clark", 2450, "Manager", 0);
		ls.add(e7);
		Employee e8 = new Employee(7788, "Scott", 3000, "Analyst", 0);
		ls.add(e8);
		Employee e9 = new Employee(7839, "King", 3000, "President", 0);
		ls.add(e9);
		Employee e10 = new Employee(7844, "Turner", 1500, "Salesman", 30);
		ls.add(e10);

		System.out.println("Total Salary of all Employees are as follows :");
		for (Employee emp : ls) {
			System.out.println(emp.name + " = " + emp.totalSal());
		}
		System.out.println();
		System.out.println();

		System.out.println("Removed the employee who has common commission: ");
		Employee oe = new Employee();
		oe.remove(ls);
		System.out.println();
		System.out.println();

		System.out.println("Added one Employee if the employee designation is manager");
		oe.add(ls);
		System.out.println();
		System.out.println();

		System.out.println("Update the employee comm if comm is zero or Null");
		oe.addComm(ls1);

	}
}
