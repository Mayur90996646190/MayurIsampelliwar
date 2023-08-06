package part2;
class Parent
{
	{
		System.out.println("IIB-1");
	}
	Parent()
	{
		System.out.println("Constructor from Parent class");
	}
	Parent(int a)
	{
		System.out.println("Parameterised constructor from Parent Class");
	}
	{
		System.out.println("IIB-2");
	}
}
class Child extends Parent
{
	{
		System.out.println("IIB-1");
	}
	Child()
	{
		System.out.println("Constructor from Child Class");
	}
	Child(int a)
	{	super(10);
		System.out.println("Parameterised Constructor from Parent Class");
	}
	
	{
		System.out.println("IIB-2");
	}
}
public class Driver4 {
	public static void main(String[] args) {
		new Child(10);
	}
}
