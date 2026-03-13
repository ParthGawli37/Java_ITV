package algorithm;  
// Declares the package where this class belongs

public class CountChar {  
// Defines a public class named CountChar

	public static void main(String[] args) {  
	// Main method where program execution starts
		
		String val = "hgfvthvfgyggffytfggg";  
		// Create a string variable containing the text to analyze
		
		String search = "f";  
		// Character we want to count in the string
		
		int origLen = val.length();  
		// Store the original length of the string before removing characters
		
		val = val.replace(search, "");  
		// Remove all occurrences of the character stored in 'search'
		// This creates a new string without those characters
		
		int newLen = val.length();  
		// Store the new length of the string after removing the characters
		
		int numbOcc = origLen - newLen;  
		// Calculate how many times the character appeared
		// The difference between the original and new length equals the count
		
		System.out.println("Number of occurrences of " + search + " is " + numbOcc);  
		// Print the result showing how many times the character appeared
	}
	
}