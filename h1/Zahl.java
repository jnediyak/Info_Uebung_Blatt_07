package h1;

public class Zahl {

	int num;
	boolean even, small, positive;
	
	public void setEven() {
		even = num%2 == 0;
	}
	
	public void setSmall() {
		small = num < 100;
	}
	
	public void setPositive() {
		positive = num > 0;
	}
}
