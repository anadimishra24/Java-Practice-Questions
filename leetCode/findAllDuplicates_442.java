package leetCode;

import java.util.*;

public class findAllDuplicates_442 {

    /*Approach II: Using cyclic Sort*/
    public static List<Integer> findDuplicatesCyclicSort(int[] nums){
        int i = 0;
        while (i < nums.length) {
            int corectIndx = nums[i] - 1;
            if (nums[i] != nums[corectIndx]) {
                swapPositions(nums, i, corectIndx);
            } else {
                i++;
            }
        }

        // find missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index + 1){           // chech the cycleSort.java Note point
                ans.add(nums[index]);
            }
        }
        return ans;
    }

    private static void swapPositions(int[] arr, int i, int corectIndx) {
        int temp = arr[i];
        arr[i] = arr[corectIndx];
        arr[corectIndx] = temp;
    }


    /* Approach I: Using Hash map, already done in cpp*/
    public static List<Integer> findDuplicates(int[] nums) {
        // Step 1: Create a HashMap to store the count of occurrences for each integer.
        Map<Integer, Integer> occurrences = new HashMap<>();

        // Count occurrences of each number in nums array
        for (int num : nums) {
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create a List to store duplicate values
        List<Integer> duplicateValues = new ArrayList<>();

        // Identify numbers with exactly 2 occurrences and add them to the list
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            if (entry.getValue() == 2) {
                duplicateValues.add(entry.getKey());
            }
        }

        return duplicateValues;
    }
    public static void main(String[] args) {
        System.out.println("LeetCode Ques no. : 442. Find All Duplicates in an Array\n");

        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println("Array: " + Arrays.toString(arr));

        List<Integer> ans = findDuplicates(arr);
        System.out.println("All duplicate numbers: " + Arrays.toString(ans.toArray()));

        int[] brr = {1,1,2};
        System.out.println("Array: " + Arrays.toString(brr));

        List<Integer> res = findDuplicatesCyclicSort(brr);
        System.out.println("All duplicate numbers: " + Arrays.toString(res.toArray()));


    }
}
