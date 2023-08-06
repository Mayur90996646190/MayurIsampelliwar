package programmingclass;

import java.util.Scanner;

public class ToUppercase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "Mayur";
		char[] ch = s.toCharArray();
		String sum = "";
		for (int i = 0; i < ch.length; i++) {
			char ch1 = 0 ;
			if(ch[i]>=97 && ch[i]<=122)
			{
				ch1 = (char) (ch[i]-32);
			}
			else
				ch1=ch[i];
			
			sum = sum+ch1;
		}
		System.out.println(sum);
	}
}
