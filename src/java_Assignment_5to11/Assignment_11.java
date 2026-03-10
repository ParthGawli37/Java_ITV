package java_Assignment_5to11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class Assignment_11 {

	public static void main(String[] args) {
		//Q1 HashMap to Store User name and Password.
		
		HashMap<String, String> users = new HashMap<>();
		
		users.put("admin", "admin123");
		users.put("tester", "tester123");
		users.put("user", "user123");
		
		for (String username : users.keySet()) {
			System.out.println(username + " : " + users.get(username));
		}
		
		//Q2 TreeMap to sort test cases
		TreeMap<Integer, String> testCases = new TreeMap<>();
		
		testCases.put(103, "Login Test");
		testCases.put(101, "Signup Test");
		testCases.put(102, "Logout Test");
		
		System.out.println("Sorted Test Cases:");
		System.out.println(testCases);
		
		//Q3 LinkedHashMap for to keep in insertion order
		
		LinkedHashMap<Integer, String> steps = new LinkedHashMap<>();
		
		steps.put(1, "Open browser");
		steps.put(2, "Login");
		steps.put(3, "Logout");
		
		System.out.println("Steps in order: ");
		System.out.println(steps);
		
		//Q4 
		
		HashMap<String, String> usernms = new HashMap<>();
		
		usernms.put("Admin", "admin@123");
		usernms.put("Tester", "tester@123");
		usernms.put("User", "user@123");
		
		Iterator<Map.Entry<String, String>> iterator =
				usernms.entrySet().iterator();
		
		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = iterator.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		

	}

}
