/*
==========================================================
PROGRAM NAME: SetExample

PURPOSE:
This program demonstrates different types of Set in Java.

Set Characteristics:
✔ No duplicate values allowed
✔ Stores unique elements only

Types of Set:
1) HashSet        → No order guarantee
2) TreeSet        → Sorted order
3) LinkedHashSet  → Maintains insertion order
==========================================================
*/

package dataStructure;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class setExample {

    public static void main(String[] args) {

        // ================= HASHSET =================
        System.out.println("========== HASHSET ==========");

        HashSet<String> objBrowsersHS = new HashSet<String>();

        objBrowsersHS.add("Edge");
        objBrowsersHS.add("Chrome");
        objBrowsersHS.add("Firefox");
        objBrowsersHS.add("Chrome");   // duplicate (will not be added)

        System.out.println("Displaying values in HashSet:");
        System.out.println(objBrowsersHS);

        objBrowsersHS.remove("Firefox");

        System.out.println("After removing Firefox:");
        System.out.println(objBrowsersHS);


        // ================= TREESET =================
        System.out.println("\n========== TREESET ==========");

        TreeSet<String> objBrowsersTS = new TreeSet<String>();

        objBrowsersTS.add("Edge");
        objBrowsersTS.add("Chrome");
        objBrowsersTS.add("Firefox");

        System.out.println("Displaying values in TreeSet (Sorted):");
        System.out.println(objBrowsersTS);

        objBrowsersTS.remove("Edge");

        System.out.println("After removing Edge:");
        System.out.println(objBrowsersTS);


        // ================= LINKEDHASHSET =================
        System.out.println("\n========== LINKEDHASHSET ==========");

        LinkedHashSet<String> objBrowsersLHS = new LinkedHashSet<String>();

        objBrowsersLHS.add("Opera");
        objBrowsersLHS.add("IE");
        objBrowsersLHS.add("Firefox");
        objBrowsersLHS.add("Chrome");
        objBrowsersLHS.add("Edge");

        System.out.println("Displaying values in LinkedHashSet (Insertion Order):");
        System.out.println(objBrowsersLHS);

        objBrowsersLHS.clear();

        System.out.println("After clearing LinkedHashSet:");
        System.out.println(objBrowsersLHS);

    }
}