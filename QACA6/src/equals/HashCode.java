package equals;

class H2
{
	int a;
	H2(int a)
	{
		this.a = a;
	}
}
public class HashCode {
	public static void main(String[] args) {
		H2 h = new H2(10);
		H2 h1 = new H2(20);
		System.out.println(h.hashCode());
		System.out.println(h1.hashCode());
		System.out.println(h.hashCode()==h1.hashCode());
		System.out.println(h.equals(h1));
		
	}
}

