package comparable;

import java.util.Arrays;

public class C1 {
	public static void main(String[] args) {
		Employee[] emp = new Employee[4];
		emp[0] = new Employee(101, "Smith");
		emp[1] = new Employee(102, "Miller");
		emp[2] = new Employee(103, "Adams");
		emp[3] = new Employee(104, "Johns");

		System.out.println("before sorting");
		for (int i = 0; i < emp.length; i++) {
			System.out.println(emp[i]);
		}
		Arrays.sort(emp);
		System.out.println("After Sorting");
		for (int i = 0; i < emp.length; i++)
			System.out.println(emp[i]);

	}

}
