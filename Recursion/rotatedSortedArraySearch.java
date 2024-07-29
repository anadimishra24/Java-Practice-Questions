package Recursion;

public class rotatedSortedArraySearch {

    private static int binaryRotated(int[] arr, int target, int start, int end) {
        if(start > end){
            return -1;
        }

        int mid = start + (end - start) / 2;

        if(arr[mid] == target){
            return mid;
        }
        if(arr[start] <= arr[mid]){
            if(target >= arr[start] && target <= arr[mid]){
                return binaryRotated(arr,target,start, mid-1);
            }
            else{
                return binaryRotated(arr,target,mid+1,end);
            }
        }
        if(target >= arr[mid] && target <= arr[end]){
            return binaryRotated(arr,target,mid+1,end);
        }
        else{
            return binaryRotated(arr,target,start, mid-1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Find the element in the rotated sorted Array.\n");

        int[] arr = {7, 6, 5, 1, 2, 3, 4};
        int target = 32;

        int indx = binaryRotated(arr, target, 0, arr.length-1);
        System.out.println("Element found at index: " + indx);
    }
}
