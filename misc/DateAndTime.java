package day3;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {

	public static void main(String[] args) {
		
		LocalDateTime dateTime = LocalDateTime.now();
		
		DateTimeFormatter formatdate = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		String formattedDate = dateTime.format(formatdate);
		System.out.println("Date and Time: "+formattedDate);
	}

}
