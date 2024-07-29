package Recursion;

import java.util.Arrays;

public class sortedArray {

    private static boolean isSorted(int[] arr, int index) {
        if(index == arr.length-1){
            return true;
        }

        return arr[index] < arr[index+1] && isSorted(arr, index+1);
    }

    public static void main(String[] args) {
        System.out.println("Check the array is sorted or not.\n");

        int[] arr = {12, 23, 2, 56, 99};

        if(isSorted(arr, 0)){
            System.out.println("Array: " + Arrays.toString(arr) + " is sorted.");
        }
        else {
            System.out.println("Array: " + Arrays.toString(arr) + " is not sorted.");
        }
    }
}
