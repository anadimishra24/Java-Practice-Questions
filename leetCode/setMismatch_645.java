package leetCode;

import java.util.Arrays;
import java.util.List;

public class setMismatch_645 {

    public static int[] findErrorNums(int[] nums){
        int start = 0;

        while(start < nums.length){
            int correctIndex = nums[start]-1;

            if(nums[start] != nums[correctIndex]){
                swapPositions(nums, start, correctIndex);
            }
            else{
                start++;
            }
        }

        // search for missing number
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i] != i+1){
                return new int[] {nums[i], i+1};
            }
        }

        // otherwise
        return new int[] {-1,-1};
    }

    private static void swapPositions(int[] arr, int i, int corectIndx) {
        int temp = arr[i];
        arr[i] = arr[corectIndx];
        arr[corectIndx] = temp;
    }



    public static void main(String[] args) {
        System.out.println("LeetCode Ques no. : 645. Set Mismatch");

        int[] arr = {1,2,2,4};
        System.out.println("Array: " + Arrays.toString(arr));

        int[] ans = findErrorNums(arr);
        System.out.println("Set Mismatch: " + Arrays.toString(ans));

    }
}
