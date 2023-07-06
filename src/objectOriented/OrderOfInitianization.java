package objectOriented;

class A {
	public A() {

	}

	public A(int number) {
		System.out.println(number);
	}
}

class C {
	static A insta1 = new A(1);
	A a = new A(2);
	static A inst2 = new A(4);
}

public class OrderOfInitianization {

	public static void main(String[] args) {
		
		System.out.println("Order os Initialization\n"
				+ "1. All static constants, variables and blocks\n"
				+ "2. All NON static constants, variables and blocks;\n"
				+ "3. Constructor\n"
				+ "Among themselves the order is the order in which the apper in the code.\n");
		
		C b = new C(); // call fisrt static method 1, second static method with 4 and then instantiate A with 2 
		A a = new A (3); // call the constructor A with 3
		
	}

}
