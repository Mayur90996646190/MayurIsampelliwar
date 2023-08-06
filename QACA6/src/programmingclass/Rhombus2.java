package programmingclass;

public class Rhombus2 {
	public static void main(String[] args) {
		int n=7;
		//n should be odd value
		int sp = n-1;
		int star = 1;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<sp; j++)
			{
				System.out.print("  ");
			}
			for(int j=0; j<star; j++)
			{
				System.out.print("* ");
			}
			
			if(i<n/2)
			{
				sp--;
				star+=2;
			}
			else
			{
				sp++;
				star-=2;
			}
			System.out.println();
		}
	}
}
