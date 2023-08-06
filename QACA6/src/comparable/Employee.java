package comparable;

public class Employee implements Comparable {
	int eid;
	String name;

	Employee() {
	}

	public Employee(int eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + "]";
	}

	public int compareTo(Object o) {
		Employee e = (Employee) o;
		if (this.eid > e.eid)
			return 1;
		else if (this.eid < e.eid)
			return -1;
		else
			return 0;
	}

}
