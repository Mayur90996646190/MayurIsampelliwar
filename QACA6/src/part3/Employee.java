package part3;

public class Employee {
	String ename;
	static String comp = "Odi";
	static int count = 100;
	String eid = comp + count;
	double sal;

	public Employee(String ename, double sal) {
		this.ename = ename;
		this.count = ++count;
		this.eid = eid;
		if (sal > 0) {
			this.sal = sal;
		} else
			throw new NegativeSalaryExeception();
	}
	/*
	 * @Override public String toString() { return "Employee [ename=" + ename +
	 * ", eid=" + eid + ", sal=" + sal + "]"; }
	 */

}

class NegativeSalaryExeception extends RuntimeException {

}