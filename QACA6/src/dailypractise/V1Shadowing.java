package dailypractise;
class Account
{
	String name;
}
class SA extends Account
{
	double interestrate = 3.5;
}

class JDA extends SA
{
	double  interestrate = 4.5;
}
public class V1Shadowing {
	public static void main(String[] args) {
		Account a = new JDA();
		SA s = (SA)a;
		JDA j = (JDA)a;
		System.out.println(s.interestrate);
		System.out.println(j.interestrate);
	}
}
