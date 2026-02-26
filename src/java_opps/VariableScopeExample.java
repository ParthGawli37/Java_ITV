/*
==========================================================
PROGRAM NAME: VariableScopeExample

PURPOSE:
This program shows variable scope in Java.

Concepts used:
1) Global variable (class level) → accessible in all methods
2) Local variable (method level) → accessible only inside method

Global variable = declared outside methods
Local variable  = declared inside methods
==========================================================
*/

package java_opps;

public class VariableScopeExample {

    // ---------- Global Variable ----------
    String name;   // accessible in entire class


    // ---------- Method 1 ----------
    void empDetails() {
        int age = 24;   // local variable (only inside this method)

        System.out.println("Employee name: " + name); // using global variable
        System.out.println("Employee age: " + age);   // using local variable
    }


    // ---------- Method 2 ----------
    void QATeamDetails() {   // fixed method syntax
        System.out.println("QA team member: " + name); // global variable used again
    }


    public static void main(String[] args) {
//    	AccessModExample obj = new AccessModExample();
//		obj.name = "Raj";
//		obj.printName();
    	
    	

        VariableScopeExample obj = new VariableScopeExample(); // create object

        obj.name = "Sehwag";   // assigning value to global variable

        obj.empDetails();      // call first method
        obj.QATeamDetails();   // call second method

    }
}
