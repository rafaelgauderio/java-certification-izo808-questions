package arrays;

import java.util.Arrays;

public class Program03 {

	public static void main(String args[]){

	      String[][][] arr  = {{ { "a", "b" , "c"},
	    	  					{ "d", "e", null } 
	      					},
	    		  				 { 
	      						{"x"}, {"w"} },
	    		  				 {{"y"}},
	    		  				 { { "z","p"}, 
	    		  					 {}
	    		  				 
	    		  				 }

	      };
	      
	      // método para imprimri arrays multiDimensionais
	      System.out.println(Arrays.deepToString(arr) + "\n");
	      
	      for(int i=0 ; i < arr.length ; i++ ) {
	    	  for(int j=0; j < arr[i].length  ; j++ ) {
	    		  for(int k=0; k < arr[i][j].length ; k++) {
	    			 {
	    				 if(arr[i][j] != null)
	    				  System.out.print(i + ""+ j +"" + k + "=" +arr[i][j][k] + " ");
	    			  }
	    			  
	    		  }
	    		  System.out.println();
	    	  }
	    	 
	    	  
	      }

	      System.out.println(arr[0][1][2]); // null

	   }
}
