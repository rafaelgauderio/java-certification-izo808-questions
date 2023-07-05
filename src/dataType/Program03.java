package dataType;

public class Program03 {

	public static void main(String[] args) {

		Double double1 = 1000.0;
		double dou1 = 1000.0;
		Double double2 = 1000.0;
		
		int int1 = 1000;
		Integer integer1 = Integer.valueOf(1000); // new object containing 1000
		Integer integer2 = Integer.valueOf(1000); // new object containing 1000
	
		System.out.println(double1==dou1); // true 
		System.out.println(double1==int1); // true
		System.out.println(int1 == integer2); // true	
		System.out.println(int1 == integer1); // true	
		
		
		System.out.println("Double as wrapper");
		System.out.println(double1 == double2); // false, point to different objects
		double1 = Double.valueOf(50000.0);
		double2 = Double.valueOf(50000.0);
		System.out.println(double1==double2); // false
		
		System.out.println("Integer as wrapper");
		System.out.println(integer1 == integer2); // false = two diferente objects
		
		System.out.println("\npoint to the same cached object");		
		integer1 = Integer.valueOf(100); // return a cached Integer object value  is between -128 and 127
		integer2 = Integer.valueOf(100); // return a cached Integer object value is between -128 and 127
		System.out.println(integer1 == integer2); // true - now both variable point to the same object
		
		System.out.println("\npoint to the same cached object NOT between -128 and 127");
		integer1 = Integer.valueOf(10000); 
		integer2 = Integer.valueOf(10000);
		System.out.println(integer1 == integer2);
		
		// System.out.println(double1 == integer2); // can not compare Double com
		// Integer

	}

}
