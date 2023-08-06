package dailypractise;


class Emp
{
	int eid;
	String name;
	double sal;
	Emp(){}
	Emp(int eid,String name,double sal)
	{
		this.eid = eid;
		this.name = name;
		this.sal = sal;
		
	}
	
}
class Company
{
	public static void paySal(Emp e)
	{
		if(e.sal>0)
		{
			System.out.println("Sal is added to employee");
		}
		else
			System.out.println("Sal is not added");
	}
}
public class ObjectAsInput {
	
	public static void main(String[] args) {
		Emp e = new Emp(101, "Mayur",544);
		Company.paySal(e);
	}
}
