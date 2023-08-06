package equals;

public class Finalize {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method is called");
	}

	public static void main(String[] args) {
		Finalize a = new Finalize();
		new Finalize();
		new Finalize();
		System.gc();
		System.out.println("hi");
	}

}
