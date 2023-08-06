package programmingclass;
/*
 * mayur
 * mayu
 * may
 * ma
 * m
 * 
 */
public class Str32 {
	public static void main(String[] args) {
		String s = "Mayur";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) { 
			
			for (int j = 0; j < ch.length-i; j++) {
				System.out.print(ch[j]);
			}
			System.out.println();
		}
	}
}
