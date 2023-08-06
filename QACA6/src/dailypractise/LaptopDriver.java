package dailypractise;
abstract class Laptop
{
	int LID;
	String brand;
	abstract public void display();
	
}

public class LaptopDriver extends Laptop {
	LaptopDriver(int LID,String brand)
	{
		this.brand = brand;
		this.LID = LID;
	}
	public void display()
	{
		System.out.println("Laptop ID :"+ LID);
		System.out.println("Laptop brand: "+ brand);
	}
	public static void main(String[] args) {
		LaptopDriver obj = new LaptopDriver(101,"HP");
		obj.display();
	}
}
