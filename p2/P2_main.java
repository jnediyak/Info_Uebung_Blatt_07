package p2;

import java.util.Arrays;

public class P2_main {

	public static void main(String[] args) {

		LetterGame g = new LetterGame();
		g.setWord(new int[]  {14,2,0,0,19,19});
		System.out.println(g.word);
		g.findCode("UNI");
		System.out.println(Arrays.toString(g.a));
	}
	
	

}
