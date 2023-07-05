package lambda;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Program05 {

	public static void main(String[] args) {

		IntStream int1 = IntStream.of(1, 3, 5, 7);
		IntStream int2 = IntStream.of(1, 3, 5, 7);
		
		IntStream int3 = IntStream.of(2, 4, 6, 8);
		IntStream int4 = IntStream.of(2, 4, 6, 8);

		OptionalDouble even = int1.filter(x -> x % 2 == 0).average(); // empty stream
		OptionalDouble odd = int2.filter(x -> x % 2 != 0).average();

		int sumEven = int3.filter((y) -> y % 2 == 0).sum();
		int sumOdd = int4.filter(y -> y % 2 != 0).sum();
		
		System.out.println("average of even int1: " + even); //empty, no even elements
		System.out.println("average of odd int2: " + odd); // (1 + 3 + 5 + 7 ) /4 = 4.0
		System.out.println("sum of even int3: " + sumEven); // (2 + 4 + 6 + 8 )  = 20 
		System.out.println("sum of odd int4: " + sumOdd); // empty no odd elements
		

	}

}
