package Mathmetics;

import java.util.Arrays;
import java.util.Scanner;

public class primeOrNot {

    /* Sieve of Eratosthenes, which is a highly efficient algorithm to find all prime numbers up to a specified
       integer 𝑛.
    */
    public static boolean[] sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false; // 0 and 1 are not prime numbers

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int multiple = i * i; multiple <= n; multiple += i) {
                    isPrime[multiple] = false;
                }
            }
        }
        return isPrime;
    }


    /* check the given number is prime or not */
    private static boolean isPrime(int num) {
        /* The optimized way to check if a given number is prime is to check its divisibility only up to its square root.
           This process reduces the time consumption of the code.
           Why do we do this?
           Because when we check up to its square root, we don’t need to go further as we’ve already checked all possible
           divisors.
           For example, if we’re checking if 36 is a prime number, once we’ve checked divisibility by 4 (since 49 = 36),
           there’s no need to check divisibility by 9 (since 94 = 36) because it’s already been checked within the range
           of the square root.
           This method ensures that we don’t perform redundant checks, making the algorithm more efficient.
        */

        // here we do not include number 1 or less that prime or not
        if(num < 2){
            return false;
        }

        for (int i = 2; i*i <= num; i++) {
                if(num % i == 0){
                    return false;
                }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("\nFind the number is prime or not with optimizes way.\n");

        Scanner input = new Scanner(System.in);

        System.out.println("\t **************************** MENU *********************************");
        System.out.println("\t Select 1: if you want to check one number is prime or not");
        System.out.println("\t Select 2: if you want to check prime number between the range(1-100");
        System.out.println("\t ********************************************************************");

        System.out.print("\n Enter your choice: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.print("Enter your number: ");
                int num = input.nextInt();
                if (isPrime(num)) {
                    System.out.println("Your number " + num + " is a prime number.");
                } else {
                    System.out.println("Your number " + num + " is not a prime number.");
                }
            }
            case 2 -> {
                System.out.println("Enter the nth number till you want prime number: ");
                int n = input.nextInt();
                boolean[] primes = sieveOfEratosthenes(n);
                System.out.println("Prime numbers up to " + n + ":");
                for (int i = 2; i <= n; i++) {
                    if (primes[i]) {
                        System.out.print(i + " ");
                    }
                }
            }
            default -> System.out.println("Please enter a valid choice.");
        }
    }
}
