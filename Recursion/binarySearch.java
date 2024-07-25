package Recursion;

public class binarySearch {

    private static int binarySearchRecursion(int[] arr, int start, int end, int target) {
        // base case
        if(start > end){
            return -1;
        }

        // calculation
        int mid = start + (end - start) / 2;

        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid] > target){
            return binarySearchRecursion(arr, start, mid-1, target);
        }
        else {
            return binarySearchRecursion(arr, mid+1, end, target);
        }
    }

    public static void main(String[] args) {
        System.out.println("Binary Search using recursion");

        int[] arr = {10, 14, 15, 20, 29, 40};
        int target = 200;

        int pos = binarySearchRecursion(arr, 0, arr.length-1, target);

        System.out.println("Target are found at position: " + pos);
    }
}
