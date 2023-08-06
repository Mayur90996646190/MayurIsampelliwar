package exceptions1;
class NegativeSalaryException extends RuntimeException
{
	
}
class Employee
{
	int eid;
	String name;
	double sal;
	Employee(){}
	Employee(int eid,String name,double sal)
	{
		this.eid = eid;
		this.name = name;
		if(sal>0)
			this.sal = sal;
		else
			throw new NegativeSalaryException();
			
	}
}
public class Driver {
	public static void main(String[] args) {
		Employee e1 = new Employee(101,"smith",-84964);
		System.out.println(e1.sal);
	}
}
