package Sorting;

import java.util.Arrays;

public class cycleSort {

    /*Cycle Sort: Cycle sort is a comparison sorting algorithm that forces array to be factored
                  into the number of cycles where each of them can be rotated to produce a sorted array.
                  It is theoretically optimal in the sense that it reduces the number of writes to the original array.

                  It is an in-place and unstable sorting algorithm. Cycle sort forces an array to be factored into
                  a number of cycles where every element can rotate in order to produce a sorted array.
                  The time complexity of cycle sort is O(n2), even in the best case.
    */

    /* fullCycleSort: we write a full cyclic sort*/
    private static void fullCycleSort(int[] brr) {

        //Step 1: pick the element and find the position where it should be.

        //Step 2: put that element at its suitable place.

        //

    }

    /* cycleSort0toN: This cycle sort is just a variant of actual cycle sort, here array has all the numbers
                      in range of n; n = length of an array */

    /* Note: 1. If the range is [0 to N] then every element will be at index = value
             2. If the range is [1 to N] then every element will be at index = value - 1
   */

   public static void cycleSort0toN(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int corectIndx = arr[i] - 1;
            if(arr[i] != arr[corectIndx]){
                swapPositions(arr, i, corectIndx);
            }
            else{
                i++;
            }
        }

    }

    private static void swapPositions(int[] arr, int i, int corectIndx) {
        int temp = arr[i];
        arr[i] = arr[corectIndx];
        arr[corectIndx] = temp;
    }

    public static void main(String[] args) {

        System.out.println("This is cycle sort.");

        int arr[] = {5, 4, 3, 2, 1};

        System.out.println("Array: " + Arrays.toString(arr));

        cycleSort0toN(arr);

        System.out.println("Array after cycle sort[0 - n]: " + Arrays.toString(arr));

        int[] brr = {30, 10, 40, 50, 20};

        System.out.println("Array for full cycle sort:" + Arrays.toString(brr));
        fullCycleSort(brr);

        System.out.println("Array after full cycle sort[0 , n-2, n-4, n-1, n-9, n]: " + Arrays.toString(arr));

    }

}
