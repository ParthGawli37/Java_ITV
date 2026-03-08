
package java_Assignment_5to11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assignment_8 {

	public static void main(String[] args) {
		//Q1 File created and status confirmed
		try {
			File file = new File("execution_status.txt");
			
			if (file.createNewFile()) {
				System.out.println("File created: " + file.getName());
			} else {
				System.out.println("File already exists.");
			}
			
			FileWriter writer = new FileWriter(file);
			writer.write("Execution Status: SUCCESS");
			writer.close();
			
			System.out.println("Status written ti file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
		//Q2 Test case add to the execution file.
		try {
			FileWriter writer = new FileWriter("execution_status.txt", true);
			
			writer.write("\nTest1: PASS");
			writer.write("\nTest2: FAIL");
			writer.write("\nTest3: PASS");
			writer.write("\nTest4: FAIL");
			
			writer.close();
			
			System.out.println("Test results appended to the file.");
		} catch (IOException e) {
			System.out.println("Error writing to file.");
		}
		
		//Q3 File reader to read the data for analysis
		try {
			BufferedReader reader = new BufferedReader(new FileReader("execution_status.txt"));
			
			String line;
			
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("Error reading file.");
		}
		
		//Delete file option
		
		Scanner sc = new Scanner(System.in);
		
		File file = new File("execution_status.txt");
		
		System.out.println("Do you want to delete the file? (Y/N):");
		String choice = sc.nextLine().toLowerCase();
		
		if(choice.equals("y") || choice.equals("yes")) {
			
			if (file.delete()) {
				System.out.println("File deleted successfully.");
			} else {
				System.out.println("File could not be deleted.");
			}
			
		} else if (choice.equals("n") || choice.equals("no")) {
			
			System.out.println("File was not deleted.");
		} else {
			System.out.println("Invalid input.");
		}
		
		sc.close();		
	}

}
