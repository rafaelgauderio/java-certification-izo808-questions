package arrays;

import java.util.Arrays;

public class Program07ReferenceValue {

	public static void main(String[] args) {

		System.out
				.println("Arrays as Objects; objects are passed by REFERENCE.\n" + "Primitives are passed by VALUE.\n");

		int i = 11; // will no increment
		int[] array = { 11 }; // the elements of the array will increment, because objects are passed as reference
		Integer integer = Integer.valueOf(11);
		Long long1 = Long.valueOf(11l);

		increment(i);
		increment(array);
		increment(integer);
		increment(long1);

		System.out.println("\nPrimivitves are not incremented");
		System.out.println(i); // not incremented
		System.out.println(integer);
		System.out.println(long1);

		System.out.println("\nObjects are changed");
		System.out.println(array[0]); // incremented
		System.out.println(Arrays.toString(array));

	}

	private static void increment(int i) {
		i++;
	}

	// overload method wiht an array as argument
	private static void increment(int[] array) {
		array[0]++;
	}

	private static void increment(Integer i) {
		i++;
	}

	private static void increment(Long l) {
		l++;
	}

}
