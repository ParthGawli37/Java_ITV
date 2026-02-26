package java_opps;


public class Encapsulation {

    public static void main(String[] args) {

        // declare an object of the User class
        user obj = new user();
        obj.setPassword("pass@123");

        System.out.println(obj.getPassword());
    }
}

