package string;

public class Program01 {

	public static void main(String[] args) {
		
		System.out.println("substring(beginIndexInclusive, endIndexExclusive)");
		
		String string = "0123456789";
		
		System.out.println(string.substring(4, 7)); //456 (7-4) = 3 characters
		System.out.println(string.substring(4,6)); // 45
		System.out.println(string.substring(0, 10)); // 0123456789
		System.out.println(string.substring(1, 4)); // 123
		System.out.println("rafael".substring(2,6)); // fael
		//System.out.println(string.substring(0,11)); // runtime error because lenght equal 10

	}

}
