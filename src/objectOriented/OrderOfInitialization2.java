package objectOriented;

class Car  {
	
	public Car (String car) {
		System.out.println("Car constructor: " + car);
	}
	
}

class Fiat {
	
	public static final Car FIAT1 = new Car("Fiat static");
	
	public Fiat () {
		System.out.println("Fiat constructor\n");
	}
	
	static Car fiat2 = new Car("Fiat static second");
}

class Wolks {
	
	Car car1 = new Car("Wolks NON static instantiated");
	static Car car2 = new Car("Wolks static first");
	Wolks () {
		System.out.println("Wolks constructor\n");
	}
	
	public static Car car3 = new Car("Wolks static second");
}

public class OrderOfInitialization2 {

	public static void main(String[] args) {		
		
		
		new Wolks (); // third the NON static constant		
		System.out.println("After call all the constructor call this method");
		
		

	}
	
	static Fiat fiat1 = new Fiat(); // firts static
	static Wolks wolks1 = new Wolks (); // second static

}
