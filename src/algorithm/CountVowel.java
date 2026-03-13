package algorithm;  // Defines the package name where this class belongs

public class CountVowel {  // Declares a public class named CountVowel

	public static void main(String[] args) {  // Main method where program execution starts
		
		String val = "This is such a wonderful day";  
		// Create a String variable 'val' that stores the sentence to analyze
		
		String[] vowels = {"a", "e", "i", "o", "u"};  
		// Create an array that stores all lowercase vowel letters
		
		int orifLen = val.length();  
		// Store the original length of the string before removing vowels
		
		for(String s: vowels) {  
			// Loop through each vowel in the vowels array
			
			val = val.replace(s,"");  
			// Remove all occurrences of the current vowel from the string
		}
		
		int newLen = val.length();  
		// Get the new length of the string after removing vowels
		
		int vowelCount = orifLen - newLen;  
		// Calculate the number of vowels by subtracting new length from original length
		
		System.out.println("Number of vowels: " + vowelCount);  
		// Print the total number of vowels found in the original string
	}

}