package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Fnf out if there are any occurence of the word "java" in sentence.

public class RegexExample {

	public static void main(String[] args) {
		
		String sentence = "rahul.kamat";
//		String sentence = "I am learning Jave Programing language.";
		Pattern pat = Pattern.compile("@gmail.com", Pattern.CASE_INSENSITIVE);
//		Pattern pat = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
		Matcher mat = pat.matcher(sentence);
		boolean found = mat.find();
		
		
		if(found) {
			System.out.println("The value is in the email format.");
			} else {
				System.out.println("\"The value is not found in the email format.");
			}

	}

}
