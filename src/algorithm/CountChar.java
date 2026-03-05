package algorithm;

public class CountChar {

	public static void main(String[] args) {
		String val = "hgfvthvfgyggffytfggg";
		String search = "f";
		
		int origLen = val.length();
		
		val = val.replace(search, "");
		int newLen = val.length();
		
		int numbOcc = origLen - newLen;
		System.out.println("Number of occurrences of " + search + " is " +numbOcc);
	}
	
	
}
