package string;
class String2
{
	private String name;
	String getName()
	{
		return name;
	}
	String2 setName(String name)
	{	
		if(this.name == name)
		return this;
	    else
	    	return new String2(name);
		
	}
	String2(String name)
	{
		this.name = name;	
	}
}
public class Driver {
	public static void main(String[] args) {
		String2 s1 = new String2("Sheela");
		System.out.println(s1);
		System.out.println(s1.getName());
		
		s1=s1.setName("Leela");
		System.out.println( s1);
		System.out.println(s1.getName());
	}

}
