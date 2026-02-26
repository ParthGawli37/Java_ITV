/*
==========================================================
PROGRAM NAME: DoWhileLoopExample

PURPOSE:
This program shows different types of loops in Java.

Concepts used:
1) do-while loop  → runs at least once
2) while loop     → checks condition first
3) for loop       → used when number of loops is known
4) continue       → skips one iteration
5) nested loop    → loop inside another loop
==========================================================
*/
package java_basis;

public class DoWhileLoopExample {

    public static void main(String[] args) {

        // ================= DO WHILE LOOP =================
        int retryAttempt = 4;   // starting value

        do {
            retryAttempt++;   // increase value by 1
            System.out.println("Retrying Test case execution. Attempt: " + retryAttempt);
        } while (retryAttempt < 3);   // condition checked AFTER loop runs once

        System.out.println("Do-While loop finished.\n");


        // ================= WHILE LOOP =================
        retryAttempt = 0;   // reset value to 0

        while (retryAttempt < 3) {   // condition checked BEFORE loop runs
            retryAttempt++;   // increase value
            System.out.println("Retrying Test case execution. Attempt: " + retryAttempt);
        }

        System.out.println("While loop finished.\n");


        // ================= FOR LOOP =================
        for (int retry = 0; retry < 3; retry++) {   // start at 0, run until < 3, increase by 1
            System.out.println("Retry: " + retry);
        }

        System.out.println("For loop finished.\n");


        // ================= CONTINUE EXAMPLE =================
        for (int i = 0; i < 5; i++) {   // loop from 0 to 4

            if (i == 2) {
                continue;   // skip when i becomes 2
            }

            System.out.println("Iteration: " + i);
        }

        System.out.println("Continue example finished.\n");


        // ================= NESTED FOR LOOP =================
        for (int i = 0; i < 3; i++) {   // outer loop
            System.out.println("Outer loop iteration: " + i);

            for (int j = 0; j < 2; j++) {   // inner loop
                System.out.println("   Inner loop iteration: " + j);
            }

            System.out.println("----------------------");
        }

        System.out.println("Test case execution completed.");
    }
}
