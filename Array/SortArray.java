package Array;

import java.util.Arrays;

public class SortArray {

    static void sortInAsc(int[] arr){

        int size = arr.length - 1;

        /* bubble sort */

        // for round 1 to size - 1
        for (int i = 0; i < size; i++){
            // process all the element for each round
            for (int j = 0; j < size - i; j++){         // j < size - i because at each round last element is sorted so decrement the loop
                if(arr[j] > arr[j+1]){
                    // Swap elements using a temporary variable
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void sortInDsc(int[] arr){

        int size = arr.length - 1;

        /* bubble sort */

        // for round 1 to size - 1
        for (int i = 0; i < size; i++){
            // process all the element for each round
            for (int j = 0; j < size - i; j++){         // j < size - i because at each round last element is sorted so decrement the loop
                if(arr[j] < arr[j+1]){
                    // Swap elements using bitwise XOR
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Reverse of Array using two pointer.\n");

        int[] arr = { 12, 2, 34, 23, 10, 1 };

        System.out.println("Original array: " + Arrays.toString(arr));

        sortInAsc(arr);

        System.out.println("Ascending Order array: " + Arrays.toString(arr));

        sortInDsc(arr);

        System.out.println("Descending Order array: " + Arrays.toString(arr));


    }
}
