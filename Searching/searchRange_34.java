package Searching;

import java.util.Arrays;

public class searchRange_34 {

    public static int[] searchRange(int[] nums, int target) {

        int start = searchForIndex(nums, target, true); // looking for start index after getting the target at mid-index.
        int end = searchForIndex(nums, target, false);  // looking for the end index after getting the target at mid-index.


        return new int[] {start, end};
    }

    public static int searchForIndex(int[] nums, int target, boolean isStartIndx){
        int start = 0;
        int end = nums.length-1;

        int ans = -1;

        // System.out.println("Size of Array: " + end);

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(nums[mid] > target){
                end = mid - 1;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }
            else{
                ans = mid;
                if(isStartIndx){ // we found the target but there is high chance is that target is present left(start) side, check for left side
                    end = mid - 1;
                }
                else{   // looking for the last occurrence of the target
                    start = mid + 1;
                }
            }
        }
        // return the index according start or end occurrence of target.
        return  ans;
    }

    public static void main(String[] args) {
        System.out.println("Leetcode question no: 34. Find First and Last Position of Element in Sorted Array");

        int[] nums = {5,7,7,7,7,10};
        int target = 7;
        int[] indexRange = searchRange(nums, target);

        System.out.println("Target range: " + Arrays.toString(indexRange));
    }
}
