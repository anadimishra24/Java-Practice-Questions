package BitwiseAndNumbers;

import java.util.Scanner;

public class countOneBits {

    /*
        Example: number = 15 -> 1111 = # 1's bit is 4
    */
    private static int countNumberOfOneBits(int number) {
        int count = 0;
        while (number != 0) {
            count += (number & 1);    // we get the LSB if it 1 it gives 1 or if it is 0 it will give 0
            number >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("\nCount the number of 1's using bit manipulation. Also known as 'Hamming weight'\n");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int number = input.nextInt();

        int ans = countNumberOfOneBits(number);

        System.out.println("Number of 1's bit in " + number +" is: " + ans);
    }
}
