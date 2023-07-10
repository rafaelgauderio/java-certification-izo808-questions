package arrays;

import java.util.ArrayList;

class Car {
	
	protected String name;
	
	public Car (String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + "]";
	}	
	
	
}

class SportCar extends Car {

	public SportCar(String name) {
		super(name);
		
	}
	
	
	
}

class CarList extends ArrayList<Car> {

	private static final long serialVersionUID = 1L;
	
	
	public int i;		
	public boolean add (Car car) {
		if (car instanceof Car) {
			i++;
			return super.add(car);
			
		} else {
			return i++ == -1;
		}
	}
}

public class ProgramArrayList01 {

	public static void main(String[] args) {
		
		CarList carList = new CarList();
		carList.add(new Car("Golf"));
		carList.add(new Car("Fusca"));
		//carList.add("Kombi"); // The method add(Car) in the type CarList is not applicable for the arguments (String)
		
		System.out.println(carList);
		System.out.println(carList.i); //2
		System.out.println(carList.size()); //2
		

	}

}
