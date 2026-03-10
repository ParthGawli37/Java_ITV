package java_Assignment_5to11;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Assignment_10 {

	public static void main(String[] args) {
		//Q1 HashSet to remove Duplicate name
		
		HashSet<String> names = new HashSet<>();
		
		names.add("Raj");
		names.add("Parth");
		names.add("Sam");
		names.add("Raj");
		
		System.out.println("Unique names: ");
		System.out.println(names);
		
		//Q2 TreeSet number sorting
		
		TreeSet<Integer> numbers = new TreeSet<>();
		
		numbers.add(10);
		numbers.add(6);
		numbers.add(34);
		numbers.add(99);
		
		System.out.println("Sorted numbers: ");
		System.out.println(numbers);
		
		//Q3 LinkedHastSet keep in inserted order
		LinkedHashSet<String> fruits = new LinkedHashSet<>();
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Pineapple");
		fruits.add("Mango");
		
		System.out.println("Insertion order preserved:");
		System.out.println(fruits);
		
		//Q4 HashSet to see if value exist in the set.
		HashSet<String> elements = new HashSet<>();
		
		elements.add("Fire");
		elements.add("Water");
		elements.add("Wind");
		elements.add("Earth");
		
		if (elements.contains("Earth")) {
			System.out.println("Earth exist in the set of Elements.");
		} else {
			System.out.println("Earth not found.");
		}

	}

}
