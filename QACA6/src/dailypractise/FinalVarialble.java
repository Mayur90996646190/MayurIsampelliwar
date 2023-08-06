package dailypractise;
class FinalMethod
{
	public static void test()
	{
		System.out.println("From final method");
	}
}
public class FinalVarialble extends FinalMethod{
	final  int a  ;
	{
		a = 10;
	}
	public static void test()
	{
		System.out.println("From main method");
	}
	public static void main(String[] args) {
		FinalVarialble obj = new FinalVarialble();
		System.out.println(obj.a);	
	}
}
