package dataType;

public class Program02 {

	public static void main(String[] args) {

		System.out.println(parseFloat("0.2"));
		System.out.println(parseFloat("rafael")); // error exception
		System.out.println(parseFloat("1.0"));

	}

	
	public static float parseFloat(String s) {
		float f = 0.0f;

		try {
			f = Float.valueOf(s).floatValue();
			return f;
		} catch (NumberFormatException error) {
			System.out.println("Invalid input: " + s);
			f = Float.NaN;
			return f;
		} finally {
			System.out.println("Always execute finally");
		}
		//return f; // this return statement aftaer finally is unreachable. The code will no compile

	}
}
