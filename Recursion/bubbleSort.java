package Recursion;

import java.util.Arrays;

public class bubbleSort {

    /* bubble sort */

    /* Note: This is code is correct for all scenarios, but this block of code is executing everytime if an array is already sorted,
        so instead of my time complexity should be O(1) it take O(n). So overcome this I use a boolean i.e.
        'isSwap' that maintains the record is array is swapped or not if swapped then no need to check further come out of the loop.
    */

    /* Approach I: We used here a loop for solving one chunk */
    public static void bubbleSorting(int[] arr, int size) {
        // Base case: If the size of the array is 1, it's already sorted
        if (size == 1) {
            return;
        }

        // Perform one pass of Bubble Sort, bringing the largest element to the end
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // Swap elements
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        // Recursive call: Sort the first n-1 elements
        bubbleSorting(arr, size - 1);
    }

    /* Approach II: We are not used loop here solving chunk, instead we pass row and column */
    public static void bubbleSortRecur(int[] arr, int row, int col){
        // Base case: If the row of the array is 0, it's already sorted
        if (row == 0) {
            return;
        }

        if(col < row){
            if(arr[col] > arr[col + 1]){
                // Swap elements
                int temp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = temp;
            }
            bubbleSortRecur(arr, row, col+1);
        }
        else{
            bubbleSortRecur(arr, row-1, 0);
        }
    }

    public static void main(String[] args) {
        System.out.println("Bubble Sort.");
        System.out.println("Bubble Sort also known as Sinking Sort or Exchange Sort");

        int[] brr = {109, 99, 56, 34, 2, 0, -9};

        System.out.println("\nArray: " + Arrays.toString(brr));
        bubbleSortRecur(brr, brr.length-1, 0);

        System.out.println("Approach I: Array after bubble sort: " + Arrays.toString(brr));

        int[] arr = {109, 99, 56, 34, 2, 0, -9};

        System.out.println("\nArray: " + Arrays.toString(arr));
        bubbleSorting(arr, arr.length);

        System.out.println("Approach II: Array after bubble sort: " + Arrays.toString(arr));
    }
}
