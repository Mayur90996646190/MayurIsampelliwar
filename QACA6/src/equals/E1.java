package equals;

public class E1 {
	String a;

	E1(String a) {
		this.a = a;
	}

	@Override
	public boolean equals(Object obj) {
		E1 temp = (E1) obj;
		return this.a == temp.a;
	}
}
