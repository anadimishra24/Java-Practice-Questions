package Sorting;

import java.util.Arrays;

public class selectionSort {

    public static void selectionSorting(int[] arr){
        int size = arr.length;

       /* Selection Sort: Selection sort is a simple and efficient sorting algorithm that
          works by repeatedly selecting the smallest (or largest) element from the unsorted
          portion of the list and moving it to the sorted portion of the list.
       */


        for (int i = 0; i < size-1; i++) {
            // Find the index of the smallest element in the remaining unsorted array
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found smallest element with the first element of the unsorted portion
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }


    public static void main(String[] args) {
        System.out.println("Selection Sort.");
        int[] arr = {12, 11, 10, 9, 8};

        System.out.println("Array: " + Arrays.toString(arr));
        selectionSorting(arr);

        System.out.println("Array after selection sort: " + Arrays.toString(arr));

    }
}
