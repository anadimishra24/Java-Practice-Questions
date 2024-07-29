package Recursion;

import java.util.Scanner;

public class reverseNumber {

    private static int reverseNum(int num, int rem) {
        if(num ==  0){
            return rem;
        }
        rem = rem * 10 + (num%10);
        return reverseNum(num/10, rem) ;

    }

    public static void main(String[] args) {
        System.out.println("Find the product of the digits of the number.\n");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int num = input.nextInt();
        int rem = 0;
        int rev = reverseNum(num,rem);

        System.out.println("Reverse of the number " + num +" is: " + rev);
    }
}

