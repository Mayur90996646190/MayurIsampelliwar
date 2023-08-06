package programmingclass;

import java.util.Scanner;

public class StrPangram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an String ");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int[] a = frequency(s1);
		int[] b = frequency(s2);
	}
	public static int[] frequency(String s1)
	{
		int[] a = new int[26];
		char[] ch = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='A' && ch[i]<='Z')
			{
				a[ch[i]-65]++;
			}
		}
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='a' && ch[i]<='z')
			{
				a[ch[i]-97]++;
			}
		}
		return a;
	}
	public static boolean isPangram(int[] a,int[] b)
	{
		for (int i = 0; i < b.length; i++) {
			if(a[i]!=b[i])
			{
				return false;
			}
			
		}
		return true;
	}
}
