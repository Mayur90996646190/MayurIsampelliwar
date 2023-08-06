package equals;
class Car1
{
	String name ;
	double price;
	String size;
	Car1(String name,double price,String size)
	{
		this.name =name;
		this.price = price;
		this.size = size;
	}
	public boolean equals(Object obj)
	{
		Car1 temp = (Car1)obj;
		return this.name == temp.name && this.price == temp.price && this.size == temp.size;
	}
}
public class CarDriverEquals {
	public static void main(String[] args) {
		Car1 c = new Car1("Lambo",500000,"Big");
		Car1 c1 = new Car1("Lambo",500000,"Big");
		System.out.println(c.equals(c1));
	}
}
