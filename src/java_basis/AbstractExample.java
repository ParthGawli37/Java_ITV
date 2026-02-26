/*
==========================================================
PROGRAM NAME: AbstractExample

PURPOSE:
Abstract class = Incomplete class.

It contains:
✔ Abstract methods (no body)
✔ Normal methods (with body)

Child class MUST implement abstract methods.
==========================================================
*/

package java_basis;

// abstract class → cannot create object
public abstract class AbstractExample {

    // Abstract method → no body
    abstract void startEngine();

    // Normal method → has body
    void fuelType() {
        System.out.println("Car uses petrol");
    }
}
