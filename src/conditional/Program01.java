package conditional;

public class Program01 {

	@SuppressWarnings("finally")
	public int chooseNumber(int seed) {
		if (seed > 10)
			return seed % 10;
		int x = 0;
		try {
			if (seed % 2 == 0) {
				throw new Exception("No even number.");
			}
		} catch (Exception error) {
			return 3;
		} finally {
			return 7; // function will always return 7 because of the finally block
		}
	}

	public static void main(String[] args) {
		
		int amount = 100, seed=10;

		switch( new Program01().chooseNumber(seed)) {
		case 3:
			amount = amount *2;
		case 7: 
			amount = amount *2; // 100 *2
		case 6:
			amount = amount + amount; // 200 + 200
		} 
		System.out.println(amount); //400
	}

}
