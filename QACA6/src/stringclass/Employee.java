package stringclass;

public class Employee {
	int eid;
	String name;
	double sal;

	Employee() {
	}

	Employee(int eid, String name, double sal) {
		this.eid = eid;
		this.name = name;
		this.sal = sal;
		if (sal > 0) {
			this.sal = sal;
		} else
			throw new NegativeSalaryException();
	}

}
