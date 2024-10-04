	
	import java.util.Scanner;

	public class ArrayExercise7 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        
	        System.out.print("Enter number of rows: ");
	        int rows = scanner.nextInt();
	        System.out.print("Enter number of columns: ");
	        int columns = scanner.nextInt();
	        
	        
	        boolean[][] myArray = new boolean[rows][columns];

	        // Filling the array with user input
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                System.out.printf("Enter value for array[%d][%d] (true/false): ", i, j);
	                myArray[i][j] = scanner.nextBoolean();
	            }
	        }

	        
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                if (myArray[i][j]) {
	                    System.out.print(" t "); 
	                } else {
	                    System.out.print(" f "); 
	                }
	            }
	            System.out.println(); 
	        }

	        scanner.close();
	    }
	

}
