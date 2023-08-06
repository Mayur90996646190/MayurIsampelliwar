package programmingclass;

public class NoofVowelandConsonents {
	public static void main(String[] args) {
		String s = "Aeio";
		int vowels=0;
		int consonents = 0;
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			char ch1=ch[i];
			if(ch1>='A' && ch1<='Z'|| ch1>='a' && ch1<='z')
			{
				if(ch1=='A'|| ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U'||ch1=='a'||ch1=='i'||ch1=='o'||ch1=='u'||ch1=='e')
				{
					vowels++;
				}
				else
					consonents++;
			}
			
		}
		System.out.println(vowels);
		System.out.println(consonents);
		
	}
}
