package part3;

import java.util.Iterator;

public class Laptop {
	int lip;
	String brand;
	double price;

	Laptop() {
	}

	public Laptop(int lip, String brand, double price) {
		super();
		this.lip = lip;
		this.brand = brand;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [lip=" + lip + ", brand=" + brand + ", price=" + price + "]";
	}

	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
