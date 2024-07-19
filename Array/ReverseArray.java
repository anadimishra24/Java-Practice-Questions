package Array;

import java.util.ArrayList;
import java.util.Arrays;


public class ReverseArray {
    static void reversArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int temp = arr[start];
            arr[start++] = arr[end--];
        }
    }
    public static void main(String[] args) {
        System.out.println("Reverse of Array using two pointer.\n");

        int[] arr = { 12, 2, 34, 23, 10, 1 };

        System.out.println("Original array: " + Arrays.toString(arr));
        reversArray(arr);

        System.out.println("Reverse array: " + Arrays.toString(arr));

    }
}
