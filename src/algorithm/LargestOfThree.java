package algorithm;

public class LargestOfThree {

	public static void main(String[] args) {
		LargestThree(4,2,35);
		LargestThree(-29,-1,-3);
	}
	 public static int LargestThree(int a, int b, int c) {
		 
		 if((a>b) && (a<c)) {
			 return a;
		 } else if((b>a) && (b<c)) {
			 return b;
		 }else {
			 return c;
		 }
	 }

}
  