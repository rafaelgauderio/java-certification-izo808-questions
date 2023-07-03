package arrays;

public class Program06 {

	public static void main(String[] args) {

		int[][] array = { { 00, 01 }, { 11, 12 } };
		int i = 100;
		try {
			array[val()][i = 1] = array[val()][i=1] + 1;// como vai disparar a exceção. Não vai ser executado nada que esta no lado direito nao vai alterar o valor de i
			//array[val()][i = 1]++;
		} catch (Exception error) {
			System.out.println(i + ", " + array[1][1]);
		}
		
		

	}
	
	
	public static int val() throws Exception {
		throw new Exception ("unimplemented");
	}
	
	/*
	public static int val() {
		return 1;
	}
	*/

}
