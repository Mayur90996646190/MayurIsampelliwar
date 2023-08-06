package part2;
class B1
{
	int i = 10;
}
class C1 extends B1
{
	int j = 30;
}
class Inheritance extends B1
{	public void mayur()
	{
		System.out.println(i);
	}
	public static void main(String[] args) {
		Inheritance obj1 = new Inheritance();
		C1 obj =new C1();
		System.out.println(obj.i);
		System.out.println(obj.j);
		obj1.mayur();
	}
}
