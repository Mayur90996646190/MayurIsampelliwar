package programmingclass;

public class Pattern6 {
	public static void main(String[] args) {
		int n=7;
		int sp =0;
		int star = n;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<sp ;j++)
			{
				System.out.print("  ");
			}
			for(int j=0; j<star; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			sp++;
			star-=2;
		}
	}
}
