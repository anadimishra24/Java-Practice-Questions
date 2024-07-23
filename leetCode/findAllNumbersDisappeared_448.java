package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findAllNumbersDisappeared_448 {

    public static List<Integer> findDisappearedNumbers(int[] nums) {

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
                ans.add(index+1);
            }
        }
        return ans;
    }


    private static void swapPositions(int[] arr, int i, int corectIndx) {
        int temp = arr[i];
        arr[i] = arr[corectIndx];
        arr[corectIndx] = temp;
    }


    public static void main(String[] args) {
        System.out.println("\nLeetCode Ques no: 448. Find All Numbers Disappeared in an Array");


        int[] nums = {4,3,2,7,8,2,3,1};

        System.out.println("Array: " + Arrays.toString(nums));

        List<Integer> result = findDisappearedNumbers(nums);

        System.out.println("Disappeared no. : " + Arrays.toString(result.toArray()));

    }
}
