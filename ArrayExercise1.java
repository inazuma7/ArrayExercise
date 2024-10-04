import java.util.Arrays;


public class ArrayExercise1 {

	
	    public static void main(String[] args) {
	        
	    
	        // Declare and initialize an integer array
	        int[] myArray = {
	            1789, 2035, 1899, 1456, 2013, 
	            1458, 2458, 1254, 1472, 2365, 
	            1456, 2165, 1457, 2456
	        };
	        
	        
	        // Print the original numeric array
	        System.out.println("Original numeric array : " + Arrays.toString(myArray));
	        
	        // Sort the numeric array in ascending order
	        Arrays.sort(myArray);
	        
	        // Print the sorted numeric array
	        System.out.println("Sorted numeric array : " + Arrays.toString(myArray));
	 
	    }
	

}

