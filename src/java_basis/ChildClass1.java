/*
==========================================================
CLASS NAME: ChildClass1

PURPOSE:
This class is in DIFFERENT PACKAGE from parent class.

Parent package  → java_opps
Child package   → java_basic

Since this class EXTENDS the parent,
it can access:
✔ protected members
✔ public members (if present)
❌ default members
❌ private members

This program proves that PROTECTED works across packages
only through inheritance.
==========================================================
*/

//package java_basis;
//
//import java_opps.AccessModExample;
//
//public class ChildClass1 extends AccessModExample {
//
//    public static void main(String[] args) {
//
//        ChildClass1 obj = new ChildClass1();
//
//        System.out.println("Value from parent class:");
//        obj.printName();
//
//    }
//}

/*
==========================================================
CLASS NAME: ChildClass1

PURPOSE:
This class IMPLEMENTS the interface in SAME PACKAGE.

When a class implements an interface,
it MUST implement ALL methods.

Interface → InterfaceExample
==========================================================
*/

package java_basis;

public class ChildClass1 implements InterfaceExample {

    // Implementing all interface methods

    public void openBrowser() {
        System.out.println("Chrome browser opened");
    }

    public void navigateToApp() {
        System.out.println("Navigated to Flipkart");
    }

    public void login() {
        System.out.println("User logged in");
    }

    public void logout() {
        System.out.println("User logged out");
    }

    public static void main(String[] args) {

        ChildClass1 obj = new ChildClass1();

        obj.openBrowser();
        obj.navigateToApp();
        obj.login();
        obj.logout();
    }
}
