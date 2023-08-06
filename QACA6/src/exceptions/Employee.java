package exceptions;

public class Employee
{
	int eid;
	String name;
	double sal;
	Employee(){}
	Employee(int eid,String name,double sal){
		
		this.eid = eid;
		this.name = name;
		try {
			if(sal>0)
				this.sal = sal;
			else
				throw new NegativeSalaryException();
		}
		catch(NegativeSalaryException e)
		{
			System.out.println("please Enter the Positive Salary value");
		}
		
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", sal=" + sal + "]";
	}
	
}