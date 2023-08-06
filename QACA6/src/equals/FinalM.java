package equals;

public class FinalM {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("final method is called");
	}
	public static void main(String[] args) {
		FinalM  a =new FinalM();
		new FinalM();
		new FinalM();
		System.gc();
		System.out.println(a.getClass());
	}
}
