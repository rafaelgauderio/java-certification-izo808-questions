package dataType;

class SpecialChoose<Type> {
	
	public Type chooseOne(Type type1, Type type2) {
		// always return the big number
		return type1.hashCode() > type2.hashCode() ? type1 : type2;
	}
	
}

public class ProgramGenerics {

	public static void main(String[] args) {
		
		SpecialChoose<Integer> sc = new SpecialChoose<Integer>();
		
		System.out.println(sc.chooseOne(1, 2)); // return type 2
		System.out.println(sc.chooseOne(1, 2).intValue()); // return type 2
		System.out.println(sc.chooseOne(2, 1).intValue() + 1); // return type 2 + 1
		System.out.println(sc.chooseOne(5, 1).intValue() + 2); // return type 5 + 2
		

	}

}
