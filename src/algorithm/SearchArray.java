package algorithm;  
// Declares the package where this class belongs

public class SearchArray {  
// Defines a public class named SearchArray

	public static void main(String[] args) {  
	// Main method where the program execution begins
		
		// Write an algorithm to check if a value exists in an array
		
		int[] num = {23,45,3,4};  
		// Create an integer array containing four numbers
		
		String[] arrText = {"Today", "is", "a", "holiday"};  
		// Create a String array containing words
		
		System.out.println(searchIntArray(num,4));  
		// Call the searchIntArray method to check if number 4 exists in the array
		// The result (true/false) is printed
		
		System.out.println(searchIntArray(num,44));  
		// Call the searchIntArray method to check if number 44 exists in the array
		// Since 44 is not in the array, it will print false
	}

	public static boolean searchIntArray(int[] arr, int num) {  
	// Method that searches for a number inside an integer array
	// Returns true if the number is found, otherwise false
		
		for(int i : arr) {  
		// Enhanced for-loop that goes through every number in the array
			
			if(i == num) {  
			// Check if the current element equals the number we are searching for
				
				return true;  
				// If found, return true immediately
			}
		}
		
		return false;  
		// If the loop finishes without finding the number, return false
	}

	public static boolean searchStringArray(String[] arr, String val) {  
	// Method that searches for a specific string in a string array
		
		for(String s : arr) {  
		// Loop through each string in the array
			
			if(s.equals(val)) {  
			// Compare the current string with the value we are searching for
				
				return true;  
				// If the string is found, return true
			}
		}
		
		return false;  
		// If the string is not found in the array, return false
	}

}