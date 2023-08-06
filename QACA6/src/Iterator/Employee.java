package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Employee {
	int eid;
	String name;
	double salary;
	String design;
	double comm;
	static int count = 0;

	Employee() {
	}

	public Employee(int eid, String name, double salary, String design, double comm) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.design = design;
		this.comm = comm;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + ", design=" + design + ", comm="
				+ comm + "]";
	}

	public double totalSal() {
		return salary + comm;
	}

	public void remove(ArrayList<Employee> ls) {
		for (int i = 0; i < ls.size(); i++) {
			Employee e = ls.get(i);
			if (e.comm == this.comm) {
				e = null;
			}
			System.out.println(e);
		}
	}

	public void add(ArrayList<Employee> ls) {
		for (int i = 0; i < ls.size(); i++) {
			Employee e = ls.get(i);
			if (e.design == "Manager") {
				ls.add(new Employee(7854, "Mayur", 1500, "Student", 30));
			}

		}
		System.out.println(ls);
	}

	public void addComm(ArrayList<Employee> ls1) {
		for (int i = 0; i < ls1.size(); i++) {
			Employee e = ls1.get(i);
			if (e.comm == 0) {
				for (Employee emp : ls1) {
					e.comm = 111;
				}
			}

		}
		System.out.println(ls1);
	}

}
