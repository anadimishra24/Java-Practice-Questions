package Searching;

/*
    GG Ques: https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
 */
public class infiniteArrayBS {

    private static int getIndexFromInfiniteArray(int[] arr, int target) {

        // since it is an infinite array, we don't have the size, so we used chunks of array to iterate in binary search
        int start = 0;
        int till = 4;

        // Instead of writing this big block of code, we use alternative below
        /*
        boolean isPos = true;
        while (isPos) {

            // check target lies in chunk range
            if (arr[start] < target && arr[till] > target) {
                System.out.println("into the target range..." + start + "  " + till);
                // target lies in the chunk range, so find the position of index
                int indx = getPosition(arr, target, start, till);
                isPos = false;
                return indx;
            } else {
                System.out.println("into the else .. update the start and else ");
                // target does not lie in the chunk so now, moved the chunk further
                start = till + 1;
                till = till + 4;
                System.out.println("update the start else " + start + "  " + till);
            }
        }
        return -1;
        */

        // Expand the chunk size exponentially until the target is within range
        while (arr[till] < target) {
            start = till; // Move the start to the previous chunk end
            till = till * 2; // Double the chunk size
        }

        // Once the target is within range, perform binary search
        return getPosition(arr, target, start, till);

    }

    private static int getPosition(int[] arr, int target, int start, int till) {
        while (start <= till) {
            int mid = start + (till - start) / 2;
            if (arr[mid] == target) {
                return mid; // Found the target
            } else if (arr[mid] > target) {
                till = mid - 1; // Search in the left half
            } else {
                start = mid + 1; // Search in the right half
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        System.out.println("This is the Geeks For Geeks Question");

        // we do not use length here because it is supposed to be infinite array so, don't the array length(end of array)
        int arr[] = new int[]{3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};

        int target = 130;

        int ans = getIndexFromInfiniteArray(arr, target);

        System.out.println("Index of element: " + ans);
    }


}
