package Introduction;

import java.util.Scanner;

public class Voting {

    // Method to check eligibility for voting
    public static boolean isEligibleForVote(int age) {
        return age >= 18; // Return true if age is 18 or older, false otherwise
    }

    public static void main(String[] args) {
        System.out.println("\n\tThis is the introduction of Java, and also learning the git control in IntelliJ IDE");
        System.out.println("\t>>>>> Here we also learn about the if-else conditions so far <<<<<< ");

        // Create a Scanner object for taking the user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age here: ");
        int age = scanner.nextInt(); // Read user input as an integer

        // Validate age and wait for 10 seconds
        if (age < 100 && age > 1) {
            System.out.println("Please wait for 5 seconds while we check your eligibility criteria for voting...");

            try {
                Thread.sleep(5000); // Sleep for 5 seconds (10000 milliseconds)
            } catch (InterruptedException e) {
                e.printStackTrace(); // Handle or log the exception appropriately
            }

            // Check eligibility and display appropriate message
            if (isEligibleForVote(age)) {
                System.out.println("Your age is: " + age + ". You are eligible to cast your vote.");
            } else {
                System.out.println("Your age is: " + age + ". You are not eligible to vote yet.");
            }
        } else {
            System.out.println("Invalid age entered. Please enter an age between 2 and 99.");
        }

        scanner.close(); // Close the scanner to release resources
    }
}
