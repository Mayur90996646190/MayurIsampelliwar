package programmingclass;
//Char[] to String 
public class StringConstructors {
	public static void main(String[] args) {
		
		char[] ch = {'M','A','Y','U','R'};
		String s1="";
		
		for (int j = 0; j < ch.length; j++) {
			s1 = s1 + ch[j];
		}
		System.out.println(s1);
		
		////Char[] to String 
		String s = new String(ch);
		System.out.println(s);
		
		//String(String str)
		String s2 = new String("Java");
		
		//String(char[] ch)
		String s3 = new String(ch);
		System.out.println(s3);
		
		String s4 = new String();
		System.out.println(s4);
	}
}
