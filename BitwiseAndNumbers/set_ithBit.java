package BitwiseAndNumbers;

import java.util.Scanner;

    /*
      Setting the i-th bit of a number refers to changing the value of the i-th bit (0-based index)
      in the binary representation of that number to 1. If the bit is already 1, it remains unchanged.

      This operation is useful for manipulating individual bits in binary data.

      Example 1: n = 18 (in binary: 10010), i = 3 (set the 3 bit of number)
                 ans = 11010 (in decimal: 26)

      Example 2: n = 18 (in binary: 10010), i = 1 (set the 1 bit of number, it is already one so nothing change)
                 ans = 11010 (in decimal: 18)

      Steps to solve this by maksing:
      n = 10010, i = 3
      mask = 1 << 3     // 01000

      ans = n | mask
             1 0 0 1 0
           | 0 1 0 0 0
           --------------
             1 1 0 1 0
           ---------------
    */

public class set_ithBit {
    private static int setithBitOfNumber(int n, int i) {
        int mask = (1 << i);
        return n | mask;
    }

    public static void main(String[] args) {
        System.out.printf("Set the ith bit of the number.");

        Scanner input = new Scanner(System.in);

        System.out.printf("\nEnter your number: ");
        int n = input.nextInt();

        System.out.printf("\nEnter the ith bit want to set: ");
        int i = input.nextInt();

        int ans = setithBitOfNumber(n, i);
        System.out.printf("After set the " + i + "th bit of the number, the new number is: " + ans);
    }
}
