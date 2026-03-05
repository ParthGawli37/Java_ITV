package java_Assignment;

import java.util.Scanner;

public class Assignment_1 {

	public static void main(String[] args) {
		// Primitive Data Types
        byte b = 10;
        short s = 2000;
        int i = 50000;
        long l = 100000L;

        float f = 5.75f;
        double d = 19.99;

        char c = 'A';
        boolean bool = true;

        // Non-Primitive Data Type
        String str = "Hello Java";

        // Printing values
        System.out.println("Byte value: " + b);
        System.out.println("Short value: " + s);
        System.out.println("Int value: " + i);
        System.out.println("Long value: " + l);
        System.out.println("Float value: " + f);
        System.out.println("Double value: " + d);
        System.out.println("Char value: " + c);
        System.out.println("Boolean value: " + bool);
        System.out.println("String value: " + str);
        
        
        //ODD EVEN using if-else
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number below to check if it EVEN or ODD-");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num >= 0) {   // First condition
            if (num % 2 == 0) {   // Nested condition
                System.out.println("Positive Even");
            } else {
                System.out.println("Positive Odd");
            }
        } else {
            System.out.println("Negative Number");
        }

        sc.close();
	

	}

}
