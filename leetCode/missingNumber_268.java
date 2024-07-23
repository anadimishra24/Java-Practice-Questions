package leetCode;

import java.util.Arrays;

public class missingNumber_268 {


    /* Approach I: It is my intuition to solve the question, and it submitted fine with a 100 % rate */
    public static int missingNumber(int[] nums) {

        int size = nums.length;
        // System.out.println("size = " + size);

        // get the sum from 0 to n
        int sumOfn = 0;
        for (int i = 1; i <= size; i++) {
            sumOfn += i;
        }

        // get the sum of array elements
        int numSum = 0;
        for (int i = 0; i < size; i++) {
            numSum += nums[i];
        }
        // System.out.println("Sum = " + sumOfn);

        // subtract it so got the difference, and that is the missing number.
        return  sumOfn - numSum;
    }

    /* Approach II: Here we used cyclic sort because in question it clearly mentions that
           array nums containing n distinct numbers in the range [0, n] */
    public static int missingNumberCyclicApproach(int[] nums){

        int start = 0;

        while(start < nums.length){
            int correctIndex = nums[start];

            if(nums[start] < nums.length && nums[start] != nums[correctIndex]){
                swapPositions(nums, start, correctIndex);
            }
            else{
                start++;
            }
        }

        // search for missing number
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i] != i){
                return i;
            }
        }

        // otherwise
        return nums.length;
    }

    public static void  swapPositions(int[] arr, int i, int corectIndx){
        int temp = arr[i];
        arr[i] = arr[corectIndx];
        arr[corectIndx] = temp;
    }


    public static void main(String[] args) {
        System.out.println("LeetCode Ques no: 268. Missing Number");

        int[] nums = {3,0,1};

        System.out.println("Array: " + Arrays.toString(nums));
        int ans = missingNumber(nums);

        System.out.println("Approach I: My way, Missing number is: " + ans);


        int[] arr = {9,6,4,2,3,5,7,0,1};

        System.out.println("Array: " + Arrays.toString(arr));
        int res = missingNumber(arr);

        System.out.println("Approach II: Cyclic Sort, Missing number is: " + res);

    }
}
