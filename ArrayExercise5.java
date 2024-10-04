
public class ArrayExercise5 {
	
	public static void main (String[]args) {
	int[] myArray = {3,4,5,7,9};
    
	
	int sum = 0;
	
	for(int i : myArray) {
		
		sum += i;
	}
	
	
	double avg = (double)sum/myArray.length;
		
	
	System.out.println("The average is " + avg);
	


}
}