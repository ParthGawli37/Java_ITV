/*
==========================================================
PROGRAM NAME: OperatorsExample

PURPOSE:
This program shows different types of operators in Java.

Concepts used:
1) Arithmetic operators  → + - * / %
2) Assignment operators  → += -= *= /= %=
3) Comparison operators  → == != > < >= <=
4) Logical operators     → && || !
5) Increment/Decrement   → ++ --
6) Operator precedence   → BODMAS rule
	B → Brackets
	O → Orders (powers, roots → like 2², √ )
	D → Division
	M → Multiplication
	A → Addition
	S → Subtraction
==========================================================
*/
package java_basis;

public class OperatorsExample {

    public static void main(String[] args) {

        int num1 = 10;   // first number
        int num2 = 5;    // second number


        // ---------- Arithmetic Operators ----------
        System.out.println("Arithmetic Operators:");
        System.out.println("num1 + num2 = " + (num1 + num2));  
        System.out.println("num1 - num2 = " + (num1 - num2));  
        System.out.println("num1 * num2 = " + (num1 * num2));  
        System.out.println("num1 / num2 = " + (num1 / num2));  
        System.out.println("num1 % num2 = " + (num1 % num2));  


        // ---------- Assignment Operators ----------
        System.out.println("\nAssignment Operators:");
        num1 += 5;   // num1 = num1 + 5
        num2 -= 3;   // num2 = num2 - 3
        System.out.println("num1 after += 5 : " + num1);
        System.out.println("num2 after -= 3 : " + num2);


        // ---------- Comparison Operators ----------
        System.out.println("\nComparison Operators:");
        System.out.println("num1 == num2 : " + (num1 == num2));
        System.out.println("num1 != num2 : " + (num1 != num2));
        System.out.println("num1 > num2  : " + (num1 > num2));
        System.out.println("num1 < num2  : " + (num1 < num2));
        System.out.println("num1 >= num2 : " + (num1 >= num2));
        System.out.println("num1 <= num2 : " + (num1 <= num2));


        // ---------- Logical Operators ----------
        System.out.println("\nLogical Operators:");
        boolean condition1 = true;
        boolean condition2 = false;
        System.out.println("condition1 && condition2 : " + (condition1 && condition2));
        System.out.println("condition1 || condition2 : " + (condition1 || condition2));
        System.out.println("!condition1 : " + (!condition1));


        // ---------- Increment / Decrement ----------
        System.out.println("\nIncrement / Decrement:");
        int a = 5;
        System.out.println("a = " + a);
        System.out.println("a++ = " + (a++));   
        System.out.println("After a++ : " + a);
        System.out.println("++a = " + (++a));   
        System.out.println("a-- = " + (a--));   
        System.out.println("--a = " + (--a));   


        // ---------- Operator Precedence (BODMAS) ----------
        System.out.println("\nOperator Precedence Example:");

        int result1 = 10 + 5 * 2;
        System.out.println("10 + 5 * 2 = " + result1);  
        // multiplication runs first → 5*2=10 → 10+10=20

        int result2 = (10 + 5) * 2;
        System.out.println("(10 + 5) * 2 = " + result2);  
        // brackets first → 10+5=15 → 15*2=30

        int result3 = 20 / 5 + 3 * 2;
        System.out.println("20 / 5 + 3 * 2 = " + result3);  
        // division and multiplication first → 4 + 6 = 10

        int result4 = (20 / (5 + 3)) * 2;
        System.out.println("(20 / (5 + 3)) * 2 = " + result4);  
        // inner bracket → 5+3=8 → 20/8=2 → 2*2=4

    }
}
