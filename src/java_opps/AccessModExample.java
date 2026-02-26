/*
==========================================================
PROGRAM NAME: AccessModExample

PURPOSE:
This program demonstrates Access Modifiers in Java.

Access Modifiers control who can access variables/methods.

public     → accessible everywhere
private    → accessible only inside same class
default    → accessible inside same package only
protected  → accessible inside same package + child class

NOTE:
Only ONE method can be active at a time.
Other versions are kept commented for learning.
==========================================================
*/

package java_opps;

public class AccessModExample {

    // Protected variable → accessible in same package + child class
    protected String name = "Raj";


    // ================= PUBLIC MODE =================
//     public void printName() {
//         System.out.println(name);
//     }


    // ================= PRIVATE MODE =================
    // private void printName() {
    //     System.out.println(name);
    // }


    // ================= DEFAULT MODE =================
    // void printName() {
    //     System.out.println(name);
    // }


    // ================= PROTECTED MODE (ACTIVE) =================
    protected void printName() {
        System.out.println(name);   // prints the value of name
    }



    public static void main(String[] args) {

        // Creating object of class
        AccessModExample obj = new AccessModExample();

        // Assigning value to variable
        obj.name = "Raj";

        // Calling method
        obj.printName();

    } // end of main

} // end of class
