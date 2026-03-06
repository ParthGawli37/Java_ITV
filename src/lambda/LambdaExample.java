package lambda;

import java.util.ArrayList;

public class LambdaExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		
//		System.out.println("Using for Loop");
//		for(int i=0; i<numbers.size(); i++) {
//			System.out.println(" " + numbers.get(i));
//		}
//		System.out.println();
		
		System.out.println("Using for-each loop");
		for(Integer num : numbers) {
			num += num;
			System.out.print(" " + num);
		}
		System.out.println();
		
		System.out.println("Using Lambda expression");
		numbers.forEach((num) -> System.out.print(" " + num));
		
	}

}
