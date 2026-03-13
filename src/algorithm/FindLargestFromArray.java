package algorithm;  
// Declares the package where this class is located

public class FindLargestFromArray {  
// Defines a public class named FindLargestFromArray

	public static void main(String[] args) {  
	// Main method where program execution starts
		
		int[] numbers = {1,2,3,4,5};  
		// Create an integer array named 'numbers' containing 5 values
		
		int largest = numbers[0];  
		// Assume the first element of the array is the largest initially
		
		// Find the largest number in the array.
		for(int i = 0; i < numbers.length; i++) {  
		// Loop through every element in the array
		
			if(numbers[i] > largest) {  
			// Check if the current element is greater than the current largest value
				
				largest = numbers[i];  
				// If true, update 'largest' with the current element
			}
		}
		
		System.out.println("The largest number in array is: " + largest);  
		// Print the largest number found in the array

	}

}