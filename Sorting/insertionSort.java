package Sorting;

import java.util.Arrays;

public class insertionSort {
    public static void insertionSorting(int[] arr){

        /* Insertion sort: It is a simple sorting algorithm that works by iteratively
           inserting each element of an unsorted list into its correct position in a
           sorted portion of the list. It is a stable sorting algorithm, meaning that elements
           with equal values maintain their relative order in the sorted output.

            Example: Insertion sort is like sorting playing cards in your hands.
                     You split the cards into two groups: the sorted cards and the unsorted cards.
                     Then, you pick a card from the unsorted group and put it in the right place in the sorted group.
        */


        int size = arr.length;
        for (int i = 1; i < size; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0...  i-1], that are greater than a key, to one position ahead
               of their current position */

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

    }

    public static void main(String[] args) {
        System.out.println("Insertion Sort");

        int[] arr = {12, 11, 10, 9, 8};

        System.out.println("Array: " + Arrays.toString(arr));
        insertionSorting(arr);

        System.out.println("Array after insertion sort: " + Arrays.toString(arr));

    }
}
