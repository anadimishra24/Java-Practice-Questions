package Recursion;

import java.util.Arrays;

public class quickSorting {

    private static int partition(int[] arr, int start, int end) {
        // everytime select the first element as a pivot element.
        int pivot = arr[start];
        int i = start;
        int j = end;

        while(i < j){
            while(arr[i] <= pivot && i <= end-1){
                i++;
            }
            while(arr[j] > pivot && j >= start+1){
                j--;
            }
            if(i < j){
                //swap the elements
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap: Place the pivot element in the correct position
        int temp = arr[start];
        arr[start] = arr[j];
        arr[j] = arr[start];
        return j;
    }

    public static void quickSort(int[] arr, int start, int end){
        if(start > end){
            return;
        }

        int pivotIndex = partition(arr, start, end);

        // sort the remaining array.
        quickSort(arr, start, pivotIndex-1);
        quickSort(arr, pivotIndex+1, end);

    }

    public static void main(String[] args) {
        System.out.println("\nUsed the quick sort algorithm for sorting the array.\n");

        int[] arr = {10, 80, 30, 90, 40, 50, 70};

        System.out.println("Array: " + Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Array after quick sort: " + Arrays.toString(arr));
    }
}
