package Introduction;

import java.util.Arrays;
import java.util.Scanner;

public class Loops {

    // function for check the number is prime or not
    public static boolean isPrimeNumber(int num) {
        int i = 2;
        boolean isPrime = true; // Flag to track if the number is prime

        while (i <= num / 2) {
            if (num % i == 0) {
                isPrime = false;
                break; // Exit the loop if number is found to be divisible
            }
            i++;
        }

        if (num <= 1) {
            isPrime = false; // Numbers less than or equal to 1 are not prime
        }
        return isPrime;
    }

    // function for check the number is prime or not
    public static int[] isPrimeRange(int num1, int num2) {

        /* Array declarations and initialization
        // declarations
        int[] numbers;
        // Initializing arrays
        numbers = new int[5];
         */

        // Inline declaration and initialization
        int[] ans = new int[num2 - num1];     // Assuming the maximum possible number of primes in the range is num2 - num1
        int k = 0;

        for (int i = num1; i < num2; i++) {
            boolean isPrime = true;   // start of the new number we assume every number is prime number
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            // If prime, add to the result array
            if (isPrime && i > 1) { // Numbers less than or equal to 1 are not prime
                ans[k++] = i;
            }
        }
        // Trim the array to exact size
        return Arrays.copyOf(ans, k);
    }

    public static void main(String[] args) {

        System.out.println("\n\tThis class deals with the looping concepts in Java");
        System.out.println("\t >>>> Check the given number is prime or not using while loop <<<<");

        // Create a Scanner object for taking the user input
        Scanner sc = new Scanner(System.in);

        System.out.println("\t **************************** MENU *********************************");
        System.out.println("\t Select 1: if you want to check one number is prime or not");
        System.out.println("\t Select 2: if you want to check prime number between the range(1-100");
        System.out.println("\t ********************************************************************");

        System.out.print("\n Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.print("Enter your number: ");
                    int num = sc.nextInt();
                    if(isPrimeNumber(num)){
                        System.out.println("Your number " + num + " is a prime number.");
                    }else {
                        System.out.println("Your number " + num + " is not a prime number.");
                    }
                    break;

            case 2:
                System.out.println("Enter your range for finding all the prime numbers between range(a to b)");
                System.out.println("Enter your start number: ");
                int a = sc.nextInt();
                System.out.println("Enter your end number: ");
                int b = sc.nextInt();
                int[] range = isPrimeRange(a,b);
                System.out.println("All the prime number between range are: ");
                /* Instead of using this loop, we use inbuilt array function
                for (int j : range) {
                    System.out.print(j);
                }*/
                System.out.println(Arrays.toString(range));
                break;
            default:
                System.out.println("Please enter a valid choice.");
                break;
        }

        sc.close(); // Close the scanner to release resources
    }
}
