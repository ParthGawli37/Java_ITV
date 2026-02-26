/*
==========================================================
PROGRAM NAME: StringExample

PURPOSE:
This program shows commonly used String methods in Java.

Concepts used:
1) length()      → count characters
2) toUpperCase() → convert text to capital letters
3) toLowerCase() → convert text to small letters
4) contains()    → check if word exists
5) equals()      → compare two strings
6) substring()   → get part of string
7) replace()     → replace text
8) charAt()      → get character by index
==========================================================
*/
package java_basis;

public class StringExample {

    public static void main(String[] args) {

        String statement = "This is Java programming.";   // main string variable

        System.out.println("Original String: " + statement);

        // ---------- length() ----------
        System.out.println("Length: " + statement.length());  // counts total characters


        // ---------- uppercase / lowercase ----------
        System.out.println("Uppercase: " + statement.toUpperCase());  // convert to capital letters
        System.out.println("Lowercase: " + statement.toLowerCase());  // convert to small letters


        // ---------- contains() ----------
        System.out.println("Contains 'Java'? " + statement.contains("Java"));     // checks word exists
        System.out.println("Contains 'Python'? " + statement.contains("Python")); // checks word exists


        // ---------- equals() ----------
        String another = "This is Java programming.";   // another string
        System.out.println("Equals another string? " + statement.equals(another)); // compares both strings


        // ---------- substring() ----------
        System.out.println("Substring (0-4): " + statement.substring(0, 4));  
        // takes characters from index 0 to 3


        // ---------- replace() ----------
        System.out.println("Replace Java → Python: " + statement.replace("Java", "Python"));  
        // replaces Java with Python


        // ---------- charAt() ----------
        System.out.println("Character at index 5: " + statement.charAt(5));  
        // gets character at position 5

    }
}
