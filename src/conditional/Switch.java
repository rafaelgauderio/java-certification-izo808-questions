package conditional;

public class Switch {

	public static void main(String[] args) {
		
		System.out.println("Can swith on the following types:\n"
				+ "\tbyte, char, short, int (primitive types)\n"
				+ "\tByte, Character, Short, Integer (wrapper types)\n"
				+ "\tString\n"
				+ "\tenum values\n"
				+ "\tvar (assuming the type resolver to one of the above");
		
		System.out.println("The case options have to be in the range o the type we are switching.\n"
				+ "For example if we are switching a byte we can not have any type bigger than 8 bits (range of the byte)\n");
		
		byte x = 8;
		switch (x) {
			case 'b': //98
				System.out.println("do something");
				break;
			case -15:
				System.out.println("do something");
				break;
			case 8:
				System.out.println("do something different");
				break;
			case '~': //126
				System.out.println("do something different");
				break;
			case (byte) 500:
				System.out.println("do something different");
				break;
			default:
				System.out.println("do something");
				break;
		}
		byte y = (byte) 500; // if we have something bigger than a byte we have to cast
		System.out.println(y);

	}

}
