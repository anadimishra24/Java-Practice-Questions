package Recursion;

import java.util.Scanner;

public class sumOfDigits {

    public static int sumOfDigitsRecursion(int num, int sum) {
        if(num == 0){
            return sum;
        }

        sum = sum + (num % 10);

        return sumOfDigitsRecursion(num/10, sum);

    }

    public static void main(String[] args) {
        System.out.println("Find the sum of the digits of the number.\n");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int num = input.nextInt();
        int sum = 0;
        int sumDigit = sumOfDigitsRecursion(num, sum);

        System.out.println("Sum of the digits of the number " + num +" is: " + sumDigit);
    }
}
