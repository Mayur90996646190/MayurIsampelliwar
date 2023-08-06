package programmingclass;

abstract class Bank {
	abstract void withdraw(double amt);

	abstract void deposit(double amt);

	abstract void loan(double amt);
	

}

class SBI extends Bank {
	String name;
	private double bal;
	int acno;
	double getBal()
	{
		return bal;
	}

	public SBI(String name, double bal, int acno) {
		super();
		this.name = name;
		this.bal = bal;
		this.acno = acno;
	}
	
	public void withdraw(double amt) {
		bal = bal-amt;
	}

	public void deposit(double amt)
	{
		bal = bal + amt;
	}

	public void loan(double amt) {
		double roi = 0.05 ;
		bal = bal + amt;
	}

}

class Canara extends Bank {
	String name;
	private double bal;
	int acno;
	double getBal()
	{
		return bal;
	}

	public Canara(String name, double bal, int acno) {
		super();
		this.name = name;
		this.bal = bal;
		this.acno = acno;
	}
	
	public void withdraw(double amt) {
		bal = bal-amt;
	}

	public void deposit(double amt)
	{
		bal = bal + amt;
	}

	public void loan(double amt) {
		double roi = 0.05 ;
		bal = bal + amt;
	}

}

class HDFC extends Bank {
	String name;
	private double bal;
	int acno;
	double getBal()
	{
		return bal;
	}

	public HDFC(String name, double bal, int acno) {
		super();
		this.name = name;
		this.bal = bal;
		this.acno = acno;
	}
	
	public void withdraw(double amt) {
		bal = bal-amt;
	}

	public void deposit(double amt)
	{
		bal = bal + amt;
	}

	public void loan(double amt) {
		double roi = 0.05 ;
		bal = bal + amt;
	}

}

public class Driver {
	public static void main(String[] args)
	{
		Bank b = new SBI("mayur", 5000, 205656);
		b.deposit(5000);
		SBI s = (SBI)b;
		System.out.println(s.getBal());
		b.withdraw(2000);
		System.out.println(s.getBal());
		
	}
}
