package programmingclass;

public class Rhombus {
	public static void main(String[] args) {
		int n=4;
		int star = 1;
		int sp = n-1;
		for(int i=0;i<n;i++)
		{
			for (int j = 0; j < sp; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < star; j++) {
				System.out.print("* ");
			}
			System.out.println();
			star+=2;
			sp--;
		}
		int star1 = 2*n-2;
		int sp1 = 1;
		for(int i=0;i<n;i++)
		{
			for (int j = 0; j < sp1; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j < star1; j++) {
				System.out.print("* ");
			}
			System.out.println();
			star1-=2;
			sp1++;
		}
	}
}
