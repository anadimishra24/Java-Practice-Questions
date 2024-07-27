package Mathmetics;

import java.util.Scanner;

public class squareRoot {

    /*
        We will use here binary search for finding the square root of number.
    */
    public static double sqrt(int num){
        int start = 0;
        int end = num;

        /* if the number is not perfect square, then we maintain its nearest square root,
           so during finding it precision we don't need to start from 0
        */
        int nearSqrt = 0;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(mid * mid == num){
                return mid;
            }
            else if(mid * mid > num){
                nearSqrt = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }

        /* if it comes here, means number not have a perfect square, so we find it the closest square root.*/
        double precision = 0.1;

        /* instead of passing nearSqrt if we pass 0.0 then it will start finding square root from 0.0,
           and it increases our time complexity*/

        double root = nearSqrt;    //    double root = 0.0;
        for (int i = 0; i < 3; i++) {
            while(root * root <= num){
                root = root + precision;
            }
            root = root - precision;
            precision /= 10;
        }

        return root;
    }

    public static void main(String[] args) {
        System.out.println("\nFind the square root of number with optimized way.");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = input.nextInt();

        double sqRoot = sqrt(num);
        System.out.println("\nSquare root of " + num + " is: " + sqRoot);

        // get the resize value up to 3 digit.
        System.out.printf("\nSquare root of %d is: %.3f", num, sqRoot);
    }
}
