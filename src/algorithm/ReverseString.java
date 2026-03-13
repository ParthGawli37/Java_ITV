package algorithm;  
// Defines the package where this class belongs

public class ReverseString {  
// Declares a public class named ReverseString

	public static void main(String[] args) {  
	// Main method where program execution starts
		
		System.out.println(reverseString("Java"));  
		// Calls the reverseString method with the word "Java"
		// Prints the reversed result returned by the method

	}

	public static String reverseString(String val) {  
	// A static method that takes a string as input and returns its reversed version
		
		String rev = " ";  
		// Create a variable to store the reversed string
		// Currently it starts with a space
		
		for(int i = val.length() - 1; i > 0; i--) {  
		// Loop starts from the last character of the string
		// Moves backwards toward the first character
		
			char c = val.charAt(i);  
			// Get the character at position 'i'
			
			rev = rev + c;  
			// Append that character to the reversed string
		}
		
		return rev;  
		// Return the final reversed string
	}

}