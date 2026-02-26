/*
==========================================================
PROGRAM NAME: MapExample

PURPOSE:
This program demonstrates Map in Java.

Map:
✔ Stores elements in Key-Value pair format
✔ Keys must be UNIQUE
✔ Values can be duplicate
✔ One key maps to one value

Map Implementations:
- HashMap        → Random order
- LinkedHashMap  → Insertion order
- TreeMap        → Sorted order (based on keys)
==========================================================
*/

package dataStructure;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapExample {

    public static void main(String[] args) {

        // ==================================================
        // HASHMAP SECTION
        // ==================================================

        // Creating HashMap object
        // <Integer,String> → Key type is Integer, Value type is String
        HashMap<Integer,String> empDtlsHM = new HashMap<Integer,String>();

        // Adding elements using put(key,value)
        empDtlsHM.put(1, "Parth");
        empDtlsHM.put(2, "Vivek");
        empDtlsHM.put(3, "Sarita");

        // Duplicate key example
        // Key 1 already exists
        // So value "Parth" will be replaced with "Vanita"
        empDtlsHM.put(1, "Vanita");


        // ================= PRINTING KEYS =================
        System.out.println("=============== Printing the list of all keys ===============");

        // keySet() → returns all keys
        for(int i : empDtlsHM.keySet()) {
            System.out.println(i);
        }


        // ================= PRINTING VALUES =================
        System.out.println("=============== Printing the list of all Values =============");

        // values() → returns all values
        for(String s : empDtlsHM.values()) {
            System.out.println(s);
        }


        // ================= PRINTING KEY + VALUE =================
        System.out.println("============== Printing all keys and their Values ==============");

        // Loop through keys
        // get(i) → fetch value using key
        for(int i : empDtlsHM.keySet()) {
            System.out.println("For key: " + i +
                               " the value is " + empDtlsHM.get(i));
        }


        // ================= CHECKING METHODS =================

        // containsKey() → checks if key exists
        System.out.println(empDtlsHM.containsKey(4));

        // containsValue() → checks if value exists
        System.out.println(empDtlsHM.containsValue("Vivek"));


        // ================= REMOVE ELEMENT =================
        System.out.println("Removing key 2");

        // remove(key) → removes key-value pair
        empDtlsHM.remove(2);

        System.out.println("============== Printing updated map ==============");

        for(int i : empDtlsHM.keySet()) {
            System.out.println("For key: " + i +
                               " the value is " + empDtlsHM.get(i));
        }



        // ==================================================
        // LINKEDHASHMAP SECTION
        // ==================================================

        // LinkedHashMap maintains insertion order
        LinkedHashMap<Integer,String> empDtlsLHM =
                new LinkedHashMap<Integer,String>();

        empDtlsLHM.put(10, "Viraj");
        empDtlsLHM.put(11, "Virendra");
        empDtlsLHM.put(14, "Shruti");


        System.out.println("=================== Printing all keys =================");

        for(int x : empDtlsLHM.keySet()) {
            System.out.println(x);
        }


        System.out.println("=================== Printing all keys and values =================");

        for(int a : empDtlsLHM.keySet()) {
            System.out.println("For key: " + a +
                               " the value is " + empDtlsLHM.get(a));
        }


        // ==================================================
        // TREE MAP 
        // ==================================================

        TreeMap<Integer,String> empDtlsTM =
                new TreeMap<Integer,String>();

        // TreeMap automatically sorts keys
        empDtlsTM.put(50, "Aman");
        empDtlsTM.put(20, "Riya");
        empDtlsTM.put(40, "Kunal");

        System.out.println("=================== TreeMap (Sorted Keys) =================");

        for(int key : empDtlsTM.keySet()) {
            System.out.println("For key: " + key +
                               " the value is " + empDtlsTM.get(key));
        }

    }
}