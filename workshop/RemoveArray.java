package workshop;

import java.util.Arrays;

public class RemoveArray {
	public static void main(String[] args) {
		   int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		   System.out.println("Original Array:"+Arrays.toString(my_array));
		   int removeIndex = 1;
		   for(int i=removeIndex; i<my_array.length -1; i++) {
			   my_array[i]=my_array[i+1];
		   }
		   //after removal last element will print twice as we cannot alter size of array
		    System.out.println("After removing the second element: "+Arrays.toString(my_array));

		        

			   
	}
		 
		
	}
		   
