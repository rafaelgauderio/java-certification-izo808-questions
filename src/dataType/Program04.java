package dataType;

public class Program04 {

	public static void main(String[] args) {
		
		Object object = new Integer(107);
		Object object2 = Integer.valueOf(107); 
		System.out.println(object); // 107
		System.out.println(object2); //107
		
		// int int1 = (Integer)object.intValue(); do not compile, intValue ins Integer method, dot has precedente than cast
		int int1 = ((Integer) object).intValue(); // cast Object to Integer. To make sure that the cast is done first
		
		String string1 = String.valueOf(107);
		System.out.println(string1); // 1-7
		System.out.println(Integer.parseInt("107")); // 107	
		System.out.println(int1/10); // 10 
	
		
	
	}

}
