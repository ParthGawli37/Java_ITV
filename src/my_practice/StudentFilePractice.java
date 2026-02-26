package my_practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class StudentFilePractice {
	
	

	public static void main(String[] args) {
		
		// Step 1 - Create File Object
		File objFile = new File("C:\\Users\\parth\\eclipse-workspace\\Java_Sessions\\src\\my_practice\\StudentLog.txt");
		
		try {
			if (objFile.createNewFile()) {
				System.out.println("File created successfully");
			} else {
				System.out.println("File already exists");
			}
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		//Write File Block
		try {
			FileWriter writer = new FileWriter(objFile, true);
			
			writer.write("\n-------------------\n");
			writer.write("Execution Time: " + new java.util.Date() +" \n");
			writer.write("Student Name: \n");
			writer.write("Course: Software Testing\n");
			writer.write("Status: Active\n");
			
			
			writer.close();
			
			System.out.println("Data written successfully");
			
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		//Read File Block
		

	}

}
