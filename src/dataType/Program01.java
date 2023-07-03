package dataType;

public class Program01 {

	public static void main(String[] args) {

		Program01 p01 = new Program01();
		
		// independente do que passar como argumento para a função, o bloco finally alterar o valor da varriável f para 10.0

		System.out.println(p01.parseFloat("0.0")); //10.0

	}

	@SuppressWarnings("finally")
	public float parseFloat(String s) {
		float f = 0.0f;

		try {
			f = Float.valueOf(s).floatValue();
			return f;
		} catch (NumberFormatException error) {
			f = Float.NaN;
			return f;
		} finally {			
			f = 10.0f;
			return f;
			
			
		}

	}

}
