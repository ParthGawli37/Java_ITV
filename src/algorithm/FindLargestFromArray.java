package algorithm;

public class FindLargestFromArray {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5};
		int largest = numbers[0];
		
		//Find the the largest number in the array.
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i] > largest) {
				largest = numbers[i];
			}
		}
		System.out.println("The largest number in array is: " + largest);

	}

}
