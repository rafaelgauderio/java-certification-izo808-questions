package string;

import java.util.Arrays;

public class Program03 {

	public static void main(String[] args) {
		
		System.out.println(Chocolate.BITTER);
		System.out.println(Chocolate.BLACK);
		System.out.println(Chocolate.WHITE);
		
		System.out.println("\nvalues");
		
		System.out.println(Chocolate.values()[0]);
		System.out.println(Chocolate.values()[1]);
		System.out.println(Chocolate.values()[2]);
		
		
		System.out.println("\nPrinting all values");
		System.out.println(Arrays.asList(Chocolate.values()));
		
		for(Chocolate nickname : Chocolate.values()) {
			System.out.println(nickname);
		}
		

	}

}
