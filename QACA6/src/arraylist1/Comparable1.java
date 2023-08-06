package arraylist1;

import java.util.ArrayList;
import java.util.Collections;

class Marker implements Comparable
{
	int pid;
	String colour;
	double price;
	public Marker(int pid, String colour, double price) {
		super();
		this.pid = pid;
		this.colour = colour;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Marker [pid=" + pid + ", colour=" + colour + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Object o) {
		Marker m = (Marker)o;
		if(this.pid > m.pid)
			return 1;
		else if(this.pid<m.pid)
			return -1;
		else
			return 1;
	}
	
}
public class Comparable1 {
	public static void main(String[] args) {
		ArrayList ls= new ArrayList();
		ls.add(new Marker(105,"Blue",20));
		ls.add(new Marker(103,"Red",15));
		ls.add(new Marker(102,"Blue",25));
		ls.add(new Marker(101,"Green",40));
		System.out.println(ls);
		Collections.sort(ls);
		System.out.println(ls);
	}
}
