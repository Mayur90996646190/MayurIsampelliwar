package programmingclass;

public class Str31 {
	public static void main(String[] args) {
		String s = "BANGALORE*";
		char[] ch = s.toCharArray();
		int n = 4;
		int k=0;
		for (int i = 0; i < n; i++) {
			
			for (int j =0; j < n; j++) {
				if(i>=j)
				{
					System.out.print(ch[k]+" ");
					k++;
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
