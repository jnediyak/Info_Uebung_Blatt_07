package p1;

public class P1_main {

	public static void main(String[] args) {
		

	}

	public static void multFrac(int z1, int n1, int z2, int n2) {
		
		System.out.println(z1 * z2 + ":" + n1 * n2);	
	}
	
	public static void multFrac(Bruch a, Bruch b) {
		
		System.out.println(a.z * b.z + ":" + a.n * b.n);
	}
}
