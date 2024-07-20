package Searching;

import java.util.Arrays;

public class LinearSearch2DArray {

    private static int[] searchIndex(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (target == arr[row][col]) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        System.out.println("Here we search our target in 2D Array");

        int[][] arr = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9},
        };

        /* Arrays.toString() used for printing only 1D Array */
        // System.out.println("2D Array: " + Arrays.toString(arr));

        // Print the 2D array
        System.out.println("2D Array:");
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }

        int target = 5;

        int[] ans = searchIndex(arr, target);

        System.out.println("Target is found at {row, col}: " + Arrays.toString(ans));
    }

}
