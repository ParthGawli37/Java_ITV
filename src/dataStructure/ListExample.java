/*
==========================================================
PROGRAM NAME: ListExample

PURPOSE:
This program demonstrates List in Java using:

1) ArrayList  → Dynamic array
2) LinkedList → Doubly linked list

List Characteristics:
✔ Allows duplicate values
✔ Maintains insertion order
✔ Allows index-based access
✔ Allows null values

Important Methods Used:
add()       → Insert element
remove()    → Remove element
get()       → Access element by index
set()       → Update element
sort()      → Sort list
contains()  → Check if element exists
clear()     → Remove all elements
==========================================================
*/

package dataStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ListExample {

    public static void main(String[] args) {

        // ==================================================
        // ARRAYLIST SECTION
        // ==================================================

        System.out.println("========== ARRAYLIST ==========");

        // Creating ArrayList object
        ArrayList<String> empNameAL = new ArrayList<String>();

        // Adding elements
        empNameAL.add("Vivek");
        empNameAL.add("Parth");
        empNameAL.add("Sarita");

        System.out.println("Original List:");
        for (String name : empNameAL) {
            System.out.println(name);
        }

        // Adding more elements
        empNameAL.add("Virendra");
        empNameAL.add("Vanita");

        System.out.println("\nUpdated List After Adding:");
        for (String name : empNameAL) {
            System.out.println(name);
        }

        // Removing element by index
        System.out.println("\nRemoving element at index 3:");
        empNameAL.remove(3);

        System.out.println("List After Removal:");
        for (String name : empNameAL) {
            System.out.println(name);
        }

        // Accessing element by index
        System.out.println("\nValue at index 0: " + empNameAL.get(0));

        // Updating element using set()
        empNameAL.set(0, "Sachin");
        System.out.println("Updated value at index 0: " + empNameAL.get(0));

        // Display before sorting
        System.out.println("\nList Before Sorting:");
        System.out.println(empNameAL);

        // Sorting in ascending order
        Collections.sort(empNameAL);
        System.out.println("List After Sorting (Ascending):");
        System.out.println(empNameAL);

        // Sorting in descending order
        Collections.sort(empNameAL, Collections.reverseOrder());
        System.out.println("List After Sorting (Descending):");
        System.out.println(empNameAL);


        // ==================================================
        // LINKEDLIST SECTION
        // ==================================================

        System.out.println("\n========== LINKEDLIST ==========");

        // Creating LinkedList object
        LinkedList<String> execStepsLL = new LinkedList<String>();

        // Adding elements
        execStepsLL.add("Login");
        execStepsLL.add("Navigate to Fund Transfer");

        // Adding at beginning
        execStepsLL.addFirst("Open Browser");

        // Adding at end
        execStepsLL.addLast("Log Out");

        System.out.println("Execution Steps:");
        System.out.println(execStepsLL);

        // Checking if element exists
        System.out.println("\nDoes list contain 'Select from Account'? "
                + execStepsLL.contains("Select from Account"));

        // Clearing all elements
        System.out.println("\nClearing the list...");
        execStepsLL.clear();

        System.out.println("List After Clear:");
        System.out.println(execStepsLL);
    }
}