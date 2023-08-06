package equals;

public class H1 {
	int a;

	H1(int a) {
		this.a = a;
	}

	public boolean equals(Object o) {
		H1 temp = (H1) o;
		return this.a == temp.a;
	}

	@Override
	public int hashCode() {
		int hc = 0;
		hc = a;
		return hc;
	}

	@Override
	public String toString() {
		System.out.println(a);
		return "";
	}
}
