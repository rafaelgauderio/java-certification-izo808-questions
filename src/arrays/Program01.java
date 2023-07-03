package arrays;

public class Program01{

	   public static void main(String args[] ){

	      var i = 0 ; // same as 'int i = 0;'

	      int[] array = {10, 20} ;

	      array[i] = i = 30 ;

	      System.out.println(""+ array[ 0 ] + " " + array[ 1 ] + " "+i) ; // 30 20 30


	    }

	}

