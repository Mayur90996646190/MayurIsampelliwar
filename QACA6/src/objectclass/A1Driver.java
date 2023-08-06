package objectclass;
class A1
{
	int a;
	public A1(int a) {
		this.a = a;
	}
	public boolean equals(Object obj)
	{
		A1 temp = (A1)obj;
		return this.a == temp.a;
	}
}
public class A1Driver {
	public static void main(String[] args) {
		A1 obj = new A1(20);
		A1 obj1 = new A1(20);
		System.out.println(obj.equals(obj1));
		
	}
}
