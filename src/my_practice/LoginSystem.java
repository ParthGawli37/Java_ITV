package my_practice;

import java.util.Scanner;

public class LoginSystem {
	
	String correctUsername = "admin";
	String correctPassword = "admin@123";
	
	void login(String username, String password) {
		
		if (username.equals(correctUsername) && password.equals(correctPassword)) {
			System.out.println("Login Successful");
		} else {
			System.out.println("Login Unsuccessful");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		LoginSystem obj = new LoginSystem();
		
		System.out.print("Enter Username: ");
		String user = sc.nextLine();
		
		System.out.print("Enter Password: ");
		String pass = sc.nextLine();
		
		obj.login(user, pass);
		
		sc.close();
	}
}
