package jave_Assignments_1to4;

public class Assignment_4 {

public static void main(String[] args) {
		
		//Q1
		Modifier obj = new Modifier();
		
		System.out.println("Public variable: " + obj.a);
		System.out.println("Default variable: " + obj.c);
		System.out.println("Private variable: " + obj.getB());

		//Q2
		StaticFinal obj1 = new StaticFinal();
		//StaticFinal obj2 = new StaticFinal();
		
		System.out.println("Static count: " + StaticFinal.count); 
		System.out.println("Final PI value: " + obj1.PI);
		
		//Q3
		BankAccount account = new BankAccount();
		
		account.deposit(10000);
		account.deposit(500);
		
		System.out.println("Current Balance: " + account.getBalance());
		
		//Q4
		Employee emp = new Employee();
		emp.showEmployee();
		emp.showDepartment();
		emp.showCompany();
		
	}

}


//Q1 class
class Modifier {
	public int a = 10;
	private int b = 20;
	int c = 30; //default
	
	public int getB() {
		return b;
	}
}

//Q2 class
class StaticFinal {
	
	static int count = 0;
	final double PI = 3.14;
	
	StaticFinal() {
		count++;
	}
}
//Q3 class
class BankAccount {
	
	private double balance;
	
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	public double getBalance() {
		return balance;
	}
}

//Q4 class
class Company {
	
	String companyName = "Tech Corp";
	
	public void showCompany() {
		System.out.println("Company: " + companyName);
	}
}
		//
class Department extends Company {
	
	String departmentName = "IT";
	
	public void showDepartment() {
		System.out.println("Department: " + departmentName);
	}
}
			///
class Employee extends Department {
	
	String employeeName = "Parth";
	
	public void showEmployee() {
		System.out.println("Employee: " + employeeName);
	}
}

