package dataType;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDate02 {

	public static void main(String[] args) {
		
		System.out.println("\nFormatter");
		System.out.println("2019-12-30"); // ISO_DATE
		System.out.println("2011-12-03T10:15:30"); // ISO_DATE_TIME
		System.out.println("'2019-12-30T10:15:30+01:00[Europe/Paris]");
		
		LocalDate d1 = LocalDate.parse("2021-04-30");
		LocalDate d2 = LocalDate.of(2021, 04, 30);
		
		
		System.out.println("All will print the same");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(LocalDate.of(2021, Month.APRIL, 30).format(DateTimeFormatter.ISO_DATE));
		// System.out.println(LocalDate.of(2021, Month.APRIL, 30).format(DateTimeFormatter.ISO_DATE_TIME)); // UnsupportedTemporalTypeException: Unsupported field: HourOfDay at runtime
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d3 = LocalDate.parse("30/04/2021",dtf);
		System.out.println(d3);
		
		System.out.println("\nLocalDateTime");
		System.out.println(LocalDateTime.now());
		LocalDateTime d4 = LocalDateTime.parse("2021-04-30T12:30:00");
		System.out.println(d4);
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime d5 = LocalDateTime.parse("2021/04/30 12:30:00",dtf2);
		System.out.println(d5);
		
		System.out.println(LocalDateTime.of(2021, 04, 30, 12, 30).format(DateTimeFormatter.ISO_DATE_TIME));
	
		
		
	}

}
