package dailypractise;
class A 
{
	int a = 10;
}
class B extends A
{
	int a = 20;
}
public class Vshadowing {
	public static void main(String[] args) {
		B obj = new B();
		A obj1 = new A();
		System.out.println(obj.a);
		System.out.println(obj1.a);
	}
}
