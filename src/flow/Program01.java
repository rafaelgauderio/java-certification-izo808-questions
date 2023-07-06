package flow;

public class Program01 {
	
	static int loop () {
		int number =0;
		
		for(var i =0; i < 2 ; i++) {
			for (var j=0; j < 2 ; j++) {
				for(var k=0; k < 3; k++) {
					number++;
				}
			}
		}
		return number;
	}
	
	static int loop2 () {
		int number =0;
		
		for(var i =0; i < 2 ; i++) {
			for (var j=0; j < 2 ; j++) {
				for(var k=0; k < 3; k++) {
					number++;
					if(k>j) break;
				}
				
			}
		}
		return number;
	}
	
	static int loop3 () {
		int number =0;
		
		for(var i =0; i < 2 ; i++) {
			for (var j=0; j < 2 ; j++) {
				for(var k=0; k < 3; k++) {
					number++;
					if(k>j) break;
				}
				break;
				
			}
		}
		return number;
	}
	
	static int loop4 () {
		int number =0;
		
		for(var i =0; i < 2 ; i++) {
			for (var j=0; j < 2 ; j++) {
				for(var k=0; k < 3; k++) {
					number++;
					if(k>j) break;
				}
				break;
				
			}
			break;
		}
		return number;
	}

	public static void main(String[] args) {
		
		System.out.println(loop());
		System.out.println(loop2());
		System.out.println(loop3());
		System.out.println(loop4());
		

	}

}
