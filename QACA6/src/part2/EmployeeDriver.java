package part2;

public class EmployeeDriver {
	public static void main(String[] args) {
		Employee e1 = new Employee(123, "Dinga", 20000);
		Employee e2 = new Employee(111, "Dingi", 15000);
		Employee e3 = new Employee(456, "Sheela", 30000);
		Employee e4 = new Employee(101, "Leela", 50000);
		Employee[] a = { e1, e2, e3, e4 };

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}
		e1.display();
		e2.display();
		e3.display();
		e4.display();

	}

}
