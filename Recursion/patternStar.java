package Recursion;

public class patternStar {

    /* Approach II: This approach is useful for a printing pattern, but lil bit tricky because we are using
                       two functions of recursion.*/

    // Recursive method to print the pattern
    public static void printPattern(int n) {
        // Base case: stop recursion when n is less than 1
        if (n < 1) {
            return;
        }

        // Print stars for the current row
        printStars(n);

        // Print a newline character after printing stars
        System.out.println();

        // Recursive call for the next row
        printPattern(n - 1);
    }

    // Method to print stars for a given number of times
    public static void printStars(int count) {
        if (count <= 0) {
            return;
        }

        // Print a star and recursively call for the next star
        System.out.print("*");
        printStars(count - 1);
    }


    /* Approach I: Using two parameter for row and column, this approach is usefully to another similar question also
                   like bubble sort, selection sort, etc.*/
    private static void upperLeftTriangle(int row, int col) {
        // base case
        if(row == 0){
            return;
        }

        if(col < row){
            System.out.print("*");
            upperLeftTriangle(row, col+1);
        }
        else{
            System.out.println();
            // when we call for the next row, we start column from 0
            upperLeftTriangle(row-1, 0);
        }
    }
    public static void main(String[] args) {
        System.out.println("Print the '*' using recursion.\n");

        int row = 5;

        /* In this function we send two parameters, one is a row, and another one is a column*/
        System.out.println("Approach I: Print the pattern, with row and col as parameter.\n");
        upperLeftTriangle(row, 0);

        System.out.println("\n");

        System.out.println("Approach II: Print the pattern, with two recursive functions.\n");
        printPattern(row);
    }
}
