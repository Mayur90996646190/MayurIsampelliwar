package equals;
class H3
{
	int a;
	H3(int a)
	{
		this.a = a;
	}
	public boolean equals(Object obj)
	{	H3 temp = (H3)obj;
		return this.a == temp.a;
	}
	public int hashCode()
	{
		int hc = a;
		return hc;
	}
	
	
}
public class HashCode1 {
	public static void main(String[] args) {
		H3 obj = new H3(10);
		H3 obj1 = new H3(10);
		System.out.println(obj==obj1);
		System.out.println(obj.equals(obj1));
		System.out.println(obj.hashCode()==obj1.hashCode());
		
	}
}
  