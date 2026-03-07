package java_Assignment_5to11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment_7 {
	
	public static void main(String[] args) {
		//Q3
		checkAge(18);
		
		
		//Q1
		int a = 10;
		int b = 0;
		
		try {
		int result = a / b;
		
		System.out.println("Result:" + result);
	} catch ( ArithmeticException e) {
		System.out.println("Error: Cannot divide by zero.");
	}
		//Q2
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter number:");
			int num = sc.nextInt();
			
			System.out.println("You entered: " + num);
		} catch (InputMismatchException e) {
			System.out.println("INVALID INPUT! Please enter a number.");
		}finally {
			System.out.println("Program finished.");
		}
		
		//Q4
		try {
			int x = 10 / 0;
			
			String text = null;
			System.out.println(text.length());
			
		} catch (ArithmeticException |NullPointerException e) {
			System.out.println("An exception occured: " + e.getMessage());
		}
		
	}
	
	public static void checkAge(int age) {
		
		if (age < 18) {
			throw new IllegalArgumentException("Age must be 18 or older.");
			
		}
		System.out.println("Access granted.");
	}
	
	
	

}
