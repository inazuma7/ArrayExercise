import java.util.Arrays;

public class ArrayExercise11 {
	
	public static void main(String [] args) {
		int[] myArray = {-2, 3, 4, -1, -3, 1, 2, -4, 0};
		
		System.out.println("Original Array : " + Arrays.toString(myArray));
		
		Arrays.sort(myArray);
		
		System.out.println("Result : " + Arrays.toString(myArray));
		
		
	}

}
