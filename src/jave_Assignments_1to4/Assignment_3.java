package jave_Assignments_1to4;

public class Assignment_3 {
//1-Find the greater no out of the two
		public static int getGreater(int a, int b) {
			if (a > b) {
				return a;
			} else {
				return b;
			}

		}
		//3-overload method
		public static int calculate(int a, int b){
			return a + b;
		}
		
		public static double calculate(double a, double b) {
			return a + b;
		}
		//4-recursive method
		public static int sum(int n) {
			if (n == 1) {
				return 1;
			} else {
				return n + sum(n-1);
			}
			
		}
		
		public static void main(String[] args) {
			
			//Q1
			System.out.println("========Q1=======");
			int result = getGreater(10, 20);
			System.out.println("Greater number is: " + result);
			
			
			
			//Q2
			System.out.println("=========Q2=======");
			Book obj1 = new Book("Java Basic", 600);
			System.out.println("Book Title: " + obj1.title);
			System.out.println("Book price: " + obj1.price);
			
			
			//Q3
			System.out.println("========Q3=======");
			int sumInt = calculate(5, 3);
			System.out.println("Sum of integers: " + sumInt);
			
			double sumDouble = calculate(5.5, 3.3);
			System.out.println("Sum of doubles: " + sumDouble);
			
			
			//Q4
			System.out.println("=========Q4=========");
			int total = sum(5);
			System.out.println("Sum of 1 to 5: " + total);
		}

	}

class Book {
		
	String title;
	int price;
		
	Book(String t, int p) {
		this.title = t;
		this.price = p;
	}
		
}

