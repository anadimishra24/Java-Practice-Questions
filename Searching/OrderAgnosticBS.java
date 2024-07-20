package Searching;

import java.util.Arrays;

public class OrderAgnosticBS {

    private static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        boolean isAscOrder = arr[start] < arr[end];

        // System.out.println("Size of Array: " + end);

        while(start <= end){
            int mid = start + (end - start) / 2;

            // this condition is same for both Ascending and Descending Oder Array, so keep out of cond check.
            if(arr[mid] == target){
                return mid;
            }

            // check whether array is ascending order sort or descending order sort
            if(isAscOrder){
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{ // array is descending order sort
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }

        }
        // not found the element at any index
        return -1;
    }

    public static void main(String[] args) {

        /* Order agnostic binary search is a variation of the traditional binary search
           algorithm that works on arrays which may be sorted either in ascending or descending order.
           The key idea is to determine the order of the array (ascending or descending) and then perform
           the binary search accordingly. */

        System.out.println("""
                \nThis is also binary search, but it is called Order Agnostic Binary Search
                because we don't know whether it is sorted in Ascending Order or Descending Order,
                so first we find the sorted order and then apply binary search according to that.""");


        int[] arr = {10, 24, 45, 49, 55, 60};

        System.out.println("\nArray : " + Arrays.toString(arr));

        int target = 49;

        int index = orderAgnosticBS(arr, target);

        System.out.println("Element found at index: " + index);

    }


}
