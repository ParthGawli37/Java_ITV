/*
==========================================================
PROGRAM NAME: MultiDimArrayExample

PURPOSE:
This program shows how 2D arrays (multi-dimensional arrays) work.

Concepts used:
1) 2D Array declaration
2) Storing username & password in table form
3) Nested loops to read 2D array

2D Array = Array inside an array (rows & columns)
Think like Excel table 📊
==========================================================
*/
package java_basis;

public class MultiDimArrayExample {

    public static void main(String[] args) {

        // ---------- Creating 2D Array ----------
        // 3 rows and 2 columns (username & password)
        String[][] empCredentials = new String[3][2];

        // storing values (row, column)
        empCredentials[0][0] = "admin";      // row 0, column 0 → username
        empCredentials[0][1] = "admin123";   // row 0, column 1 → password

        empCredentials[1][0] = "user1";
        empCredentials[1][1] = "user@123";

        empCredentials[2][0] = "user2";
        empCredentials[2][1] = "user@456";


        // ---------- Reading 2D Array using Nested Loops ----------
        // outer loop → columns
        for (int i = 0; i < empCredentials[0].length; i++) {

            // inner loop → rows
            for (int j = 0; j < empCredentials.length; j++) {

                System.out.println(
                    "Employee Credential: row " + j +
                    " column " + i + " : " + empCredentials[j][i]
                );
            }
        }

    }
}
