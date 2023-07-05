package lambda;

import java.util.Arrays;
import java.util.List;

public class Program03 {

	public static void main(String[] args) {

		System.out.println("In java everything is call by value. Variable are passed by value\n"
				+ "There is no call by reference like in C ou C++ language.\n"
				+ "All Wrapper class( String, Integer, Double, Object) are immutable.\n"
				+ "The original element in a collection are not changed when we apply a function on the elements.\n"
				+ "We have Stream of mutable object like StringBuilders, that can change the original StringBuilder\n");

		List<Double> doubleList = Arrays.asList(10.0, 20.0, 30.0);
		doubleList.stream().forEach(x -> {
			x = x + 10.0;
		}); // consumer return void
		doubleList.stream().forEach(d -> System.out.println(d)); // it will no change the original value

		List<Double> doubleList2 = doubleList.stream().map(x -> x + 30).toList(); // still do dot alter the original
																					// list but make a new list adding
																					// 10 to each list
		System.out.println("Yet the original list");
		doubleList.stream().forEach(d -> System.out.println(d)); // it will no change the original value
		System.out.println(doubleList);

		System.out.println("\ndouble list + 30.0");
		doubleList2.stream().forEach(list -> System.out.println(list));
		System.out.println(doubleList2);
		
		System.out.println("\nStringBuilder is Mutable");
		List<StringBuilder> stringList = Arrays.asList(new StringBuilder("Rafael"), new StringBuilder("Luciana"));
		stringList.stream().forEach(x -> x.append(" De Luca"));
		stringList.stream().forEach(x -> System.out.println(x));
		
		System.out.println(stringList);
		

	}

}
