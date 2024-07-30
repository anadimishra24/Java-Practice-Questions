package Recursion;

import java.util.Arrays;

public class selectionSort {

    /* Selection Sort: Selection sort is a simple and efficient sorting algorithm that
          works by repeatedly selecting the smallest (or largest) element from the unsorted
          portion of the list and moving it to the sorted portion of the list.
    */

    /* Approach II: Using rpw, column and minIndx as parameter. */
    public static void selectionSortAdvanced(int[] arr, int row, int col, int maxIndx){
        if(row == 0){
            return;
        }

        if(col < row){
            if(arr[col] > arr[maxIndx]){
                selectionSortAdvanced(arr,row,col+1,col);
            }
            else{
                selectionSortAdvanced(arr,row,col+1,maxIndx);
            }
        }
        else{
            //swap
            int temp = arr[maxIndx];
            arr[maxIndx] = arr[row-1];
            arr[row-1] = temp;

            selectionSortAdvanced(arr, row-1, 0, 0);
        }
    }

    /* Approach I: Using basic recursion. */
    public static void recursiveSelectionSort(int[] arr, int start){
        int size = arr.length;

        if (start >= size - 1) {
            return;
        }

        // Find the index of the minimum element in the subarray from 'start' to the end
        int minIndex = start;
        for (int i = start + 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        // Swap the found minimum element with the element at the 'start' index
        int temp = arr[start];
        arr[start] = arr[minIndex];
        arr[minIndex] = temp;

        // Recursively sort the rest of the array
        recursiveSelectionSort(arr, start + 1);
    }

    public static void main(String[] args) {
        System.out.println("Selection Sort using recursion.\n");

        System.out.println("Selection Sort.");
        int[] arr = {12, 11, 10, 9, 8};

        System.out.println("Array: " + Arrays.toString(arr));
        recursiveSelectionSort(arr, 0);

        System.out.println("Approach I: Array after selection sort: " + Arrays.toString(arr));

        System.out.println("\nSelection Sort.");
        int[] brr = {12, 11, 10, 9, 8};

        System.out.println("Array: " + Arrays.toString(brr));
        selectionSortAdvanced(brr, brr.length, 1, 0);

        System.out.println("Approach II: Array after selection sort: " + Arrays.toString(brr));
    }
}
