import java.util.Arrays;

public class ArrayExercise14 {

    public static void main(String[] args) {
        
        int[] myArray = {10, 11, 12, 13, 14, 7, 8, 9, 1, 2, 3};

        System.out.println("Original array: " + Arrays.toString(myArray));

        // Find the size of the longest increasing continuous subsequence
        int longestLength = findLongestSub(myArray);

        System.out.println("Size of longest increasing continuous subsequence: " + longestLength);
    }

    public static int findLongestSub(int[] myArray) {
  
        if (myArray.length == 0) {
            return 0;
        }

        
        int maxLength = 1;
        int currentLength = 1;

        // Traverse
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > myArray[i - 1]) {
                currentLength++;  // Increment the length if element is > the previous
            } else {
                currentLength = 1;  // Reset if the sequence is broken
            }

            // update
            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }

        return maxLength;
    }
}

