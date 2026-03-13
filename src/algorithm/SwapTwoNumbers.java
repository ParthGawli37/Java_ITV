package algorithm;  
// Defines the package where this class is organized in the project

public class SwapTwoNumbers {  
// Declares a public class named SwapTwoNumbers

	public static void main(String[] args) {  
	// Main method where the program starts running
	
		int a = -564;  
		// Declare integer variable 'a' and assign it the value -564
		
		int b = 287;  
		// Declare integer variable 'b' and assign it the value 287
		
		a = b - a;  
		// Update 'a' by subtracting 'a' from 'b'
		// This is the first step of swapping values without using a third variable
		
		b = b - a;  
		// Update 'b' using the new value of 'a'
		// This changes 'b' to the original value of 'a'
		
		a = a + b;  
		// Update 'a' again by adding 'b'
		// This results in 'a' becoming the original value of 'b'
		
		System.out.println("a:" + a);  
		// Print the new value of 'a' (which was originally the value of 'b')
		
		System.out.println("b:" + b);  
		// Print the new value of 'b' (which was originally the value of 'a')
	}

}