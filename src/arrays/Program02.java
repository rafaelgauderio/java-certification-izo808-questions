package arrays;

public class Program02{

    public static void main(String args[ ] ){

       int i = 1;

       int[] iArr = {1}; 

       incr(i) ; // i=1 // não via incrementar,      

       incr(iArr) ; // iArr[0] = 2

       System.out.println( "i = " + i + "  iArr[0] = " + iArr [ 0 ] ) ;

    }

    public static void incr(int   n ) { n++;
    	//System.out.println(n);
    }

    public static void incr(int[ ] n ) { n [ 0 ]++ ; }

}