package copilot;

public class Mathematics {
	
	int addition;
	int number1, number2;
	
	// Method to perform addition of two numbers
	public int add(int num1, int num2) {
		this.number1 = num1;
		this.number2 = num2;
		this.addition = this.number1 + this.number2;
		return this.addition;
	}

	// Method to calculate the factorial of a number
	public static long factorial(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
		}
		if (n == 0 || n == 1) {
			return 1;
		}
		long result = 1;
		for (int i = 2; i <= n; i++) {
			result *= i;
		}
		return result;
	}
	
	//Method to calculate square of a number
	public static double square(double x) {
		if (x < 0) {
			throw new IllegalArgumentException("Square is not defined for negative numbers.");
		}
		return x * x;
		
	}

	/**
	 * Compute the greatest common divisor (GCD) of two integers using the
	 * Euclidean algorithm. Returns the non-negative greatest common divisor.
	 * If both a and b are zero, throws IllegalArgumentException because GCD is undefined.
	 */
	public static int gcd(int a, int b) {
		if (a == 0 && b == 0) {
			throw new IllegalArgumentException("gcd(0, 0) is undefined");
		}
		// Work with absolute values to handle negatives
		a = Math.abs(a);
		b = Math.abs(b);
		while (b != 0) {
			int t = b;
			b = a % b;
			a = t;
		}
		return a;
	}

	/**
	 * Check whether the given integer n is prime.
	 * Returns true if n is a prime number, false otherwise.
	 * For n < 2 the method returns false.
	 */
	public static boolean isPrime(int n) {
		if (n < 2) return false;
		if (n % 2 == 0) return n == 2;
		if (n % 3 == 0) return n == 3;
		int limit = (int) Math.sqrt(n);
		for (int i = 5; i <= limit; i += 6) {
			if (n % i == 0 || n % (i + 2) == 0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int number = 5;
		System.out.println("Factorial of " + number + " is: " + factorial(number));
		
		// Demo gcd
		int a = 48, b = 18;
		System.out.println("gcd(" + a + ", " + b + ") = " + gcd(a, b));
		
		// Demo isPrime
		int p = 29;
		System.out.println(p + " is prime? " + isPrime(p));
		
	}

}