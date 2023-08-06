package programmingclass;

import java.util.Scanner;

public class Str20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password");
		String s = sc.nextLine();
		char[] ch = s.toCharArray();
		int up=0; int low=0; int digit=0;
		int spe=0; int space=0;
		if(s.length()>=8 && s.length()<=15)
		{
			for(int i=0;i<ch.length;i++)
			{
				char c = ch[i];
				if(c>='A' && c<='Z')
					up++;
				else if(c>='a' && c<='z')
					low++;
				else if(c>='0' && c<='9')
					digit++;
				else if(c==' ')
					space++;
				else if(c=='$' || c=='#'||c=='@'||c=='!')
					spe++;
			}
			if(up>=1 && low>=1 && digit>=1 && space==0 && spe>=1)
			{
				System.out.println("Correct Password");
			}
		}
		else
		{
			System.out.println("Invalid Password");
			System.out.println("Enter the password in valid range");
		}
	}
}
