package objectclass;
class Account
{
	int acno;
	double bal;
	String name;
	public Account(int acno,double bal,String name) {
		this.acno = acno;
		this.bal = bal;
		this.name = name;
		
	}
	public String toString()
	{
		return "acno = "  +acno + " bal =" + bal+" " + "name ="+name;
	}
	
	
}
public class SADriver {
	public static void main(String[] args) {
		Account a = new Account(102,5000.0,"smith");
		System.out.println(a);
	}
}
