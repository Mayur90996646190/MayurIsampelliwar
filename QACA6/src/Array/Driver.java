package Array;

import java.util.Arrays;

class Employee  implements Comparable
{
	int eid;
	String name;
	double price;
	public Employee(int eid, String name, double price) {
		super();
		this.eid = eid;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Object o) {
		Employee e =(Employee)o;
		if(this.eid>e.eid)
			return 1;
		else if(this.eid<e.eid)
			return -1;
		else 
			return 0;
	}
	
}
public class Driver {
	public static void main(String[] args) {
		Employee[] emp = new Employee[4];
		emp[0] = new Employee(103,"Smith",50000.0);
		emp[1] = new Employee(101,"Miller",60000.0);
		emp[2] = new Employee(104,"Devid",70000.0);
		emp[3] = new Employee(106,"King",40000.0);
		Arrays.sort(emp);
		for (int i = 0; i < emp.length; i++) {
			System.out.println(emp[i]);
		}
	}

}
