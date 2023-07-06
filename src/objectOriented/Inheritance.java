package objectOriented;

class MotorCycle {
	
	public int numberOfGears = 5;
	
	public String accelerate () {
		return "Accelerating a motorcycle";
	}
	
}

class NinjaMotorCycle extends MotorCycle {
	
	public int numberOfGears = 6;
	
	@Override
	public String accelerate () {
		return "Accelerating a NINJA motorcycle";
	}
	
}


public class Inheritance {

	public static void main(String[] args) {
		
		System.out.println("Data -> analise the REFERENCE");
		System.out.println("Polymorphism method -> analise OBJECT\n");
		
		MotorCycle m1 = new MotorCycle();
		System.out.println(m1.numberOfGears + " gears, " + m1.accelerate()); // data and method from Motorcycle, 
		
		MotorCycle m2 = new NinjaMotorCycle();
		System.out.println(m2.numberOfGears + " gears, " + m2.accelerate()); // data from Motorcycle and polymorph method from Ninja
		
		NinjaMotorCycle n1 = new NinjaMotorCycle(); 
		System.out.println(n1.numberOfGears + " gears, " + n1.accelerate()); // data and polymorph from Ninja Motorcycle
		
		NinjaMotorCycle n2 = (NinjaMotorCycle) new MotorCycle(); 
		 System.out.println(n2.numberOfGears + " gears, " + n2.accelerate()); // Error at runtime
		

	}

}
