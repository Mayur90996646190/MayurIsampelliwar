package objectclass;
class A
{
	int i ;
	A(int i)
	{
		this.i = i;
	}
	public String toString()
	{
		return i+"";
	}
}
public class Driver {
	public static void main(String[] args) {
		A obj = new A(50);
		System.out.println(obj);
	}
}
