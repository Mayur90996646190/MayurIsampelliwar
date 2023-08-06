package Array;

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
	public String toString()
	{
		return name +" are "+height +" and " +weight;
	}
	
}
