package timestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DTTimeExample {

	public static void main(String[] args) {
		
		LocalDate todaysDt = LocalDate.now();
		System.out.println("Today's date is " + todaysDt);
		
		LocalDate pastDt = LocalDate.of(2025, 8, 31);
		System.out.println("Past date is " + pastDt);
		
		LocalDateTime todaysDtTm = LocalDateTime.now();
		System.out.println("Current  date and time is " + todaysDtTm);
		
		DateTimeFormatter objFormat = DateTimeFormatter.ofPattern("dd-mm-yy HH:mm:ss");
		System.out.println("Formatted current date and time is: " + todaysDtTm.format(objFormat));
		

	}

}
