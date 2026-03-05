package algorithm;

public class SearchArray {
	

	public static void main(String[] args) {
		// write an algorithm to check if a value exists in a array
		int[] num = {23,45,3,4};
		String[] arrText = {"Today", "is", "a", "holiday"}; 
		System.out.println(searchIntArray(num,4));
		System.out.println(searchIntArray(num,44));
	}
	
	public static boolean searchIntArray(int[] arr, int num) {
		for(int i: arr) {
			if(i == num) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean searchStringArray(String[] arr, String val) {
		for(String s: arr) {
			if(s.equals(val)) {
				return true;
			}
		}
		return false;
	}
	

}
