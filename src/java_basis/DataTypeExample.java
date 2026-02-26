/*
==========================================================
PROGRAM NAME: DataTypeExample

PURPOSE:
This program shows how type casting works in Java.

Concepts used:
1) Widening casting  → small data type to bigger (automatic)
2) Narrow casting    → bigger data type to smaller (manual)

Examples:
int → double  (widening)
double → byte (narrowing)
==========================================================
*/
package java_basis;

public class DataTypeExample {

    public static void main(String[] args) {

        // ---------- WIDENING CASTING (Automatic) ----------
        int num1 = 100;   // integer variable storing value 100
        System.out.println("Integer value: " + num1);

        double num2 = num1;   // int automatically converted to double
        System.out.println("After widening to double: " + num2);

        // float example
        float smallNumber = 12.5f;   // float value must end with 'f'
        System.out.println("Float value: " + smallNumber);

        float num3 = smallNumber;   // copying float value
        System.out.println("Copied float value: " + num3);


        // ---------- NARROW CASTING (Manual) ----------
        System.out.println("\nNarrow Casting Example:");

        double precisePrice = 99.99;   // double value with decimal
        System.out.println("Original double value: " + precisePrice);

        byte num4 = (byte) precisePrice;   // manually converting double → byte
        System.out.println("After narrowing to byte: " + num4);

    }
}
