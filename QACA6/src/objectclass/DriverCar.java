package objectclass;
class Car
{
	int cid;
	String name;
	double price;
	Car(int cid,String name,double price)
	{
		this.cid  = cid;
		this.name= name;
		this.price = price;
	}
	public boolean equals(Object obj)
	{
		Car temp = (Car)obj;
		return this.cid == temp.cid && this.name==temp.name && this.price == temp.price;
	}
}
public class DriverCar {
	public static void main(String[] args) {
		Car c = new Car(101,"TATA",500000);
		Car c1 = new Car(101,"TATA",500000);
		System.out.println(c.equals(c1));
	}
}
