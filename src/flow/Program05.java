package flow;

public class Program05 {

	static void loopBreak() {
		var count = 50;
		for (int i = 0; i < count; i++) {
			if (i >= 10 && i <=40) {
				break; // simplesmente sai do loop se a condição for verdadeira no caso no i =11 e não volta mais par ao loop
			}
			System.out.printf("%d - ", i);
		}

	}

	static void loopContinue() {
		var count = 50;
		for (int i = 0; i <= count; i++) {

			if (i >= 10 && i <= 40) {
				continue; // apenas pula a iteração se for verdadeira e vai papa a proxima // volta a imprimir a partir do 40
			}
			System.out.printf("%d - ", i);

		}

	}

	public static void main(String[] args) {

		System.out.println(
				"Continue\n" + "continue statement ends the current iteration and skips to the next iteration.\n"
						+ "The commnads of this iteration will not be executed, move on to the next iteration.");
		loopContinue();

		System.out.println(
				"\n\nBreak\n" + "break statement terminates the loop iteration and hands it to the next statement.");
		loopBreak();

	}

}
