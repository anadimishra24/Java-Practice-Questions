package BitwiseAndNumbers;

import java.util.Scanner;

       /*
           Resetting the i-th bit of a number of means changing the value of the i-th bit (0-based index)
           in the binary representation of that number to 0. If the bit is already 0, it remains unchanged.
           This operation is used for manipulating individual bits in binary data, similar to setting bits
           but with the goal of clearing or turning them off.

           Example 1: n = 18 (in binary: 10010), i = 1 (reset the 1st bit of number)
                     ans = 10000 (in decimal: 16)

           Example 2: n = 18 (in binary: 10010), i = 2 (reset the 2nd bit of number, it was already on, so it changes to off)
                 ans = 10000 (in decimal: 18)



            Steps: To solve this problem
                         n = 10010, i = 1
                         mask = 1 << 1     // 00010
                         negMask = ~(mask)

                        10010 (18 in decimal)
                     &  11110111 (bitmask)
                        ----------------------
                        10000 (16 in decimal)

     */

    public class reset_ithBit {

        private static int resetithBitOfNumber(int n, int i) {
            // create a msk
            int mask = (1 << i);

            // negate a mask, so ith bit is 0, and remains are 1
            int negateMask = ~(mask);

            /* nstead of doing mask and then negative mask we can directly do this: Create a bitmask with 0 at the ith
               position and 1s elsewhere */
            // int bitmask = ~(1 << i);

            return n & negateMask;


        }

        public static void main(String[] args) {
            System.out.println("Reset the ith bit of the number.");

            Scanner input = new Scanner(System.in);

            System.out.println("\nEnter your number: ");
            int n = input.nextInt();

            System.out.println("\nEnter the ith bit want to reset: ");
            int i = input.nextInt();

            int ans = resetithBitOfNumber(n, i);
            System.out.println("After reset the "+ i +"th bit of the number, the new number is: " + ans);
        }
    }
