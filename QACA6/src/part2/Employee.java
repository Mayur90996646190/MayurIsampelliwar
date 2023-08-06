package part2;

public class Employee {
	int eid;
	double sal;
	String name;

	Employee() {
	}

	Employee(int eid, String name, double sal) {
		this.eid = eid;
		this.name = name;
		this.sal = sal;
	}

	public void display() {
		System.out.println(eid);
		System.out.println(name);
		System.out.println(sal);
	}

}
