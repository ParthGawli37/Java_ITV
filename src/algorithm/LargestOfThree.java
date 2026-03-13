package algorithm;  
// Declares the package where this class belongs

public class LargestOfThree {  
// Defines a public class named LargestOfThree

	public static void main(String[] args) {  
	// Main method where program execution starts
		
		LargestThree(4,2,35);  
		// Calls the LargestThree method with numbers 4, 2, and 35
		
		LargestThree(-29,-1,-3);  
		// Calls the LargestThree method again with different numbers
	}

	public static int LargestThree(int a, int b, int c) {  
	// A method that takes three integers and returns one integer
		
		if((a>b) && (a<c)) {  
		// Checks if 'a' is greater than 'b' AND less than 'c'
			
			return a;  
			// If condition is true, return 'a'
			
		} else if((b>a) && (b<c)) {  
		// Checks if 'b' is greater than 'a' AND less than 'c'
			
			return b;  
			// If condition is true, return 'b'
			
		}else {  
		// If neither of the above conditions are true
			
			return c;  
			// Return 'c'
		}
	}

}