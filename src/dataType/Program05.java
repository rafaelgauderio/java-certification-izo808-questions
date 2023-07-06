package dataType;

import java.time.LocalDate;

public class Program05 {

	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.now(); // 1 object
		d1.plusDays(20); // create a new object, but it is not assign into no variable (do not store in another reference), eligible for gargabe collection. 2 object
		
		LocalDate d2 = d1.minusWeeks(5); // new object = 3 objects
		d1 = null; // no object instantiated, just point to null 
		
		LocalDate d3 = LocalDate.now().plusDays(10).plusYears(5); // creating 3 objects here with each operation = 6 objects
		
		d2.plusMonths(1); // 1 object instantiated =  7 objects
		d1= d2; // no new object instantiated, just pointnt d1 to the same object that d2
		
		d3.minusDays(5); //create a new object, but it is not assign into no variable, eligible for gargabe collection, 8 objects		
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println("LocalDate in a Immutable class");
		System.out.println("When we modiying the status, we are actual creating new object on the background");
		System.out.println("Total of 8 objects instantiated.");

	}

}
