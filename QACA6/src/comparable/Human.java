package comparable;

import java.util.Comparator;

public class Human {
	double Height;
	String name;
	double weight;

	Human() {
	}

	public Human(double height, String name, double weight) {
		super();
		Height = height;
		this.name = name;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Human [Height=" + Height + ", name=" + name + ", weight=" + weight + "]";
	}

}
