/*
==========================================================
PROGRAM NAME: ConstructorExample

PURPOSE:
This program shows how constructors work in Java.

Concepts used:
1) Default constructor        → no parameters
2) Parameterized constructor  → constructor with values
3) this keyword               → refers to current object variables

Constructor runs automatically when object is created.
==========================================================
*/
package java_opps;

public class ConstructorExample {

    String name;   // instance variable for name
    int age;       // instance variable for age


    // ---------- Default Constructor ----------
//    ConstructorExample() {
//        name = "Viraj";   // assigning default value
//        age = 24;         // assigning default value
//        System.out.println(name + " " + age);   // print default values
//    }


    // ---------- Parameterized Constructor ----------
    ConstructorExample(String name, int age) {
        this.name = name;   // assign parameter value to class variable
        this.age = age;     // assign parameter value to class variable
        System.out.println(name + " " + age);   // print given values
    }


    public static void main(String[] args) {

//        ConstructorExample obj1 = new ConstructorExample();            // calls default constructor
    	ConstructorExample obj2 = new ConstructorExample("Parth", 22);
    	obj2.close();
 // calls parameterized constructor
    }
    
}

   

