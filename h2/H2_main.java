package h2;

import java.util.Arrays;

public class H2_main {

	public static void main(String[] args) {
		int[] a = { 2, 7, 1, 9 };
		int[] b = { 2, 7, 1, 9 };
		int start = 3;
		int end = 2;
		System.out.println(Arrays.toString(change(a, b, start, end)));

	}

	public static int[] change(int[] a, int[] b, int start, int end) {
		if (start < end) {
			if (Arrays.compare(a, b) != 0) {
				int[] c = a.clone();
				return c;
			}
			Arrays.sort(a);
			int[] c = Arrays.copyOfRange(a, start, end);
			return c;
		}
		int[] c = new int[0];
		return c;
	}

}
