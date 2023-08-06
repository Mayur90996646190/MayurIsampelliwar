package programmingclass;

public class StringOccuranceOfCharacter {
	public static void main(String[] args) {
		String s = "google";
		char[] ch = s.toCharArray();
		boolean[] b =new boolean[ch.length];
		int count =1;
		for (int i = 0; i < ch.length; i++) {
			if(b[i]==false)
			{
				for (int j = i+1; j < ch.length; j++) {
					if(ch[i]==ch[j])
					{
						count++;
						b[j] = true;
					}
				}
				if(count>=1)
					System.out.println(ch[i]+" " + count);
			}
		}
	}
}
