package BitwiseAndNumbers;

import java.util.Arrays;

public class findUniqueElement {

    /* XOR: We know that, when do xor 'number' with same number get the same number
       ex: a ^ a = 0
    */
    public static int uiqueElement(int[] arr){
        int ans = 0;

        for(int a: arr){
            ans = ans ^ a;
        }
        return ans;
    }

    public static void main(String[] args) {

        System.out.println("\nFind the unique element in the array");

        int[] arr = {2, 3, 4, 6, 2, 4, 3};

        System.out.println("\nArrays: " + Arrays.toString(arr));

        int ans = uiqueElement(arr);

        System.out.println("\nUnique element in the array: " + ans);

    }

}
