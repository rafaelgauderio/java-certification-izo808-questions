package string;

class TestString {
	int i;
	
	public TestString (int i) {
		this.i = i;
	}
	
	@Override
	public String toString () {
		if(i==0) {
			return null;
		} else {
			return String.valueOf(i);
		}
	}
}

public class Program02 {	

	public static void main(String[] args) {
		
		TestString t1 = new TestString(0);
		TestString t2 = new TestString(17);
		TestString t3 = new TestString(12);
		
		System.out.println(t2); // 17
		System.out.println(t1); // null;
		System.out.println(t3); // 12	
		
		

	}

}
