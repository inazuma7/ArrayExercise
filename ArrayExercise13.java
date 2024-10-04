import java.util.Scanner;

public class ArrayExercise13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Input number of rows/columns (0 to exit): ");
        int n = scanner.nextInt();
        
        // if input is 0 i will be return
        if (n == 0) {
            System.out.println("Bye bye bye...");
            return;
        }

        // 2D array
        int[][] table = new int[n][n];

        // Input value to the array
        System.out.println("Enter the elements of the table:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                table[i][j] = scanner.nextInt();
            }
        }

        //arrays store rows and column sums
        int[] rowSum = new int[n];
        int[] colSum = new int[n];

        //total sum of all elements
        int totalSum = 0;

        // Calculate row and column
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rowSum[i] += table[i][j]; // aa row sum
                colSum[j] += table[i][j]; // Add column sum
            }
            totalSum += rowSum[i];
        }

        
        System.out.println("Result:");
        
        for (int[] row : table) { //for rows
            int rowIndex = 0;
            for (int element : row) { //for elements
                System.out.printf("%5d", element);
            }
            System.out.printf("%5d\n", rowSum[rowIndex++]);
        }

       
        for (int sum : colSum) { //for column 
            System.out.printf("%5d", sum); 
        }
        System.out.printf("%5d\n", totalSum); 
    }
}


