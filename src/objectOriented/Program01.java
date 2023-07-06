package objectOriented;

class T3 implements T1, T2 {

	@Override
	public void method() {
		System.out.println("T3");

	}
	
	@Override
	public void defaultMethod() {		
		//T1.super.defaultMethod();
		T2.super.defaultMethod();
		//System.out.println("T3 default method implementation");
	}

}

interface T1 {
	int NUMBER = 1;

	public abstract void method();
	
	default void defaultMethod () {
		System.out.println("Default T1");
	}
}

interface T2 {
	int NUMBER = 2;
	int VALUE = 17;

	void method();
	
	default void defaultMethod () {
		System.out.println("Default T2");
	}
}

public class Program01 {

	public static void main(String[] args) {
		T3 t3 = new T3();
		t3.method();
		t3.defaultMethod();
	}

}
