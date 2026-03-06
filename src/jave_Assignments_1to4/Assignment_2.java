package jave_Assignments_1to4;

import java.util.Scanner;

public class Assignment_2 {

	public static void main(String[] args) {
		// 1- Printing 10 to 1 in reverse order
				System.out.println("Reverse Numbers (10 to 1):");
				for (int i = 10; i >= 1; i--) {
					System.out.println(i);
				}
				
				// 2- Menu using do while loop
				Scanner sc = new Scanner(System.in);
				int choice;
				
				do {
					System.out.println("\n--MENU--");
					System.out.println("1. Option 1");
					System.out.println("2. Option 2");
					System.out.println("3. Exit");
					System.out.println("Enter your choice:");
					
					choice = sc.nextInt();
				} while (choice != 3);
				
				System.out.println("Exit Successful");
				sc.close();
				
				// 3- table of 5 x i = i
				int i = 1;
				
				while (i <= 10) {
					System.out.println("5 x " + i + " = " + (5 * i));
					i++;
				}
				// 4- 3x3 array sum
				int[][] arr = {
						{1, 2, 3},
						{4, 5, 6},
						{7, 8, 9}
				};
				
				int sum = 0;
				 for (int x = 0; x < 3; x++) {
					 for (int y = 0; y < 3; y++) {
						 sum += arr[x][y];
					 }
				 }
				
				 System.out.println("Sum of all elemnets: " + sum);

	}

}
