package lambda;

import java.util.function.Supplier;

class Employee {
	
	int age;
}

public class Program04 {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		Supplier <Employee> supplier = () -> {
			emp.age = 40;
			return emp;
		}; // just definind the lambda expression, do not execute here
		
		emp.age = 60;
		
		System.out.println(emp.age); // emp age still 60
		System.out.println(supplier.get().age); // executing the lambda and change the age to 40
		System.out.println(emp.age); // age 40 now
		
		

	}

}
