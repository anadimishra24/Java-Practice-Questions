package Recursion;

import java.util.Scanner;

public class productOfDigits {

        /* we also used this method to get the sum of the digits, no need to use extra variable 'sum'*/
        public static int prodOfDigitsRecursion(int num) {
            if(num == 0){
                return 1;
            }

            return (num %10) * prodOfDigitsRecursion(num/10);
        }

        public static void main(String[] args) {
            System.out.println("Find the product of the digits of the number.\n");

            Scanner input = new Scanner(System.in);

            System.out.println("Enter your number: ");
            int num = input.nextInt();
            int prodDigit = prodOfDigitsRecursion(num);

            System.out.println("Product of the digits of the number " + num +" is: " + prodDigit);
        }


}
