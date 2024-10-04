
import java.util.Scanner;

public class ArrayExercise9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    
        System.out.print("Input a number: ");
        
        int n = scanner.nextInt();
        int[][] result = spiralArray(n);

        System.out.println("Spiral array becomes:");
        for (int[] row : result) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // Function to generate a spiral array of size n x n
    public static int[][] spiralArray(int n) {
        int[][] matrix = new int[n][n];
        int value = 1, rowStart = 0, rowEnd = n - 1, colStart = 0, colEnd = n - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            // Fill top row
            for (int i = colStart; i <= colEnd; i++) {
                matrix[rowStart][i] = value++;
            }
            rowStart++;

            // Fill right column
            for (int i = rowStart; i <= rowEnd; i++) {
                matrix[i][colEnd] = value++;
           }
            colEnd--;

            // Fill bottom row
            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    matrix[rowEnd][i] = value++;
                }
                rowEnd--;
            }

            // Fill left column
            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    matrix[i][colStart] = value++;
                }
                colStart++;
            }
        }
        
        return matrix;
    }
}


