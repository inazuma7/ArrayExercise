
	import java.util.*;

	public class ArrayExercise10 {
	    public static void main(String[] args) {
	       
	    	
	        Integer myArray[] = new Integer[]{1, 4, 17, 7, 25, 3, 100};
	        
	        int k = 3; //init 'k' as 3, k is index
	        
	        System.out.println(Arrays.toString(myArray));
	        
	        //shortest part
	        System.out.println("K'th smallest element of the said array: ");
	        Arrays.sort(myArray); //sorting 
	        System.out.print(myArray[k-1] + " "); //k-1 because array index start 0
	        
	        //largest part
	        System.out.println("\nK'th largest element of the said array:");
	        Arrays.sort(myArray, Collections.reverseOrder());//sort decending order
	        System.out.print(myArray[k-1] + " ");
	    }


}
