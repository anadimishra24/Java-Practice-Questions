package Recursion;

public class linearSearch {

    /* Approach I: here we return true/false respective of a result */
    public static boolean find(int[] arr, int target, int index) {
        if(index == arr.length){
            return false;
        }

        return arr[index] == target || find(arr, target, index+1);
    }

    /* Approach II: here we return the index of the element */
    public static int search(int[] arr, int target, int index) {
        if(index == arr.length){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }
        else{
            return search(arr, target, index+1);
        }
    }

    public static void main(String[] args) {
        System.out.println("\nFind the target element in the array using recursion.\n");

        int[] arr = {12, 23, 22, 56, 99};
        int target = 229;

        if(find(arr, target, 0)){
            System.out.println("Approach I: Element found.\n");
        }
        else{
            System.out.println("Approach I: Element not found.\n");
        }

        int indx = search(arr, target, 0);

        System.out.println("Approach II: Element found at index: " + indx);




    }
}
