/*
==========================================================
PROGRAM NAME: ConditionExample

PURPOSE:
This program shows how decision making works in Java.

Concepts used in this file:
1) if / else  → checking conditions
2) else if    → checking multiple conditions
3) Nested if  → if inside another if
4) switch     → alternative of many if-else

This file contains 4 mini programs:
• Voting eligibility check
• Student grading system
• Find greatest number (nested if)
• Browser detection using switch
==========================================================
*/
package java_basis;

public class ConditionExample {   // class name must match file name

    public static void main(String[] args) {   // main method → program starts here


        // ============= IF ELSE =============
        int age = 17;           // variable storing age
        boolean citizen = true; // true means person is citizen of country

        // check TWO conditions using AND (&&)
        if (age >= 18 && citizen) {
            System.out.println("You are eligible to vote.");  // runs if condition true
        } else {
            System.out.println("You are not eligible to vote."); // runs if condition false
        }


        // ============= GRADING SYSTEM =============
        float marks = 75.5f;   // float used because marks can be decimal

        // check marks range using multiple conditions
        if (marks >= 35 && marks < 60) {
            System.out.println("Grade: Pass Class");   // 35–59

        } else if (marks >= 60 && marks < 75) {
            System.out.println("Grade: First Class");  // 60–74

        } else if (marks >= 75) {
            System.out.println("Grade: Distinction");  // 75+

        } else {
            System.out.println("Grade: Fail");         // below 35
        }


        // ============= NESTED IF =============
        int num1 = 155;   // first number
        int num2 = 20;    // second number
        int num3 = 30;    // third number

        // first comparison
        if (num1 > num2) {
            System.out.println("num1 is greater than num2");

            // second comparison INSIDE first if → nested if
            if (num1 > num3) {
                System.out.println("num1 is the greatest"); // both conditions true
            } else {
                System.out.println("num1 is not the greatest"); // second condition false
            }

        } else {
            System.out.println("num1 is not the greatest"); // first condition false
        }


        // ============= SWITCH CASE =============
        String browser = "Firefox";  // store browser name

        // switch checks value equality (== for strings internally)
        switch (browser) {

            case "Chrome":
                System.out.println("You are using Chrome browser.");
                break;   // stops switch here

            case "Firefox":
                System.out.println("You are using Firefox browser.");
                break;

            case "Edge":
                System.out.println("You are using Edge browser.");
                break;

            default:
                System.out.println("Incorrect Browser."); // runs if no case matches
        }

    } // end of main method

} // end of class
