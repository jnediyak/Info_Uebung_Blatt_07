package p2;

public class LetterGame {

	String keyString = "FRANZ JAGT IM KOMPLETT VERWAHRLOSTEN TAXI QUER DURCH BERLIN!";
	String word = "";
	int[] a;
	
	
	public void setWord(int[] a) {
		
		for(int i = 0; i < a.length; i++) {
			word += keyString.charAt(a[i]);
		}
	}
	
	public void findCode(String s) {
		
		a = new int[s.length()];
		for(int i = 0; i < s.length(); i++) {
			a[i] = keyString.indexOf(s.charAt(i));
		}
	}
}
