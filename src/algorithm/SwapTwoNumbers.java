package algorithm;

public class SwapTwoNumbers {

	public static void main(String[] args) {
	
		int a = -564;
		int b = 287;
		
		a = b-a;
		b = b-a;
		a = a+b;
		
		System.out.println("a:" + a);
		System.out.println("b:" + b);
	}

}
