package flow;

public class Program04 {

	public static int nestedLoop() {
		var count = 0;

		rafael: for (var i = 0; i < 3; i++) {
			deluca: for (var j = 0; j < 3; j++) {
				lerias: for (var k = 0; k < 3; k++) {
					count++;
				}
			}
		}

		return count;

	}

	public static int nestedLoopBreak() {
		var count = 0;

		rafael: for (var i = 0; i < 3; i++) {
			deluca: for (var j = 0; j < 3; j++) {
				lerias: for (var k = 0; k < 3; k++) {
					if (k - j > 0) {
						break deluca;
					}
					count++;
				}
			}
		}

		return count;

	}

	public static int nestedLoopContinue() {
		var count = 0;

		rafael: for (var i = 0; i < 3; i++) {
			deluca: for (var j = 0; j < 3; j++) {
				lerias: for (var k = 0; k < 3; k++) {
					if (k - j > 0) {
						continue deluca;
						
					}
					count++;
					
				}
				
			}
			
			
		}

		return count;

	}

	public static void main(String[] args) {

		System.out.println(nestedLoop());
		System.out.println(nestedLoopBreak());
		System.out.println(nestedLoopContinue());

	}

}
