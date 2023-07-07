package conditional;

public class Program04 {

	public static void main(String[] args) {
		
		var status = "closed";
		status = "open";
		String name = "know";
		if(status.equals("open")) 
			if (name.equals("know")) 
				System.out.println("Hello, be welcome");
			 else 
				System.out.println("Go away foreigner");

	}

}
