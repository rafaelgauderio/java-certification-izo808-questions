package flow;

public class Pogram02 {
	
	public static void main(String [] args) {
		
		int INT1=1;
		int INT2=5;
		
		for(int i=INT1; i < INT2 ; i++ ) {
			System.out.println(i);
		}	
		
		INT1=1;
		INT2=5;		
		
		for(int i=INT1; i < INT2 ;) {
			System.out.println(i);
			i++;
		}
		
		INT1=1;
		INT2=5;
		
		for(int i=INT1; i < INT2 ;) {
			System.out.println(i++);
			
		}		
	
	}
	
	

}
