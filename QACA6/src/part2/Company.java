package part2;

public class Company {
	public void paySalary(Employee1 e1) {
		if (e1.sal > 0) {
			System.out.println(e1.name + " is paid with the salary");
		} else
			System.out.println(" Salary is not paid");
	}

	public void Empname(Employee1 e1, Employee1 e2) {
		if (e1.name == e2.name) {
			System.out.println(e1.name + "=" + e2.name + " employee name are same");
		} else
			System.out.println(" name are not same");
	}

	public void EmpEid(Employee1 e1, Employee1 e2) {
		if (e1.eid == e2.eid) {
			System.out.println(e1.eid + "=" + e2.eid + " employee eid are same");
		} else
			System.out.println(" eid of employee are not same");
	}

}
