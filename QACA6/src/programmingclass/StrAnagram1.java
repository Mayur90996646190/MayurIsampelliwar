package programmingclass;

import java.util.Scanner;

public class StrAnagram1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		String s2 = s.nextLine();
		int[] a= frequency(s1);
		int[] b = frequency(s2);
		boolean res = isAnagram(a,b);
		if(res)
		{
			System.out.println("anagram");
		}
		else
			System.out.println("Not a anagram");
	}

	public static int[] frequency(String s1) {
		int[] a = new int[26];
		char[] ch = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				a[ch[i] - 65]++;
			} else if (ch[i] <= 'a' && ch[i] >= 'z') {
				a[ch[i] - 97]++;
			}

		}
		return a;
	}
	public static boolean isAnagram(int[] a, int[] b)
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
