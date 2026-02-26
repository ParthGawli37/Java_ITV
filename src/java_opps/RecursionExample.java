/*
==========================================================
PROGRAM NAME: RecursionExample

PURPOSE:
This program shows difference between:
1) Loop approach (while loop)
2) Recursion approach (method calling itself)

Recursion needs a BASE CONDITION to stop the loop.
==========================================================
*/

package java_opps;

public class RecursionExample {

    // ---------- LOOP VERSION (Non-recursive) ----------
    // This version uses while loop instead of recursion
    
//    void countdown(int num) {
//        while (num > 0) {        // loop runs until num becomes 0
//            System.out.print(num);
//            num--;               // decrease number
//        }
//        System.out.println("Countdown completed");
//    }
//    


    // ---------- RECURSION VERSION ----------
    void countdown(int num) {

        if (num == 0) {   // base condition → stops recursion
            System.out.println("Countdown completed");
            return;       // exit method
        }

        System.out.println(num);  // print current number
        num--;                    // decrease number
        countdown(num);           // method calls itself again
    }


    public static void main(String[] args) {

        RecursionExample obj = new RecursionExample();  // create object
        obj.countdown(9);   // start countdown from 9

    }
}
