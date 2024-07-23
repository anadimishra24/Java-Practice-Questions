package leetCode;

import java.util.Arrays;

public class findDuplicateNumber_287 {

    /*Approach II: Using cyclic Sort*/
    public static int findDuplicateCyclicSort(int[] nums){
        int i = 0;
        while (i < nums.length) {
            if(nums[i] != i + 1){
                int corectIndx = nums[i] - 1;
                if (nums[i] != nums[corectIndx]) {
                    swapPositions(nums, i, corectIndx);
                } else {
                    return nums[i];
                }
            }
            else {
                i++;
            }
        }
        return -1;
    }

    private static void swapPositions(int[] arr, int i, int corectIndx) {
        int temp = arr[i];
        arr[i] = arr[corectIndx];
        arr[corectIndx] = temp;
    }

    /*Approach I: Using XOR operator (It fails when arr is {3,3,3,3,3,3)*/
    public static int findDuplicate(int[] nums) {
        int ans = 0;

        // XOR ing all array element
        for (int i = 0; i < nums.length; i++){
            ans = ans ^ nums[i];
        }

        // XOR [1, N-1]
        for (int i = 0; i < nums.length; i++){
            ans = ans ^ i;
        }

        return ans;
    }

    public static void main(String[] args) {

        System.out.println("\nLeetCode Ques no. : 287. Find the Duplicate Number\n");

        int[] arr = {1,3,4,2,2};
        System.out.println("Approach I: Array: " + Arrays.toString(arr));

        int ans = findDuplicate(arr);

        System.out.println("Duplicate number: " + ans);

        int[] brr = {3,3,3,3,3};
        System.out.println("Approach II: Array: " + Arrays.toString(brr));

        int res = findDuplicateCyclicSort(brr);

        System.out.println("Duplicate number: " + res);
    }
}
