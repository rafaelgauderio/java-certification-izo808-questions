package dataType;

public class Program06 {
	
	@SuppressWarnings("unused")
	private void boxed  (Object o) {
		System.out.println("In Object");
	}
	
	@SuppressWarnings("unused")
	private void boxed  (Number n) {
		System.out.println("In Number");
	}
	
	
	@SuppressWarnings("unused")
	private void boxed  (Integer i) {
		System.out.println("In Integer");
	}
	
	
	@SuppressWarnings("unused")
	private void boxed  (Long l) {
		System.out.println("In Long");
	}	
	

	public static void main(String[] args) {
		
		System.out.println("Double, Integer, Long, Float, Byte extends Number\n");
		System.out.println("Number extends Object");
		System.out.println("The overload method is the more SPECIFIC TYPE.");
		
		
		double d1 = 17;		
		new Program06().boxed(d1); // Number
		
		Double d2 = 10.0;
		new Program06().boxed(d2); // Number still the more specific
		
		Integer i1 = Integer.valueOf(10);
		new Program06().boxed(i1); // Integer is the more specific
		
		String s1 = new String("Rafael");
		new Program06().boxed(s1); // Object is the more specific, do not have a overlead method to String
		
		Long l1 = Long.valueOf(10101010);
		Program06 p1 = new Program06();
		p1.boxed(l1); // Long is the more specific
		

	}

}
