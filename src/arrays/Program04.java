package arrays;

import java.util.Arrays;

public class Program04 {

	public static void main(String[] args) {
		
	     int[] a = { 'h', 'e', 'l'};

	        int[] b = { 'h', 'e', 'l', 'l', 'o'};
	        
	        // The array pointed to by a is proper prefix of the array pointed to by b,
	        // first array is smaller than second array), therefore, compare will return a negative number. 
	        // since the first array has two less elements than the second array, compare will return -2. 
	        // Since the two arrays are differ at index 3, mismatch will return 3.

	       

	        int x = Arrays.compare(a, b); // a é menor que b em -2 

	        int y = Arrays.mismatch(a, b); // retorna -1 se os arrays forem iguais

	        System.out.println(x+" "+y);
	        
	        int[] array1 ={6, 7, 8, 11, 18, 8, 2, 5};       
	        int[] array2 ={3, 5, 9, 13, 28, 6, 8, 9};
	        //compare both integer array using compare method and finally print result      
	        System.out.println(Arrays.compare(array1,array2));
	        
	        float[] floatArray1={5.12f, 8.3f, 9.17f, 2.5f, 8.8f, 5.17f, 4.2f, 7.37f};
	        float[] floatArray2={7.12f, 9.3f, 6.17f, 7.5f, 5.8f, 7.17f, 3.2f, 6.37f};
	       
	        // compare two float array using compare method and finally print result
	        System.out.println(+ Arrays.compare(floatArray1, floatArray2));

	}

}
