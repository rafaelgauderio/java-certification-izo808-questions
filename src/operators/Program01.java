package operators;

public class Program01 {

	public static void main(String[] args) {

		int x1 = -4; // x1=-4
		int x2 = x1--; // x2=x1=-4, x1--=x1=-5
		int x3 = ++x2; // ++x2 =x2=-3, x3=x2=-3
		// x1 =-5, x2=-3, x3=-3
		if (x2 > x3) // false -3 == -3
		{
			--x3; 
		} else {
			x1++; // x1++=x1=-4
		}
		
		System.out.println(x1 + " " + x2 + " " + x3 + " = "  + (x1 + x2 + x3)); // -4  -3 - 3 =  -10
		
		x3 = x1++; // x3= x1=-4 , x1=-3
		System.out.println(x1 + " " + x2 + " " + x3 + " = "  + (x1 + x2 + x3)); // -3 -3 -4 = -10
		
		x2 = ++x1; // x1++ = x1=-2, x2=x1=-2
		System.out.println(x1 + " " + x2 + " " + x3 + " = "  + (x1 + x2 + x3)); // -2 -2 -4 = -8
		

	}
	
	
}
