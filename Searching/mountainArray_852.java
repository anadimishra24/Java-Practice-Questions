package Searching;

public class mountainArray_852 {

    private static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
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
        System.out.println("LeectCode Ques no: 852. Peak Index in a Mountain Array");

        int[] arr = {0,2,1,0};

        int peakElement = peakIndexInMountainArray(arr);

        System.out.println("The Peak of the mountain is: " + peakElement);
    }


}
