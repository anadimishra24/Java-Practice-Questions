package BitwiseAndNumbers;

import java.util.Scanner;

public class find_ithBit {
    private static int ithBitOfNumber(int n, int i) {
        int nthBit = (n >> i) & 1;
        return nthBit;
    }

    public static void main(String[] args) {
        System.out.printf("Find the ith bit of the number.");

        Scanner input = new Scanner(System.in);

        System.out.printf("\nEnter your number: ");
        int n = input.nextInt();

        System.out.printf("\nEnter the ith value: ");
        int i = input.nextInt();

        int ans = ithBitOfNumber(n, i);
        System.out.printf("The " + i + "th bit of the number: " + ans);
    }
}
