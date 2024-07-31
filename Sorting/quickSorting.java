package Sorting;

import java.util.Arrays;

public class quickSorting {

    private static void quickSort(int[] arr, int start, int end) {
        // base case
        if (start >= end) {
            return;
        }

        // Calculate pivot index
        int mid = (start + end) / 2;
        int pivot = arr[mid];

        int low = start;
        int high = end;

        while (low <= high) {
            // Move elements from left of the array that are less than the pivot
            while (arr[low] < pivot) {
                low++;
            }

            // Move elements from right of the array that are greater than the pivot
            while (arr[high] > pivot) {
                high--;
            }

            // Swap elements that are on the wrong side of the pivot
            if (low <= high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }

        // Recursively sort the sub-arrays
        if (start < high) {
            quickSort(arr, start, high);
        }
        if (low < end) {
            quickSort(arr, low, end);
        }
    }

    public static void main(String[] args) {
        System.out.println("\nUsed the quick sort algorithm for sorting the array.\n");

        int[] arr = {10, 80, 30, 90, 40, 50, 70};

        System.out.println("Array: " + Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Array after quick sort: " + Arrays.toString(arr));
    }
}
