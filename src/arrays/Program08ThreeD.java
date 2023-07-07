package arrays;

import java.util.Arrays;

public class Program08ThreeD {

	public static void main(String[] args) {

		String[][][] array = { { { "a", "b", "c" }, { "d", "e", null } }, { { "f" }, null }, { { "g" } },
				{ { "h", "i" }, {null} } };
		
		for(String[][] biDimension : array) {
			for(String [] oneDimension : biDimension) {
				System.out.println(Arrays.toString(oneDimension));
			}
		}
		
		System.out.println("\nPrinting elements");
		System.out.print(array[0][0][0]);
		System.out.print(array[0][0][1]);
		System.out.print(array[0][0][2]);
		
		System.out.println();
		
		System.out.print(array[0][1][0]);
		System.out.print(array[0][1][1]);
		System.out.print(array[0][1][2]);
		
		System.out.println();
		
		System.out.print(array[1][0][0]);
		System.out.print(array[1][1]);
		
		System.out.println();
		
		System.out.print(array[2][0][0]);
		
		System.out.println();
		
		System.out.print(array[3][0][0]);
		System.out.print(array[3][0][1]);
		
		System.out.println();
		
		System.out.print(array[3][1][0]);
		
		
		
	
		

		

	}

}
