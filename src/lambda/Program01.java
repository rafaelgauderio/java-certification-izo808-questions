package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleFunction;

public class Program01 {

	public static void main(String[] args) {
		
		List<Double> doubleList = Arrays.asList(10.0, 20.0, 40.0);
		
		DoubleFunction<?> doubleFunction = x -> x * 2;
		
		System.out.println("\nUsing stream");
		doubleList.stream().forEach( x -> System.out.print(x + " "));		
		
		System.out.println("\n");
		System.out.println("double value of 30.0 is " + doubleFunction.apply(30));
		
		System.out.println("\nUsing for each");
		doubleList.forEach( y -> System.out.print(y + ""));
		

	}

}
