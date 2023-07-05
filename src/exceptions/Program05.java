package exceptions;

public class Program05 {

	public static void main(String[] args) {
		
		String string = "10";
		int intValue = 0;
		Double doubleValue = 0.0;
		
		try {
			intValue = Integer.parseInt(string,2); // intValue = 2;
			// radix 2 -> convert 10 to a Binary = 2
			if((doubleValue = Double.parseDouble(string)) == (double)intValue) { // 2 == 10.0 // false
				System.out.println("equals");
			}
		} catch (NumberFormatException error) {
			System.out.println("Exception on parsing!");
		}
		
		System.out.println("int: " + intValue + ", double: " + doubleValue);
		

	}

}
