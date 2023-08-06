package part2;

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
//	public static void test(Emp e)
//	{
//		
//	}
}
public class ObjectAsInput {
	
	public static void main(String[] args) {
		Emp e = new Emp(101, "Mayur",544);
		
	}
}
