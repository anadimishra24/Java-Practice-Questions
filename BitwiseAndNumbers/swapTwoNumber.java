package BitwiseAndNumbers;

import java.util.Scanner;

public class swapTwoNumber {

    /* For swap two numbers, we use bitwise XOR operator */

    private static void swapAandB(int a, int b) {
        // if number is same no need to perform this operation.
        if (a != b) {
            a = a ^ b;
            b = a ^ b;
            a = a ^ b;
        }
        System.out.println("\nYou number after swap: a = " + a +" and b = " + b );
    }
    
    public static void main(String[] args) {
        System.out.println("\nSwap two number a and b with using bitwise operator.\n");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        int a = input.nextInt();

        System.out.println("Enter your second number: ");
        int b = input.nextInt();

        System.out.println("You number before swap: a = " + a +" and b = " + b );
        
        swapAandB(a,b);
    }
}
