package Array;

import java.util.Iterator;

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
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
}
public class EmpDriver {
	public static void main(String[] args) {
		Emp e1 = new Emp(101,"Smith",50000.0);
		Emp e2 = new Emp(102,"King",60000.0);
		Emp e3 = new Emp(103,"Miller",70000.0);
		Emp e4 = new Emp(104,"Devid",80000.0);
		Emp[] e = {e1,e2,e3,e4};
		
		for(int i=0; i<e.length;i++)
		{
			System.out.println(e[i]);
		}
		
		
	}
}
