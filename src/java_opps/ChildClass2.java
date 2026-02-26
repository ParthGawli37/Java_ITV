/*
==========================================================
CLASS NAME: ChildClass2

PURPOSE:
This child class is in the SAME PACKAGE as parent class.

Parent package → java_opps
Child package  → java_opps

Since it is in same package, it can access:
✔ public members
✔ protected members
✔ default members
❌ private members

This proves SAME PACKAGE inheritance access.
==========================================================
*/

package java_opps;

public class ChildClass2 extends AccessModExample {

    public static void main(String[] args) {

        ChildClass2 obj = new ChildClass2();  // create child object

        // Printing value coming from parent class
        System.out.println("Value from parent class:");
        obj.printName();   // prints "Raj"
    }
}

