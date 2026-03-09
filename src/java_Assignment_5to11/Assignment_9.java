package java_Assignment_5to11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Assignment_9 {

	public static void main(String[] args) {
	
		
		//Q1 Array List//
		ArrayList<String> browsers = new ArrayList<>();
		
		browsers.add("Chrome");
		browsers.add("Firefox");
		browsers.add("Edge");
		browsers.add("Brave");
		browsers.add("Edge"); //Duplicate
		
		for (String browser : browsers) {
			System.out.println(browser);
		}
		
		System.out.println("==============");
		
		//Q2 removing Duplicate value
		HashSet<String> uniqueBrowsers = new HashSet<>(browsers);
		
		System.out.println(uniqueBrowsers);
		
		System.out.println("===============");
		
		//Q3 HashMap for user & password//
		HashMap<String, String> users = new HashMap<>();
		users.put("admin", "admin123");
		users.put("tester", "tester123");
		users.put("user", "user123");
		
		for (String username : users.keySet()) {
			System.out.println(username + " : " + users.get(username));
		}
		
		System.out.println("=================");
		
		//Q4 Sort number in Ascending and Descending//
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(46);
		numbers.add(67);
		numbers.add(10);
		numbers.add(88);
		numbers.add(96);
		numbers.add(0);
		
		Collections.sort(numbers);
		
		System.out.println("Ascending: " + numbers);
		
		Collections.sort(numbers, Collections.reverseOrder());
		
		System.out.println("Descending: " + numbers);
		
		
	}

}
