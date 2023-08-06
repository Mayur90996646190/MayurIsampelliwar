package arraylist;

import java.util.ArrayList;
import java.util.Scanner;
class NegativeSalaryException extends RuntimeException {

}
class Employee
{
	String ename;
	static String comp = "odii";
	static int count = 100;
	String eid = comp + count++;
	double sal;
	Employee(String ename,double sal)
	{
		this.ename = ename ;
		try{
			if(sal>0)
		
			this.sal = sal;
		else 
			throw new NegativeSalaryException();
		}
		catch(Throwable t)
		{
			System.out.println("Exception id handled");
		}
	
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eid=" + eid + ", sal=" + sal + "]";
	}
	
}
public class Employee5Object {
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Please enter an no of employee");
		int size = sc.nextInt();
		ArrayList ls = new ArrayList(size);
		for(int i=0; i<size; i++)
		{
			System.out.println("name of employee");
			String ename = sc.next();
			System.out.println("sal of employee");
			double sal = sc.nextDouble();
			Employee e1 = new Employee(ename,sal);
			/*ls.add(ename);
			ls.add(sal);
			ls.add(e1.eid);
			*/
			ls.add(e1);
		}
		System.out.println(ls);
	}
}
