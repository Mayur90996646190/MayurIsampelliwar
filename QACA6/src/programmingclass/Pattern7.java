package programmingclass;

public class Pattern7 {
	public static void main(String[] args) {
		int n=5;
		int sp =0;
		int star = n;
		for(int i=0; i<n; i++)
		{	int a = 1;
			for(int j=0; j<sp ;j++)
			{
				System.out.print("  ");
			}
			for(int j=0; j<star; j++)
			{
				System.out.print(a++ + " ");
			}
			System.out.println();
			sp++;
			star-=2;
		}
	}
}
