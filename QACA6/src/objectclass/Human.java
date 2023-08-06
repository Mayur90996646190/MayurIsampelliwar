package objectclass;

public class Human {
	double height;
	String name;
	double weight;
	Human(double height,String name,double weight)
	{
		this.height = height;
		this.name = name;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return  name;
	}
	

}
