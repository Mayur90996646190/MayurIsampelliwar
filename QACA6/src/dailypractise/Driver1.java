package dailypractise;

class Account1
{
	int acno;
	String name;
	String ifsc;
	Account1(){}
	Account1(int acno,String name,String ifsc)
	{
		this.acno = acno;
		this.name = name;
		this.ifsc = ifsc;
	}
	public void display() {
		System.out.println(acno);
		System.out.println(name);
		System.out.println(ifsc);
		
	}
}
class SA1 extends Account1
{
	double bal;
	SA1(){}
	public SA1(int acno, String name,String ifsc,double bal)
	{	
		super(acno,name,ifsc);
		this.bal = bal;
	}
	public void display() {
		super.display();
		System.out.println(bal);	
	}
}
class CA extends Account1
{
	double bal;
	double loanamt;
	public CA(int acno, String name,String ifsc,double bal,double loanamt)
	{	
		super(acno,name,ifsc);
		this.bal = bal;
		this.loanamt = loanamt;
	}
	public void display() {
		super.display();
		System.out.println(bal);
		System.out.println(loanamt);
	}
	
}

public class Driver1 {
	public static void main(String[] args) {
		Account1 a= new CA(101, "Mayur Isampelliwar", "SBIN017574",50000.00, 20000);
		a.display();
	}
}
