package string;

public class SringXStringBuilder {

	public static void main(String[] args) {


		System.out.println("String are immutable.\n"
				+ "\tIn java all objects are passed by value.\n");
		
		System.out.println("SringBuilder are mutable.\n");
		
		String name = "Rafael";
		replace(name); // it will not change the original string, it is imumtable
		
		StringBuilder lastName = new StringBuilder(" de");
		addSpace(lastName);
		addString(lastName); // it will change the original StringBuilder
		
		System.out.println(name + lastName); // Rafael de Luca
		

	}
	
	public static void replace (String string) {
		string.replace('r', 'j');
	}
	
	public static void addString(StringBuilder sb) {
		sb.append("Luca");
	}
	
	public static void addSpace(StringBuilder sb) {
		sb.append(" ");
	}
	
	
	
	
	

}
