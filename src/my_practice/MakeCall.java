package my_practice;



public class MakeCall {

	public static void main(String[] args) {
		Manager manager = new Manager();
		System.out.println();

	}

}

class Employee {
	
	Employee(){
		System.out.println("Employee called boss");
	}
}

class Manager extends Employee {
	
	Manager(){
		super();
		System.out.println("Manager called boss");
	}
}