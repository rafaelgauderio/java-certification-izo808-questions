package conditional;

public class Program03 {

	public static void main(String[] args) {
		
		boolean b1 = false;
		boolean b2 = false;
		// assignment has the lowest priority
		// b1 == false -> true
		// b2 = true, if(true==true)
		if(b2=(b1==false)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		System.out.println("b1: " + b1);
		System.out.println("b2: " + b2);
		
		

	}

}
