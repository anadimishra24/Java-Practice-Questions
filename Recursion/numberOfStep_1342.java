package Recursion;

import java.util.Scanner;

public class numberOfStep_1342 {

    public static int helper(int num, int steps){
        if(num == 0){
            return steps;
        }
        if(num % 2 == 0){
            return helper(num/2, steps+1);
        }
        else{
            return helper(num-1, steps+1);
        }
    }

    public static int numberOfSteps(int num) {
        return helper(num, 0);
    }

    public static void main(String[] args) {

        System.out.println("Leetcode Ques no: 1342. Number of Steps to Reduce a Number to Zero.\n");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter ypur number: ");
        int num = input.nextInt();

        int count = numberOfSteps(num);

        System.out.println("Number of steps to reduce " + num + " to zero is: " + count);
    }
}
