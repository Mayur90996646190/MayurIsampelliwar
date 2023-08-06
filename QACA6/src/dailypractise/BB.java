package dailypractise;
abstract class  AA
{
	void test()
	{
		System.out.println("From test()");
	}
	abstract void print();
}
public class BB extends AA {
	void print()
	{
		System.out.println("From class B");
	}
	public static void main(String[] args) {
		AA obj = new BB();
		obj.print();
	}
}
