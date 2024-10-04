import java.util.Scanner;

public class ArrayExercise6 {
    public static void main(String[] args) {
        
        
        boolean[][] myArray = { //2D Array
            {false, false, true},
            {false, true, false}
        };

        for (boolean[] row : myArray) { //iterate over array row
            for (boolean element : row) {
                if (element) {
                    System.out.print(" t ");
                } else {
                    System.out.print(" f ");
                }
            }
            
            System.out.println();
        }
    }


	


}
