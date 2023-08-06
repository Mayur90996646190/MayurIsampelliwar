package part2;

public class Driver1 {

	public static void main(String[] args) {
		Company c = new Company();
		Employee1 e1 = new Employee1(101, "sheela", 10000);
		Employee1 e2 = new Employee1(101, "leela", 20000);
		c.paySalary(e1);
		c.paySalary(e2);
		c.Empname(e1, e2);
		c.EmpEid(e1, e2);

	}

}
