package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sum {

    // return indices of the two numbers such that they add up to a specific target
    public static int[] twoSum(int[] numb, int target){
        // HashMap to store numbers and their indices
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < numb.length; i++) {
            int complement = target - numb[i];

            // Check if complement exists in the hashmap
            if (map.containsKey(complement)) {
                // Return indices of the two numbers
                return new int[] { map.get(complement), i };
            }

            // Store current number and its index in the hashmap
            map.put(numb[i], i);
        }

        // If no solution found, return an empty array or handle as needed
        throw new IllegalArgumentException("No two sum solution");
    }

    // get the sum of all odd places elements
    public static int oddSum(int[] arr){
        int sum = 0;
        for (int i = 1; i < arr.length; i = i+2) {
            sum = sum + arr[i];
        }
        return sum;
    }

    // get the sum of all even places elements
    public static int evenSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i = i+2) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("In this section, we add all the elements of array\n");

        int[] arr = {10,20,30,40};

        System.out.print("Array: ");
        for(int a: arr){
            System.out.print(a + " ");
        }

        /* Instead of using for loop, we directly use the array inbuilt function
        for (int j : arr) {
            sum = sum + j;
        }*/
        int sum = Arrays.stream(arr).sum();

        System.out.println("\n\nSum of all the elements are: " + sum);

        int odd = oddSum(arr);
        System.out.println("\nOdd places sum: " + odd);

        int even = evenSum(arr);
        System.out.println("\nEven places sum [0th index is included in even] : " + even);

        System.out.println("\nGet the target sum and return its incises.");
        int target = 50;
        int[] twoIndx = twoSum(arr, target);

        for(int i: twoIndx){
            System.out.print(i + " ");
        }
    }
}
