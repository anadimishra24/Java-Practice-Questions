package Recursion;

import java.util.Arrays;

public class mergeSorting {

    /* This code is working fine, but it needs to be optimized for that there is another file named as: mergeSortOptimized.java
       Points to be remembered for optimize it and improve its efficiency:

    ## Avoid Creating New Arrays Repeatedly:
       Creating new arrays with Arrays.copyOfRange is inefficient because it involves copying elements each
       time you call mergeSort. Instead, you can use array indices to avoid copying arrays.

    ## Use In-Place Sorting:
       If you can, try to implement in-place sorting to avoid additional space usage. For merge sort, this is more
       complex and less intuitive, but for educational purposes, it’s worth noting.

    ## Optimize Merge Function:
       Your merge function is already efficient, but ensures you're not performing redundant operations.
       For instance, copying remaining elements is correctly done, but ensure your array access patterns are efficient.
   */

    private static int[] merge(int[] first, int[] second){
        int size = first.length + second.length;  // Calculate the combined size of both arrays
        int[] mergeArray = new int[size];  // Initialize the array with the calculated size

        int leftIndex = 0, rightIndex = 0, mergeArrIndex = 0;

        while(leftIndex < first.length && rightIndex < second.length){
            if(first[leftIndex] <= second[rightIndex]){
                mergeArray[mergeArrIndex++] = first[leftIndex++];
            }
            else{
                mergeArray[mergeArrIndex++] = second[rightIndex++];
            }
        }

        // copy the remaining elements if any of the arrays have either first or child array.
        while(leftIndex < first.length){
                mergeArray[mergeArrIndex++] = first[leftIndex++];
        }
        while(rightIndex < second.length){
            mergeArray[mergeArrIndex++] = second[rightIndex++];
        }
        return mergeArray;
    }

    private static int[] mergeSort(int[] arr) {
        // base case, all the array now break into one element each
        if(arr.length == 1){
            return arr;
        }

        // divide the array into halves till it have one element
        int mid = arr.length / 2;

        int[] firstHalf = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] secondHalf = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        // after breaking the array into a single element, it's time to merge them
        return  merge(firstHalf,secondHalf);
    }

    public static void main(String[] args) {
        System.out.println("\nUse the merge sort algorithm with recursion.\n");

        int[] arr = {12, 3, 45, 1, 5, 11};

        System.out.println("\nArray: " + Arrays.toString(arr));

        int[] mergedArr = mergeSort(arr);

        System.out.println("\nArray after merge sort: " + Arrays.toString(mergedArr));
    }
}
