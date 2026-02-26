/*
==========================================================
PROGRAM NAME: ArrayExample

PURPOSE:
This program shows how arrays work in Java.

Concepts used:
1) Array declaration
2) Array initialization
3) Access array using index
4) For loop (traditional)
5) Enhanced for loop (for-each)

Array = A container that stores multiple values of same type.
==========================================================
*/
package java_basis;

public class ArrayExample {

    public static void main(String[] args) {

        // ---------- Creating an Array ----------
        int[] empIDs = new int[3];   // create array of size 3

        // storing values inside array using index
        empIDs[0] = 12345;   // first position (index starts from 0)
        empIDs[1] = 67890;   // second position
        empIDs[2] = 54321;   // third position


        // Syntax for array declaration:
        // datatype[] arrayName = new datatype[size];


        // ---------- Normal FOR LOOP ----------
        // used when we want index number also
        /*
        for (int i = 0; i < empIDs.length; i++) {
            System.out.println("Employee ID at index " + i + " : " + empIDs[i]);
        }
        */


        // ---------- Enhanced FOR LOOP (For-each) ----------
        // simpler way to read array values
        for (int i : empIDs) {
            System.out.println("Employee ID: " + i);
        }


        // ---------- Declare & Initialize in one line ----------
        // String array example
        String[] empNames = {"Jane", "John", "Alice"};

        for (String name : empNames) {
            System.out.println("Employee Name: " + name);
        }

    }
}
