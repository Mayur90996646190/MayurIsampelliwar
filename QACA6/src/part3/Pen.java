package part3;

public class Pen {
	int pid;
	String brand;
	double price;

	Pen() {
	}

	public Pen(int pid, String brand, double price) {
		super();
		this.pid = pid;
		this.brand = brand;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pen [pid=" + pid + ", brand=" + brand + ", price=" + price + "]";
	}

}
