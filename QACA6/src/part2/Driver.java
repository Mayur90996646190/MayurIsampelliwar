package part2;

class Battery {
	int capacity;
	double price;

	public void charge() {
		System.out.println("charging has been started");
	}
}

class Mobile {
	String bname;
	int ram;
	Battery b;

	Mobile(String bname, int ram) {
		this.bname = bname;
		this.ram = ram;

	}

	public void call() {
		b = new Battery();
		System.out.println("Calling started");
	}
}

public class Driver {
	public static void main(String[] args) {
		Mobile m = new Mobile("Realme", 8);
		System.out.println(m.bname);
		System.out.println(m.ram);

		m.call();
		m.b.charge();
	}

}
