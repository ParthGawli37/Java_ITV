/*
==========================================================
PROGRAM NAME: FileManagement

PURPOSE:
This program demonstrates File Handling in Java.

Operations:
1) Create file
2) Write into file
3) Read file
4) Delete file

Important classes:
File        → create/delete file
FileWriter  → write file
Scanner     → read file
==========================================================
*/

package my_practice;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

    public static void main(String[] args) {

        String path = "C:\\Users\\parth\\eclipse-workspace\\Java_Sessions\\src\\my_practice\\Execution_Log.log";   // file name
        File objFile = new File(path);      // create file object


        // ================= CREATE FILE =================
        try {
            if (objFile.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        // ================= WRITE FILE =================
        try {
            FileWriter objWrite = new FileWriter(objFile);

            objWrite.write("Test execution started\n");
            objWrite.write("Executing test case number 1\n");
            objWrite.write("Executing test case number 2\n");

            objWrite.close();   // must close writer
            System.out.println("Data written successfully");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        // ================= READ FILE =================
        try {
            Scanner objRead = new Scanner(objFile);

            System.out.println("\nReading file content:");

            while (objRead.hasNextLine()) {
                System.out.println(objRead.nextLine());
            }

            objRead.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }


        // ================= DELETE FILE =================
//        if (objFile.delete()) {
//            System.out.println("\nFile deleted successfully");
//        } else {
//            System.out.println("\nFile NOT deleted");
//        }

    }
}
