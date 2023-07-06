package objectOriented;

public class DataBaseWrapper {
	
	
	public static String url = "jdbc://derby://localhost:3306//mysql"; // class static variable
	
	public static DataBaseWrapper getDatabaseUrl () {
		System.out.println("\nGetting Database url...");
		return null;
	}
	
	

	public static void main(String[] args) {
		
		System.out.println(getDatabaseUrl());
		
		System.out.println(getDatabaseUrl().url);
		
		System.out.println(DataBaseWrapper.url);

	}

}
