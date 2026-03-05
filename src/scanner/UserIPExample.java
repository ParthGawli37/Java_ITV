package scanner;

import java.util.Scanner;

public class UserIPExample {

	public static void main(String[] args) {
		
		Scanner objIP = new Scanner(System.in);
		System.out.println("Please enter the browser name");
		String browser= objIP.nextLine();
		launchBrowser(browser);
		
		System.out.println("Please enter your age");
		System.out.println("User age is " + objIP.nextInt());
		objIP.close();
		
		

		
	}
	public static void launchBrowser(String browserName) {
		switch(browserName.trim().toLowerCase()) {
		case "chrome":
			System.out.println("Launching Chrome Browser");
			break;
		case "firefox":
			System.out.println("Launching FireFox Browser");
			break;
		case "edge":
			System.out.println("Launching Edge Browser");
			break;
		default:
			System.out.println("Invalid browser name");
		
		}
	}

}
