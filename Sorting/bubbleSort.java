package Sorting;

import java.util.Arrays;

public class bubbleSort {

    public static void bubbleSorting(int[] arr){
        int size = arr.length - 1;

        /* bubble sort */

        /* Note: This is code is correct for all scenarios, but this block of code is executing everytime if an array is already sorted,
            so instead of my time complexity should be O(1) it take O(n). So overcome this I use a boolean i.e.
            'isSwap' that maintains the record is array is swapped or not if swapped then no need to check further come out of the loop.
        */

        boolean isSwap;
        // for round 1 to size - 1
        for (int i = 0; i < size; i++){
            isSwap = false;
            // process all the element for each round
            for (int j = 0; j < size - i; j++){         // j < size - i because at each round last element is sorted so decrement the loop
                if(arr[j] > arr[j+1]){
                    // Swap elements using a temporary variable
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwap = true;
                }
            }
            // swap does not perform a means array is sorted break the 'j' loop.
            if(!isSwap){
                break;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Bubble Sort.");
        System.out.println("Bubble Sort also known as Sinking Sort or Exchange Sort");

        int[] arr = {109, 99, 56, 34, 2, 0, -9};

        System.out.println("Array: " + Arrays.toString(arr));
        bubbleSorting(arr);

        System.out.println("Array after bubble sort: " + Arrays.toString(arr));
    }
}
