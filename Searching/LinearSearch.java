package Searching;

import java.util.Arrays;

public class LinearSearch {

    private static int linearSearchIndex(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if(target == arr[i]){
                return  i;
            }
        }
        return -1;
    }

    private static int searchCharacter(String str, char ch) {

        for (int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i)){
                return i;
            }
        }

        /* Use of toCharArray() to convert the string into array of character.
        for(char c: str.toCharArray()){

            if(c == ch){
                return 1;
            }
        }
        */

        return -1;
    }

    public static void main(String[] args) {
        System.out.println("This is Linear Search");

        int[] arr = {12, 34, 2, 11, 24, 3, 1};

        System.out.println("Array : " + Arrays.toString(arr));

        int target = 11;

        int index = linearSearchIndex(arr, target);

        System.out.println("Element found at index: " + index);

        System.out.println("\nSearch character in a string.");
        String str = "Anadi";

        char ch = 'd';

        System.out.println("String: " + str);

        int ans = searchCharacter(str, ch);

        System.out.println("Character found at: " + ans);


    }

}
