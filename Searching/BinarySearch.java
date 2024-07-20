package Searching;

import java.util.Arrays;


public class BinarySearch {

    private static int binarySearchIndex(int[] arr, int target) {

        int start = 0;
        int end = arr.length-1;

        // System.out.println("Size of Array: " + end);

        while(start <= end){
            int mid = start + (end - start) / 2;
            // System.out.println("mid = " + mid );
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        // not found the element at any index
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Binary Search in Array");

        int[] arr = {10, 24, 45, 49, 55, 60};

        System.out.println("Array : " + Arrays.toString(arr));

        int target = 10;

        int index = binarySearchIndex(arr, target);

        System.out.println("Element found at index: " + index);

    }
}
