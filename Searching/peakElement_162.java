package Searching;

public class peakElement_162 {

    public static int findPeakElement(int[] nums) {
        // cap pastes the solution of mountainArray_852.java
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            } else {
                // here we not pass end = mid -1 because it may lead our code to redundancy if our
                // mid itself is peak element, and we do mid - 1 then we loose that peak element
                end = mid;
            }
        }
        return start;

    }

    public static void main(String[] args) {
        System.out.println("LeetCode Ques no: 162. Find Peak Element");
        System.out.println("""
                           \nThis question is same as ques no. 852 nothing change only change is 852 +
                            is marked as easy this one marked as medium. 😂😂\s""");


        int[] nums = {1,2,3,1};

        int peakElement = findPeakElement(nums);

        System.out.println("\nThe Peak of the mountain is: " + peakElement);


    }
}
