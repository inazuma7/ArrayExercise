import java.util.Arrays;

public class ArrayExercise15 {

	public static void main(String [] args){
		
		int [] myArray = { 4, 2, 3, 3, 7, 2, 4};
		int k = 3;
		double Avg = maxAvg(myArray, k);
		
		System.out.println("Original Array: " + Arrays.toString(myArray));
		System.out.println("The value of K: " +k);
		System.out.println("Maximum average value: " +Avg);	
		
	}
	
	public static double maxAvg(int[] num, int k){
		
		double sum = 0;
		int index =0;
		
		for(int nums: num) {
			if (index < k) {
				sum += nums;
			}
			
			index ++;
		}
		
		
		double newSum = sum;
		
		for (int i = k; i < num.length; i++) {
            newSum += num[i] - num[i - k];  
            sum = Math.max(sum, newSum);
        }

        return sum / k;
	}
	
	}
