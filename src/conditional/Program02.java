package conditional;

public class Program02 {

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
		
		int amount = 100, seed=8;

		switch( new Program02().chooseNumber(seed)) {
		case 3:
			amount = amount *2; // 100 * 2
		case 7: 
			amount = amount *2; // 100 *2
			break;
		case 6:
			amount = amount + amount; // 100 + 100
			break;
		} 
		System.out.println(amount); //200
		// the break will make to get out of the switch block
	}

}