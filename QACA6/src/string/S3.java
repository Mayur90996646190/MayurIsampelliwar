package string;
class Employee
{
	String name;
	Employee(String name)
	{
		this.name = name;
	}
	public String toString()
	{
		return name;
	}
}
public class S3 {
	public static void main(String[] args) {
		Employee e =new Employee("Mayur");
		String s1 =String.valueOf(e);
		System.out.println(s1);
	}
}
