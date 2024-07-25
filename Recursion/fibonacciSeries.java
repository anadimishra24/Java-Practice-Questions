package Recursion;

import java.util.Scanner;

public class fibonacciSeries {

    private static int fibonacciN(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        return (fibonacciN(n-1)) + fibonacciN(n-2);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\nFibonacci Series using recursion.\n");
        System.out.print("\nEnter the number of term n: ");

        int n = input.nextInt();

        int nTerm = fibonacciN(n);

        System.out.println("The sum of " + n + "th term: " + nTerm);

    }
}
