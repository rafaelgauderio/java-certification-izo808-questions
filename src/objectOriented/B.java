package objectOriented;

import objectOriented.subpackage.A;
import objectOriented.subpackage.C;
import objectOriented.subpackage.D;

public class B extends A {	

	 B() { // package private by default
			
	}
	
	public void print () {
		System.out.println("Class B");
	}

	public static void main(String[] args) {
		
		B b = new B(); // A class has to protected or public
		A a= new B();
		A a1 = new A(); // A constructor has to be public
		//C c = new C (); // compile error, C can be instantiated only in C the same package, it wil have to be public the constructor
		D d = new D ();		
		
		b.print(); // B
		a.print(); // B
		a1.print(); // A
		d.print(); // C because class D has not his on implementation of print method
		
		
		
		
	}

}
