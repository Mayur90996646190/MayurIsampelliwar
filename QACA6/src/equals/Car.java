package equals;

public class Car {
	String company;
	String colour;
	double price;

	Car() {
	}

	Car(String company, String colour, double price) {
		super();
		this.company = company;
		this.colour = colour;
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		Car temp = (Car) obj;
		return this.company == temp.company && this.colour == temp.colour && this.price == temp.price;

	}

}
