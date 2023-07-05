package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Program02 {
	
	public static void main(String [] args) {
		
		System.out.println("\n"
				+ "Suplier<T>     T get(t)\n"
				+ "Consumer<T>    void accept(T t)\n"
				+ "Predicate<T>   boolean test(T t)\n"
				+ "Function<T,R>  R apply(T t)\n");
		
		List<String> stringList = Arrays.asList("a", "bb", "ccc", "dddd");
		
		Function<String, Integer> func = x -> x.length();
		// function func accepts a String and returns the string length.
		
		Consumer<Integer> consumer = y-> System.out.print("length: " + y +" ");
		
		// map takes a function and male a transformation. take a String and return a Integer;
		stringList.stream().map(func).forEach(consumer);
		
		
	}

}
