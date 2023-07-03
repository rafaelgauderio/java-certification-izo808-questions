package exceptions;

public class Program04 {

	static int i1, i2, i3;

	public static void main(String[] args) {
		
		System.out.println("The rule is that of an argument expression completes abruptly, no part of anu argument expression to its right is evaluated.");
		// in this case i3=0 will change the value to 3

		try {
			System.out.println(sum(i1 = 1, i2 = 2, i3 = 3)); // 6			
		} catch (Exception error) {
			System.out.println(i1 + " " + i2 + " " + i3); // 1 2 0
		}

	}

	static int exception(int i) throws Exception {
		throw new Exception("error have occurred");
	}

	static int sum(int a, int b, int c) {
		return a + b + c;
	}

}