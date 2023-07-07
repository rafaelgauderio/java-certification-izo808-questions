package flow;

public class Program03 {

	public static void main(String[] args) {
		
		int i=0, j=10;
		var counter = 0;
		
		while (i < j) {
			i++;
			j--;
			counter++;
		}

		System.out.println("i: " + i);
		System.out.println("j: " + j);
		System.out.println("counter: " + counter );
		
		///////////////////////////////////////////
		i=counter=0;
		j=10;
		
		while (i < j) {
			i=i+2;
			j=j-2;
			counter++;
		}

		System.out.println("\n");
		System.out.println("i: " + i);
		System.out.println("j: " + j);
		System.out.println("counter: " + counter );	
	}

}
