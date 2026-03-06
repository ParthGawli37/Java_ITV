package java_Assignment_5to11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

enum Browser {
	CHROME,
	FIREFOX,
	EDGE,
	OPERA
}

public class Assignment_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Options: CHROME, FIREFOX, EDGE, OPERA");
		System.out.println("Enter Browser:");
		String browserinput = sc.nextLine();
		
		Browser browser = Browser.valueOf(browserinput.toUpperCase());
		
		System.out.println(browser + " has opened.");
		
		
		
		
		System.out.println("Enter user role:");
		String role = sc.nextLine();
		
		
		
		
		LocalDateTime now = LocalDateTime.now();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		String formattedDate = now.format(formatter);
		
		
		
		Runnable reportTask = new Runnable() {
			public void run() {
				System.out.println("\n------Report------");
				System.out.println("Browser: " + browser);
				System.out.println("Role: " + role);
				System.out.println("Time: " + formattedDate);
			}
			
		};
		
		new Thread(reportTask).start();
		
		sc.close();
		
	}


}
