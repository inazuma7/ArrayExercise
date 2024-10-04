
public class ArrayExercise4 {
	    public static void main(String[] args) {   
	    	
	        int[][] a = new int[5][5];    
	        
	        
	        int value = 5;
	        
	        for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 5; j++) {
	                a[i][j] = value;
	                value++;         
	                System.out.printf("%2d ", a[i][j]);
	            }
	            System.out.println(); 
	        }
	    }

}
