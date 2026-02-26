/*
==========================================================
PROGRAM NAME: MethodsExample

PURPOSE:
This program shows how methods and objects work in Java.

Concepts used:
1) Methods → reusable blocks of code
2) Creating object of class
3) Calling methods using object

This program simulates small shopping web-site steps:
login → search → add to cart → logout
==========================================================
*/

package java_opps;

public class MethodsExample {

    // ---------- Method 1 ----------
//    void login() {
//        System.out.println("Enter username: admin");     // print user_name step
//        System.out.println("Enter password: Admin@123"); // print password step
//        System.out.println("click on login button");     // login action
//    }
    
    void login(String uid, String pwd, String captcha) {
        System.out.println("Enter username:" +uid);     // print user_name step
        System.out.println("Enter password:" +pwd); // print password step
        System.out.println("Enter captcha:" +captcha); //enter capt_cha
        System.out.println("click on login button");     // login action
        System.out.println("Login Sucessfull");
    }
    
    void login(long mbNumber) {
        System.out.println("Enter mobile no:" + mbNumber);     // Enter mobile no
        System.out.println("click on login button");     // login action
        System.out.println("Login Sucessfull");
    }
	

    // ---------- Method 2 ----------
    void search() {
        System.out.println("Select product: Iphone 14");     // product selection
        System.out.println("Click on add to cart button");   // click action
        System.out.println("Product added to cart");           // confirmation
    }
    
    void search(String pdt) {
        System.out.println("Select product:" + pdt);     // product selection
        System.out.println("Click on add to cart button");   // click action
        System.out.println("Product added to cart");           // confirmation
    }
    
    void search(String pdtid, String typ, int cost ) {
        System.out.println("Select product:" + pdtid);     // product selection
        System.out.println("Brand :" + typ );
        System.out.println("price value:" + cost);
        System.out.println("Click on add to cart button");   // click action
        System.out.println("Product added to cart");           // confirmation
    }


    // ---------- Method 3 ----------
    void addToCart() {
        System.out.println("Select product: iPhone 14");     // selecting product
        System.out.println("Click on add to cart button");   // click action
        System.out.println("Product added to cart");         // confirmation
    }

    // ---------- Method 4 ----------
    void logout() {
        System.out.println("Click on logout button");  // logout action
        System.out.println("Logout successful");       // confirmation
    }


    public static void main(String[] args) {

        // syntax to create object of class
        // ClassName objectName = new ClassName();
        MethodsExample obj = new MethodsExample();  // creating object

        // calling methods using object
//        obj.login("raj123", "raj@123", "A6UWT6");
//        obj.login(1234567890);
        
        obj.search("Redmi note 15");
        obj.search();
        obj.search("Watch","Fossil", 10000);
        
//        obj.addToCart();
//        obj.logout();
    }
}
