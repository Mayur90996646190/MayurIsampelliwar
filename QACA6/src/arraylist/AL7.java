package arraylist;

import java.util.ArrayList;

class Pen
{
	int pid;
	String brand;
	double price;
	public Pen(int pid, String brand, double price) {
		super();
		this.pid = pid;
		this.brand = brand;
		this.price = price;
	}
	public String toString()
	{
		return pid+ "  " +brand+ "  "+ price;
	}
	
}
public class AL7 {
	
	public static void main(String[] args) {
		ArrayList<Pen> ls =new ArrayList<Pen>();
		ls.add(new Pen(101,"reynolds",10.0));
		ls.add(new Pen(102,"cello", 15.0));
		ls.add(new Pen(104,"Balaji",3.0));
		ls.add(new Pen(105,"Natraj",5.0));
		for(int i=0; i<ls.size(); i++)
		{
			Pen p = ls.get(i);
			if(p.brand.equalsIgnoreCase("cello"))
			{
				ls.remove(p);
			}
			
			System.out.println(p);
		}
		
	}
}
