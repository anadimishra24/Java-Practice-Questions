package Recursion;

import java.util.Arrays;

public class mergeSortOptimized {

    private static void merge(int[] arr, int leftStart, int mid, int rightEnd) {
        int leftSize = mid - leftStart + 1;
        int rightSize = rightEnd - mid;

        // Create temporary arrays for left and right halves
        int[] left = new int[leftSize];
        int[] right = new int[rightSize];

        // Copy data to temp arrays
        System.arraycopy(arr, leftStart, left, 0, leftSize);
        System.arraycopy(arr, mid + 1, right, 0, rightSize);

        int leftIndex = 0, rightIndex = 0, mergeIndex = leftStart;

        // Merge the two halves
        while (leftIndex < leftSize && rightIndex < rightSize) {
            if (left[leftIndex] <= right[rightIndex]) {
                arr[mergeIndex++] = left[leftIndex++];
            } else {
                arr[mergeIndex++] = right[rightIndex++];
            }
        }

        // Copy remaining elements
        while (leftIndex < leftSize) {
            arr[mergeIndex++] = left[leftIndex++];
        }
        while (rightIndex < rightSize) {
            arr[mergeIndex++] = right[rightIndex++];
        }
    }

    private static void mergeSort(int[] arr, int leftStart, int rightEnd) {
        if (leftStart < rightEnd) {
            int mid = (leftStart + rightEnd) / 2;

            // Recursively sort both halves
            mergeSort(arr, leftStart, mid);
            mergeSort(arr, mid + 1, rightEnd);

            // Merge the sorted halves
            merge(arr, leftStart, mid, rightEnd);
        }
    }

    public static void main(String[] args) {
        System.out.println("\nUse the merge sort algorithm with recursion.\n");

        int[] arr = {12, 3, 45, 1, 5, 11};

        System.out.println("\nArray: " + Arrays.toString(arr));

        // Perform merge sort
        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nArray after merge sort: " + Arrays.toString(arr));
    }

}
