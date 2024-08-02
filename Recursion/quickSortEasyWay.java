package Recursion;

import java.util.Arrays;

public class quickSortEasyWay {

    /* in this partition function, we use simple steps to place the pivot at right place
       and sort the two halves of arrays */
    private static int partition(int[] arr, int start, int end) {
        // everytime select the first element as a pivot element.
        int pivot = arr[start];

        int count = 0;

        for(int i = start+1; i <= end; i++){
            if(arr[i] <= pivot){
                count++;
            }
        }

        // place the pivot at right index
        int pivotIndx = start + count;
        // System.out.println("pivotIndx = " + pivotIndx);

        int temp = arr[start];
        arr[start] = arr[pivotIndx];
        arr[pivotIndx] = temp;

        // check the two halves are arranged in correct order or not
        //int i = start, j = end;
        while(start < pivotIndx && end > pivotIndx){
            while(arr[start] < pivot){
                start++;
            }
            while(arr[end] > pivot){
                end--;
            }
            if(start < pivotIndx && end > pivotIndx){
                //swap the elements
                int copy = arr[start];
                arr[start] = arr[end];
                arr[end] = copy;
                start++;
                end--;
            }
        }
        return pivotIndx;
    }

    public static void quickSort(int[] arr, int start, int end){
        if(start >= end){
            return;
        }

        int pivotIndex = partition(arr, start, end);

        // sort the remaining array.

        //left part sort
        quickSort(arr, start, pivotIndex-1);

        //right part sort
        quickSort(arr, pivotIndex+1, end);

    }

    public static void main(String[] args) {
        System.out.println("\nUsed the quick sort algorithm for sorting the array.\n");

        int[] arr =  {3,1,4,5,2};// {10, 80, 30, 90, 40, 50, 70};

        System.out.println("Array: " + Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Array after quick sort: " + Arrays.toString(arr));
    }
}