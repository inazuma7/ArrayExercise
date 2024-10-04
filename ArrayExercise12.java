
import java.util.Arrays;

public class ArrayExercise12 {
    public static void main(String[] args) {
       
        int[] myArray = {0, 3, 4, 0, 1, 2, 5, 0};

        System.out.println("Original array: " + Arrays.toString(myArray));

        // Call the function to move non-ze
        moveNonZeroToFront(myArray);

        System.out.println("Result: " + Arrays.toString(myArray));
    }

    // Function to move non-zero 
    public static void moveNonZeroToFront(int[] array) {
        int index = 0;  // Pointer to track the position of the next non-zero element
        
        // Traverse the array
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                // to place non-zero elements at the 'index' position
                array[index] = array[i];
                index++;  // Move index to the next position
            }
        }

        // Place all the end array with 0
        while (index < array.length) {
            array[index] = 0;
            index++;
        }
    }
}
