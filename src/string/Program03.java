package string;

import java.util.Arrays;

public class Program03 {

	public static void main(String[] args) {
		
		System.out.println("Constants");		
		System.out.println(Chocolate.BITTER);
		System.out.println(Chocolate.BLACK);
		System.out.println(Chocolate.WHITE);
		
		System.out.println("\nPrinting constantes in a different way");
		Chocolate c1 = Chocolate.valueOf("BITTER"); // require a constant
		Chocolate c2 = Chocolate.valueOf("WHITE");
		Chocolate c3 = Chocolate.valueOf("BLACK");
		System.out.println(c1 + ", " + c2 + ", " + c3);
		
		
		System.out.println("\nElemetns of values array");		
		System.out.println(Chocolate.values()[0]);
		System.out.println(Chocolate.values()[1]);
		System.out.println(Chocolate.values()[2]);		
		
		System.out.println("\nPrinting all values");
		System.out.println(Arrays.asList(Chocolate.values()));
		
		for(Chocolate nickname : Chocolate.values()) {
			System.out.println(nickname);
		}	
		
		System.out.println("\nPrinting as a array");
		Chocolate [] chocolates = Chocolate.values();
		for(int i=0; i < chocolates.length; i++) {
			System.out.println(chocolates[i]);
		}
		

	}

}
