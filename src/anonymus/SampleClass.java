/*
==========================================================
PROGRAM NAME: AnonymousClassExample

PURPOSE:
Demonstrates how an anonymous class implements an interface.

Concept used:
1) Anonymous class → implement interface without creating a separate class
==========================================================
*/

package anonymus;

// Interface with a single method
interface Greeting {
    void greet();
}

public class SampleClass {

    public static void main(String[] args) {

        // Anonymous class implementing Greeting interface
        Greeting obj = new Greeting() {

            // Implement interface method
            public void greet() {
                System.out.println("Hello, Greetings to all from anonymous class");
            }
        };

        // Call the implemented method
        obj.greet();
    }
}