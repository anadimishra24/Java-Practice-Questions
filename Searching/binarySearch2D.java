package Searching;

import java.util.Arrays;

public class binarySearch2D {

    private static int[] searchElementInn2DArray(int[][] matrix, int target) {

        int row = 0;
        int col = matrix.length - 1;
        while (row < matrix.length && col >= 0) {

            // case 1: Element found at matrix[row][col]
            if (matrix[row][col] == target) {
                return new int[]{row, col};
            }
            // case 2: Element < matrix[row][col]
            if (target < matrix[row][col]) {
                // if this is the case, then the target also does not lie in particular column so decrement the column because the matrix is sorted
                col--;
            }
            // case 3: Element > matrix[roq][col]
            if (target > matrix[row][col]) {
                row++;
            }
        }
        return new int[] {-1,-1};
    }
    
    public static void main(String[] args) {
        System.out.println("""
                            Find the element in the sorted matrix that is\s
                            sorted in both ways column as well row.\s""");
        
        
        int[][] arr = {
                {10, 20, 30, 40},
                {11, 25, 35, 45},
                {22, 30, 40, 50},
        };
        
        int target = 35;
        int[] pos = searchElementInn2DArray(arr, target);
        System.out.println("\nElement found at {row, col}: " + Arrays.toString(pos));
    }
}
