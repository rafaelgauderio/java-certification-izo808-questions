package string;

public class StringImmutable {

	public static void main(String[] args) {
		
		String blank = " ";
		String name = blank + blank + "Rafael" + blank + blank;
		System.out.println(name); // 10 Character with the spaces
		name.concat("de Luca"); // it will no change the original string name, it no refers no any object, this object will be elegible to garbage Collector
		System.out.println(name.length()); // 10
		
		String nameWithoutSpace = name.trim(); // 6 character
		System.out.println(nameWithoutSpace);
		System.out.println(nameWithoutSpace.length());
		
		// now referring the name to a new string
		name = name.trim().concat(" de Luca"); // now the original String refers to this new String
		System.out.println(name);
		System.out.println(name.length());
		
				
		

	}

}
