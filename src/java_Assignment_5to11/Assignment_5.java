package java_Assignment_5to11;

import java.util.ArrayList;

public class Assignment_5 {

	public static void main(String[] args) { 
		//Q1&Q2
		Manager m = new Manager();
		
		System.out.println("=====================");
		m.calculateSalary();
		
		System.out.println("=====================");
		
		
		Bank b1 = new SBI();
		Bank b2 = new HDFC();
		
		System.out.println("SBI Interest Rate: " + b1.getInterestRate());
		System.out.println("HDFC Interest Rate: " + b2.getInterestRate());
		
		System.out.println("========================");
		
		ArrayList<String> students = new ArrayList<>();
		
		students.add("Rahul");
		students.add("Parth");
		students.add("Sarita");
		students.add("Varindra");
		students.add("Vanita");
		
		for (String name : students) {
			System.out.println(name);
		}
		
		System.out.println("==========================");
		
		students.remove(2);
		System.out.println("After Removing.....");
		
		for (String name : students) {
			System.out.println(name);
		}
	}

}

//Q1 & Q2 combine
class Employee {
	
	Employee() {
		System.out.println("Employee constructor called");
	}
	 
	void calculateSalary() {
		System.out.println("Employee salary: 30000");
	}
}

class Manager extends Employee {
	
	Manager() {
		super();
		System.out.println("Manager constructor called");
	}
	
	@Override
	void calculateSalary() {
		System.out.println("Manager salary: 30000 + 10000 bonus");
	}
}


//Q3Abstract
abstract class Bank {
	 
	abstract double getInterestRate();
	
}

class SBI extends Bank {
	@Override
	double getInterestRate() {
		return 6.0;
	}
}

class HDFC extends Bank {
	@Override
	double getInterestRate() {
		return 7.0;
	}
}
