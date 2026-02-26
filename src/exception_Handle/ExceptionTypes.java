/*
==========================================================
PROGRAM NAME: ExceptionTypes

PURPOSE:
This program demonstrates different types of errors
and how Exception Handling works in Java.

Types of Errors:
1) Compile-time error  → syntax mistake (code won't run)
2) Runtime error       → occurs during execution (handled using try-catch)
3) Logical error       → program runs but gives wrong result

Keywords used:
try     → risky code
catch   → handle error
finally → always executes
throw   → manually create exception
throws  → declare possible exception
==========================================================
*/

package exception_Handle;

public class ExceptionTypes {

    // Method that may cause ArithmeticException
    void division(int value) throws ArithmeticException {
        System.out.println(10 / value);   // risky line (divide by zero)
    }

    public static void main(String[] args) {

        ExceptionTypes obj = new ExceptionTypes();

        // ================= RUNTIME ERROR EXAMPLE =================
        try {
            obj.division(0);   // dividing by zero → crash
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception handled: " + e.getMessage());
        }


        // ================= MANUAL EXCEPTION (throw) =================
        int balance = -1;

        try {
            if (balance < 0) {
                throw new RuntimeException("Invalid Balance ❌");
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }


        // ================= ARRAY RUNTIME ERROR =================
        try {
            int[] participantID = {1,2,3,4};

            // Loop mistake → goes out of array size
            for(int i = 0; i <= participantID.length; i++) {
                System.out.println(participantID[i]);
            }
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Error handled: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block always runs ✅");
        }


        // ================= LOGICAL ERROR EXAMPLE =================
        // Code runs but loop runs extra time
        for(int i = 0; i <= 5; i++) {
            System.out.println("Logical loop value: " + i);
        }

        System.out.println("Program finished successfully");
    }
}
