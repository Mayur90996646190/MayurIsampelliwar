package programmingclass;

public class Str24Occurance {
	public static void main(String[] args) {
		String s = "aaabbcdeefg";
		char[] ch = s.toCharArray();
		boolean[] b = new boolean[s.length()];
		for (int i = 0; i < b.length; i++) {
			if(b[i]==false)
			{
				int count=1;
				for (int j = i+1; j < b.length; j++) {
					if(ch[i]==ch[j])
					{
						b[j] = true;
						count++;
					}
				}
				if(count>1)
					System.out.println(ch[i] + " " + count);
			}
		}
		
	}
}
