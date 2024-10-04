
public class ArrayExercise8 {
	public static void main (String[]args) {
		
		
	int[] myArray = {1,4,17,7,25,3,100};
    
	
	int sum = 0;
	
	// counts average
	for(int i : myArray) {
		
		sum += i;
	}
	double avg = (double)sum/myArray.length;
	
	System.out.println("The average is " + avg);
	
	System.out.println("The greater than average are ");
	
	
	//checking is the number greater than average
	for(int i : myArray) {
		
		if ( i > avg) {
			
			System.out.println(i);
		}
	}
	
	
	
	
	
	
	
	


}

}
