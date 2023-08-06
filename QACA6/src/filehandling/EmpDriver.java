package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable
{
	int eid;
	String name;
	double sal;
	Employee(int eid,String name,double sal)
	{
		this.eid = eid;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", sal=" + sal + "]";
	}
	
}
public class EmpDriver {
	public static void main(String[] args) throws IOException {
		Employee emp = new Employee(101,"mayur",100000);
		String path = "K:\\Eclipse\\QACA6\\filehandling\\EmpDriver.text";
		FileOutputStream fout = new FileOutputStream(path);
		ObjectOutputStream oos = new ObjectOutputStream(fout);
		oos.writeObject(emp);
		System.out.println(emp.eid);
		System.out.println(emp.name);
		System.out.println(emp.sal);
	}
}
