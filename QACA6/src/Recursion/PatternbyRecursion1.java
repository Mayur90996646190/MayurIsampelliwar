package Recursion;

public class PatternbyRecursion1 {
	public static void main(String[] args) {
		int n=4;
		int i=0;   // i initialization
		i_loop(n,i);  // i loop
	}
	public static int i_loop(int n, int i) {
		if(i==n)		// i condition
			return 151; // anything return i loop end statement
		int j=0;		// j initialization
		j_loop(n,i,j);		//j loop
		System.out.println();
		i++;			// i updation
		return i_loop(n,i);
	}
	public static int j_loop(int n, int i, int j) {
		if(j==n)		// j condition
			return 565; //anything return j loop end statement
		if(i>=j)
			System.out.print("* ");
		else 
			System.out.print("  ");
		j++;			// j updation
		return j_loop(n,i,j);
	}
}
