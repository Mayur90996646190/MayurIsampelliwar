package RevisionClass;

public class SquareRoot {
	public static void main(String[] args) {
		int num = 196;
		int count=0;
		int i;
		for( i=0;i<num/4;i++)
		{
			if(i*i==num)
			{	
				count++;
				break;
			}
		}
		if(count>0)
		{
			System.out.println( num + " is a perfect square");
		}
		else
			System.out.println("plz pass an Perfect Square");
			
	}
}
