package exceptions1;
class A{
	
}
public class E6 {
	public static void main(String[] args) {
		try {
			A obj;
			obj = null;
			System.out.println(obj.hashCode());
		}
		catch(NullPointerException e)
		{
			System.out.println("NPE is caught");
			String msg = e.getMessage();
			System.out.println(msg);
			e.printStackTrace();
		}
	}
}
